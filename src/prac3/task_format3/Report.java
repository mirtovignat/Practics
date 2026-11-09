package prac3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-20s | %15s%n", "Сотрудник", "Зарплата");
        System.out.println("-----------------------------------------");

        for (Employee employee : employees) {
            System.out.printf("%-20s | %15.2f%n", employee.getFullName(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[3];
        employeesArray[0] = new Employee("Иванов Иван", 55000.50);
        employeesArray[1] = new Employee("Петров Петр", 72000.00);
        employeesArray[2] = new Employee("Сидорова Анна", 61500.75);

        generateReport(employeesArray);
    }
}