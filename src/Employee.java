public class Employee {
    private String[] employer = {"Архипова Таисия Николаевна", "Васильев Тимофей Александрович",
            "Беляев Леонид Владимирович", "Кузнецов Андрей Даниэльевич", "Трофимов Матвей Степанович",
            "Губанова Дарья Артёмовна", "Нечаева София Арсентьевна", "Никитин Александр Викторович",
            "Попов Артём Григорьевич", "Пахомова Елизавета Максимовна"};
    private byte department;
    private int wage;
    static int counter = 1;
    int id;
    public Employee(byte department, int wage) {
        id = counter++;
        setDepartment(department);
        setWage(wage);
    }

    public String[] getEmployer() {
        return employer;
    }

    public byte getDepartment() {
        return department;
    }

    public int getWage() {
        return wage;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
