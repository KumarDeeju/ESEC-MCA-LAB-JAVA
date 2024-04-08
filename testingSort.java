import java.util.List;

public class Employee {

    private final String name;
    private final int Salary;

    public Employee(String name, int Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    // getter function beacause read for public value
    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", Salary=").append(Salary);
        sb.append('}');
        return sb.toString();
    }

}

public class testingSort {
    public static void main(String[] args) {
        List<Employee> employee = List.of(
                new Employee("Arjun", 100),
                new Employee("Amit", 10000),
                new Employee("Rahul", 500),
                new Employee("Prakash", 200),
                new Employee("Suman", 1000));

        employee.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }

}
