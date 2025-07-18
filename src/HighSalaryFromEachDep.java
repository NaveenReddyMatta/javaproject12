import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employees(int id, String name, String department,double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary=salary;

    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

public class HighSalaryFromEachDep {

    public static void main(String[] args) {

        List<Employees> employeeList = Arrays.asList(
                new Employees(1, "Naveen", "JAVA",450000),
                new Employees(2, "John Doe", "Engineering",23500),
                new Employees(3, "Jane Smith", "Marketing",45000),
                new Employees(4, "Mike Johnson", "Engineering",54000),
                new Employees(5, "Sarah Williams", "HR" , 40000),
                new Employees(6, "David Brown", "Marketing",35000),
                new Employees(7, "Brown", "JAVA",35000));

        //   System.out.println(employeeList);
        Map<String,List<Employees> >groupingBYDep= employeeList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment));

        groupingBYDep.forEach((department , emplist) -> {
            System.out.println("Department: "+ department);
            emplist.stream()
            .max((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary())).ifPresent(System.out::println);

        } );
    }
}