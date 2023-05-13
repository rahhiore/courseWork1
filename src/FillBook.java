import java.util.Random;

public class FillBook {
    public static Employee[] fillBook() {
        Employee[] employer = new Employee[30];
        for (int i = 0; i < 10; i++) {
            employer[i] = new Employee((byte) 0, 0);
        }
        getRandomDepartment(employer);
        getRandomWage(employer);
        return employer;
    }
    public static void getRandomDepartment(Employee[] employer) {
        Random randNum = new Random();
        for (int i = 0; i < Employee.counter; i++) {
            employer[i].setDepartment((byte) (1 + randNum.nextInt(6 - 1)));
        }
    }
    public static void getRandomWage(Employee[] employer) {
        Random randNum = new Random();
        for (int i = 0; i < Employee.counter; i++) {
            employer[i].setSalary(50000 + randNum.nextInt(300000 - 50000));
        }
    }

}
