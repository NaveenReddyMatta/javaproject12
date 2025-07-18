import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1 {
    private int id;
    private String name;
    private Integer marks;

    public Employee1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public Integer getMarks() { return marks; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + marks + "'}";
    }
}

public class partitionBypassFail {

    public static void main(String[] args) {

        List<Employee1> employeeList = Arrays.asList(
                new Employee1(1, "Naveen", 90 ),
                new Employee1(2, "John Doe",  60),
                new Employee1(3, "Jane Smith", 35),
                new Employee1(4, "Mike Johnson", 30),
                new Employee1(5, "Sarah Williams", 50),
                new Employee1(6, "David Brown", 60));

        Map<Boolean, List<Employee1>> emp= employeeList.stream().collect(Collectors.partitioningBy(i -> i.getMarks() >= 40));
       emp.entrySet().forEach(entey ->  System.out.println(entey.getKey()+"============"+entey.getValue()+ "/n") );

    }
}