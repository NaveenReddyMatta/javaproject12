import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}

public class GroupTheEmployessByDep {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Naveen", "JAVA"),
                new Employee(2, "John Doe", "Engineering"),
                new Employee(3, "Jane Smith", "Marketing"),
                new Employee(4, "Mike Johnson", "Engineering"),
                new Employee(5, "Sarah Williams", "HR"),
                new Employee(6, "David Brown", "Marketing"));

     //   System.out.println(employeeList);
        Map<String,List<Employee> >groupingBYDep= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

  groupingBYDep.forEach((department , emplist) -> {
      System.out.println("Department: "+ department);
      emplist.forEach(System.out::println);
  } );


    }
}