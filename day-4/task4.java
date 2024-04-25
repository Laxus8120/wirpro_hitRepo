// 1.Import Statements:

// These statements import necessary classes/interfaces from the java.sql package for database operations.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;


public class task4 {
    // 2.Class Variables: 

    // These are class-level variables for database connection, statement, prepared statement, and rows affected.
    static Connection con;
    static Statement stmt;
    static PreparedStatement pstmt;
    static int rows;
    
    public static void main(String[] args) {
        
        try {

            // 3.Database Connection:

            // Registers the MySQL JDBC driver and establishes a connection to the database wiproCyberSecurity on localhost with the username root and password Laxus8120
			Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "Laxus8120");

            // 4.Statement and Prepared Statement Creation:

            // Creates a statement object for executing SQL queries.
            stmt = con.createStatement();
            // Creates a prepared statement for executing parameterized SELECT queries.
            // SELECTING QUERIES
            // String Selecting = "SELECT `customerName` FROM customers";
            // pstmt = con.prepareStatement(Selecting);

            // ResultSet rs = pstmt.executeQuery(); //Execute the query and get the result set
            // Process the result set
            // while (rs.next()) {
            //     String customerName = rs.getString("customerName");
            //     System.out.println("Customer Name: " + customerName);
            // }

            // CRUD OPERATION

            // CREATION:
            try {
                // Prepare the SQL INSERT statement
                String sql = "INSERT INTO productlines (productLine, textDescription, htmlDescription, image) VALUES (?, ?, ?, ?)";
                pstmt = con.prepareStatement(sql);
                
                // Set parameters for the new product line
                pstmt.setString(1, "Classic HEmant");
                pstmt.setString(2, "Training for Cyber Security");
                pstmt.setString(3, ""); // Assuming htmlDescription is an empty string
                pstmt.setString(4, ""); // Assuming image is an empty string
                
                // Execute the INSERT statement
                int rowsInserted = pstmt.executeUpdate();
                System.out.println(rowsInserted);
                if (rowsInserted > 0) {
                    System.out.println("New product line created successfully.");
                } else {
                    System.out.println("Failed to create new product line.");
                }
            } catch (SQLException e) {
                System.err.println("Error creating new product line: " + e.getMessage());
            } finally {
                // Close the PreparedStatement
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        // Handle any errors
                    }
                }
            }

            // Read Queries:
            pstmt = con.prepareStatement("SELECT `customerName` FROM customers  WHERE customerNumber = 112");
            ResultSet rs = pstmt.executeQuery(); //Execute the query and get the result set
            while (rs.next()) {
                String customerName = rs.getString("customerName");
                System.out.println("Customer Name: " + customerName);
            }

            // 5.UPDATE Operation:

            // Sets the parameters in the prepared statement.
            // Sets the emp_addr to "mumbai" for emp_id equals 102. 
            pstmt = con.prepareStatement("Update customers SET customerName = ? WHERE customerNumber = ? ");
			pstmt.setString(1, "Hemant");
			pstmt.setInt(2,103);
            int rowsUpdated = pstmt.executeUpdate();

            // Check if the update was successful
            if (rowsUpdated > 0) {
                System.out.println("Customer  updated successfully.");
            } else {
                System.out.println("Failed to update customer name.");
            }
            

            // DELETION:
            try {
                pstmt = con.prepareStatement("DELETE FROM customers WHERE customerNumber = ?");
                pstmt.setInt(1, 114); // Set the customer number for the WHERE clause
    
                // Execute the delete query
                int rowsDeleted = pstmt.executeUpdate();
    
                // Check if the delete was successful
                if (rowsDeleted > 0) {
                    System.out.println("Customer deleted successfully.");
                } else {
                    System.out.println("Failed to delete customer.");
                }
            } catch (SQLException e) {
                System.err.println("Error creating new product line: " + e.getMessage());
            } finally {
                // Close the PreparedStatement
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (SQLException e) {
                        // Handle any errors
                    }
                }
            }
            // 6.Data Retrieval:
            // Executes a SELECT query to retrieve all rows from the Employee table.
            // ResultSet rs = stmt.executeQuery("SELECT * FROM Employee;");


            // // 7.Result Processing and Display:
            // // Iterates through the result set and prints the empId, empName, and empAddr.
			// while(rs.next())
			// {

			// 	System.out.println(rs.getInt(1)+"     | "+rs.getString(2)+"  |  "+rs.getString(3));
			// }
            // 8.Exception Handling and Cleanup:
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

    }
}
