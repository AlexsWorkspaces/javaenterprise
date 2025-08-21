public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String FULLNAME, String POSITION, String EMAIL, String PHONENUMBER, int SALARY, int AGE) {
        this.fullName = FULLNAME;
        this.position = POSITION;
        this.email = EMAIL;
        this.phoneNumber = PHONENUMBER;
        this.salary = SALARY;
        this.age = AGE;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(
                "ФИО: " + fullName +
                        "\nДолжность: " + position +
                        "\nemail: " + email +
                        "\nномер телефона: " + phoneNumber +
                        "\nзарплата: " + salary +
                        "\nвозраст: " + age +
                        "\n___________________________________"
        );

    }
}
