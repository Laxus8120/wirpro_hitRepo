/**
 * client
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class client {

    private String Name;
    private Map<String, List<String>> userTasks =new HashMap<>();;

    Scanner scanner = new Scanner(System.in);



    public void addTask(String Name) {
        this.Name = Name;
        System.out.println("Enter the task: ");
        String task = scanner.next();
        userTasks.computeIfAbsent(Name, k -> new ArrayList<>()).add(task);
        System.out.println("Task added successfully. of this user"+ userTasks);
    }


}