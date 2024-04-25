import java.util.*;;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        // Task 1: Print name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Task 2: Add tasks
        System.out.println("Enter at least 5 tasks for the day:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Task " + (i + 1) + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        // Task 3: Print tasks in increasing order
        System.out.println("\nTasks in increasing order:");
        Collections.sort(tasks);
        printTasks(tasks);

        // Task 3: Print tasks in decreasing order
        System.out.println("\nTasks in decreasing order:");
        Collections.sort(tasks, Collections.reverseOrder());
        printTasks(tasks);

        // Task 4: Find repeated tasks
        Set<String> uniqueTasks = new HashSet<>();
        Set<String> repeatedTasks = new HashSet<>();
        for (String task : tasks) {
            if (!uniqueTasks.add(task)) {
                repeatedTasks.add(task);
            }
        }

        if (!repeatedTasks.isEmpty()) {
            System.out.println("\nRepeated tasks:");
            for (String task : repeatedTasks) {
                System.out.println(task);
            }
        } else {
            System.out.println("\nNo repeated tasks found.");
        }

        scanner.close();
    }

    // Utility method to print tasks
    private static void printTasks(List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
    
}
