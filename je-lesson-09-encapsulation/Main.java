public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Smith", "Software Engineer", "john.smith@example.com", "+7234567898", 2000, 42);
        employees[1] = new Employee("Alice Brown", "Manager", "alice.brown@example.com", "+7876543212", 3500, 35);
        employees[2] = new Employee("Michael Johnson", "Designer", "michael.johnson@example.com", "+71223344555", 1800, 25);
        employees[3] = new Employee("Emma Wilson", "QA Engineer", "emma.wilson@example.com", "+79887766555", 2200, 30);
        employees[4] = new Employee("Robert Davis", "DevOps Engineer", "robert.davis@example.com", "+70293847563", 3000, 47);

        for (Employee employee : employees) {
            if (employee.getAGE() > 40) {
                employee.getInfo();
            }
        }
    }
}
