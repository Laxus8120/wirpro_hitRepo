import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static List<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Search Task");
            System.out.println("5. Exit");
            System.out.println("6. Print Array");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    updateTask();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    searchTask();
                    break;
                case 5:
                    exit = true;
                    break;
                case 6:
                    Print();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
        scanner.close();
    }


    public static void Print(){
        System.out.println("Print Task successfully.");
        System.out.println(tasks);
    }

    public static void addTask() {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public static void updateTask() {
        System.out.print("Enter the index of the task to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter the new task: ");
            String newTask = scanner.nextLine();
            tasks.set(index, newTask);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid index. No task found at index " + index + ".");
        }
    }

    public static void deleteTask() {
        System.out.print("Enter the index of the task to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (index >= 0 && index < tasks.size()) {
            String deletedTask = tasks.remove(index);
            System.out.println("Task '" + deletedTask + "' deleted successfully.");
        } else {
            System.out.println("Invalid index. No task found at index " + index + ".");
        }
    }

    public static void searchTask() {
        System.out.print("Enter the task to search: ");
        String searchTask = scanner.nextLine();
        int index = tasks.indexOf(searchTask);
        if (index != -1) {
            System.out.println("Task '" + searchTask + "' found at index " + index + ".");
        } else {
            System.out.println("Task '" + searchTask + "' not found.");
        }
    }
}

