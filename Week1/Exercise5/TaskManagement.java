package Exercise5;

class Task {

    int taskId;
    String taskName;
    String status;

    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    void display() {
        System.out.println(taskId + " "
                + taskName + " "
                + status);
    }
}
public class TaskManagement {

    static Task head = null;


    // Add Task
    static void addTask(int id,
                        String name,
                        String status) {

        Task newTask = new Task(id,
                name,
                status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }


    // Search Task
    static Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id)
                return temp;

            temp = temp.next;
        }

        return null;
    }


    // Traverse Tasks
    static void traverseTasks() {

        Task temp = head;

        while (temp != null) {

            temp.display();
            temp = temp.next;
        }
    }


    // Delete Task
    static void deleteTask(int id) {

        if (head == null) {
            return;
        }


        if (head.taskId == id) {

            head = head.next;

            System.out.println("Task Deleted");
            return;
        }


        Task current = head;
        Task previous = null;


        while (current != null &&
                current.taskId != id) {

            previous = current;
            current = current.next;
        }


        if (current == null) {

            System.out.println("Task Not Found");
            return;
        }


        previous.next = current.next;

        System.out.println("Task Deleted");
    }


    public static void main(String[] args) {

        addTask(101,
                "Design UI",
                "Pending");

        addTask(102,
                "Write Code",
                "In Progress");

        addTask(103,
                "Testing",
                "Completed");


        System.out.println("Task List:");

        traverseTasks();



        System.out.println("\nSearch Task:");

        Task t = searchTask(102);

        if (t != null)
            t.display();
        else
            System.out.println("Task Not Found");



        System.out.println("\nDelete Task:");

        deleteTask(102);



        System.out.println("\nAfter Deletion:");

        traverseTasks();

    }
}
