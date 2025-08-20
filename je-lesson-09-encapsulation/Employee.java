public class Employee {
    private final String FULLNAME;
    private final String POSITION;
    private final String EMAIL;
    private final String PHONENUMBER;
    private final int SALARY;
    private final int AGE;

    public Employee(String FULLNAME, String POSITION, String EMAIL, String PHONENUMBER, int SALARY, int AGE) {
        this.FULLNAME = FULLNAME;
        this.POSITION = POSITION;
        this.EMAIL = EMAIL;
        this.PHONENUMBER = PHONENUMBER;
        this.SALARY = SALARY;
        this.AGE = AGE;
    }

    public int getAGE() {
        return AGE;
    }

    public void getInfo() {
        System.out.println(
                "ФИО: " + FULLNAME +
                        "\nДолжность: " + POSITION +
                        "\nemail: " + EMAIL +
                        "\nномер телефона: " + PHONENUMBER +
                        "\nзарплата: " + SALARY +
                        "\nвозраст: " + AGE +
                        "\n___________________________________"
        );

    }
}
