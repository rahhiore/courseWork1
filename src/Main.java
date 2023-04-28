import java.util.Random;
public class Main {
    public static void main(String[] args) {
//        byte[] department = getRandomDepartment();
//        int[] wage = getRandomWage();
//        Employee[] employer = new Employee[10];
//        for (int i = 0; i < 10; i++) {
//            employer[i] = new Employee(department[i], wage[i]);
//        }
//        Easy.easy(employer);
//        Medium.medium(employer);
        Employee[] employees = FillBook.fillBook();
        Easy.easy(employees);
        Medium.medium(employees);
    }
//    public static byte[] getRandomDepartment() {
//        byte[] department = new byte[10];
//        Random randNum = new Random();
//        for (int i = 0; i < 10; i++) {
//            department[i] = (byte) (1 + randNum.nextInt(6 - 1));
//        }
//        return department;
//    }
//    public static int[] getRandomWage() {
//        int[] wage = new int[10];
//        Random randNum = new Random();
//        for (int i = 0; i < 10; i++) {
//            wage[i] = 50000 + randNum.nextInt(300000 - 50000);
//        }
//        return wage;
//    }

}