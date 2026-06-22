package Exercise4;

class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name,
             String position, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void display() {
        System.out.println(employeeId + " "
                + name + " "
                + position + " "
                + salary);
    }
}
public class EmployeeManagement {

    static Employee employees[] = new Employee[10];
    static int count = 0;


    // Add Employee
    static void addEmployee(Employee e) {

        if (count < employees.length) {

            employees[count] = e;
            count++;

            System.out.println("Employee Added");
        }
        else {
            System.out.println("Array Full");
        }
    }


    // Search Employee
    static Employee searchEmployee(int id) {

        for(int i=0;i<count;i++) {

            if(employees[i].employeeId == id)
                return employees[i];
        }

        return null;
    }



    // Traverse Employees
    static void traverseEmployees() {

        for(int i=0;i<count;i++) {

            employees[i].display();
        }
    }



    // Delete Employee
    static void deleteEmployee(int id) {

        int index = -1;

        for(int i=0;i<count;i++) {

            if(employees[i].employeeId == id) {

                index = i;
                break;
            }
        }


        if(index != -1) {

            for(int i=index;i<count-1;i++) {

                employees[i] = employees[i+1];
            }

            employees[count-1] = null;
            count--;

            System.out.println("Employee Deleted");
        }
        else {

            System.out.println("Employee Not Found");
        }

    }



    public static void main(String[] args) {

        addEmployee(new Employee(101,
                "Rahul",
                "Manager",
                70000));

        addEmployee(new Employee(102,
                "Priya",
                "Developer",
                60000));

        addEmployee(new Employee(103,
                "Kiran",
                "Tester",
                50000));


        System.out.println("\nEmployees:");

        traverseEmployees();



        System.out.println("\nSearch Employee:");

        Employee emp = searchEmployee(102);

        if(emp != null)
            emp.display();
        else
            System.out.println("Not Found");



        deleteEmployee(102);


        System.out.println("\nAfter Deletion:");

        traverseEmployees();

    }
}
