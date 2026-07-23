import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 07-modern-java-features: StreamAPIMasterclass.java
 * ===================================================
 * Core Concepts Demonstrated:
 * 1. Java 8 Stream API pipeline: Source -> Intermediate Operations -> Terminal Operation.
 * 2. Intermediate Operations: `filter()`, `map()`, `sorted()`, `distinct()`.
 * 3. Terminal Operations: `collect()`, `reduce()`, `forEach()`, `count()`.
 * 4. Advanced Collectors: `Collectors.groupingBy()`, `Collectors.joining()`.
 */

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}

public class StreamAPIMasterclass {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       Stream API Masterclass Demo       ");
        System.out.println("=========================================");

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Engineering", 85000),
            new Employee("Bob", "HR", 55000),
            new Employee("Charlie", "Engineering", 95000),
            new Employee("David", "Marketing", 62000),
            new Employee("Emma", "Engineering", 105000),
            new Employee("Frank", "HR", 58000)
        );

        // --- 1. Filter High Earners (> $65,000) sorted by Salary Descending ---
        System.out.println("--- 1. High Earners (> $65,000) Sorted ---");
        List<Employee> highEarners = employees.stream()
            .filter(emp -> emp.getSalary() > 65000)
            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
            .collect(Collectors.toList());

        highEarners.forEach(emp -> System.out.println("  " + emp));

        // --- 2. Group Employees by Department ---
        System.out.println("\n--- 2. Grouped by Department ---");
        Map<String, List<Employee>> byDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        byDept.forEach((dept, empList) -> {
            System.out.println("  " + dept + ": " + empList);
        });

        // --- 3. Total Salary Sum using Reduce ---
        double totalSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .sum();

        System.out.println("\nTotal Salary Expense across all departments: $" + totalSalary);

        System.out.println("=========================================");
    }
}
