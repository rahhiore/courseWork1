public class Employee {
    private String[] employer = {"Архипова Таисия Николаевна", "Васильев Тимофей Александрович",
            "Беляев Леонид Владимирович", "Кузнецов Андрей Даниэльевич", "Трофимов Матвей Степанович",
            "Губанова Дарья Артёмовна", "Нечаева София Арсентьевна", "Никитин Александр Викторович",
            "Попов Артём Григорьевич", "Пахомова Елизавета Максимовна"};
    private byte department;
    private int salary;
    static int counter = 1;
    int id;
    public Employee(byte department, int wage) {
        id = counter++;
        setDepartment(department);
        setSalary(wage);
    }

    public String[] getEmployer() {
        return employer;
    }

    public byte getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int wage) {
        this.salary = wage;
    }

    public void setEmployer(String[] employee) {
        this.employer = new String[employee.length];
        System.arraycopy(employee, 0, this.employer, 0, employee.length);
    }
}
