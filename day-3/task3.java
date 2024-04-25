import java.util.HashMap;
import java.util.Scanner;

public class task3 {

    private static HashMap<Integer, String> map = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("New User First Register Your self");
        System.out.println("Enter your Name");
        String Name = scanner.nextLine();
        System.out.println("Enter your Password");
        int Password = scanner.nextInt();
        System.out.println("Welcome " + Name);
        map.put(Password,Name);

        System.out.println("1. Press 1 if you are a Client ?");
        System.out.println("2. Press 2 if you are a Visitor ?");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (authentication()){
                    scanner.nextLine();
                    System.out.println("Enter your name before adding task");
                    String client = scanner.nextLine();
                    client user = new client();
                    user.addTask(client);
                }
                break;
            case 2:
                authentication();
                break;
            default:
                break;
        }
    }

    public static boolean authentication(){
        System.out.println("Authenticate Yourself");
        scanner.nextLine();
        System.out.println("Enter your Name");
        String Name = scanner.nextLine();
        System.out.println("Enter your Password");
        int Password = scanner.nextInt();
        if(map.containsKey(Password)){
            System.out.println("Welcome " + Name);
            return true;
        }else{
            System.out.println("Not a valid user " + Name);
        }
        return false;
    }
}
