public class Main {
    public static void main(String[] args) {
        Employee[] employees = FillBook.fillBook();
        Easy.easy(employees);
        Medium.medium(employees);
        Hard.hard(employees);
    }
}