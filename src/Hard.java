import java.util.Arrays;
public class Hard {
    public static void hard(Employee[] employer) {
        String fullName = "Трофимов Тимофей Даниэльевич";
        int salary = 100000;
        byte department = 3;
        int id = 5;
        delEmployerByID(employer, id);
        delEmployerByFullName(employer, "Беляев Леонид Владимирович");
        addEmployer(employer, fullName, salary, department);
        changeSalary(employer, "Кузнецов Андрей Даниэльевич", salary);
        changeDepartment(employer, "Кузнецов Андрей Даниэльевич", department);
        employersList(employer);
    }
    public static void addEmployer(Employee[] employer, String fullName, int salary, byte department) {
        String[] temp = employer[0].getEmployer();
        boolean check = false;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("0")) {
                temp[i] = fullName;
                employer[i].setSalary(salary);
                employer[i].setDepartment(department);
                System.out.println("Сотрудник успешно добавлен");
                check = true;
                break;
            }
        }
        employer[0].setEmployer(temp);
        if (!check) {
            System.out.println("Штат заполнен, новый сотрудник не был добавлен");
        }
    }
    public static void delEmployerByID(Employee[] employer, int id) {
        String[] temp = employer[0].getEmployer();
        temp[id - 1] = "0";
        employer[id -1].setSalary(0);
        employer[id -1].setDepartment((byte) 0);
        employer[0].setEmployer(temp);
        System.out.println("Сотрудник успешно удален");
    }
    public static void delEmployerByFullName(Employee[] employer, String fullName) {
        String[] temp = employer[0].getEmployer();
        int index = Arrays.asList(temp).indexOf(fullName);
        if (index == -1) {
            System.out.println("Не правильно введены ФИО");
        } else {
            temp[index] = "0";
            employer[index].setSalary(0);
            employer[index].setDepartment((byte) 0);
            employer[index].setEmployer(temp);
            System.out.println("Сотрудник успешно удален");
        }
    }
    public static void changeSalary(Employee[] employer, String fullName, int salary) {
        String[] temp = employer[0].getEmployer();
        int index = Arrays.asList(temp).indexOf(fullName);
        if (index == -1) {
            System.out.println("Не правильно введены ФИО");
        } else {
            employer[index].setSalary(salary);
            System.out.println("Зарплата успешно изменена");
        }
    }
    public static void changeDepartment(Employee[] employer, String fullName, byte department) {
        String[] temp = employer[0].getEmployer();
        int index = Arrays.asList(temp).indexOf(fullName);
        if (index == -1) {
            System.out.println("Не правильно введены ФИО");
        } else {
            employer[index].setDepartment(department);
            System.out.println("Отдел успешно изменен");
        }
    }
    public static void employersList(Employee[] employer) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Отдел №" + i);
            for (int j = 0; j < employer.length; j++) {
                if ((byte)i == employer[j].getDepartment()) {
                    System.out.println(employer[j].getDepartment() + ", " + employer[0].getEmployer()[j] + ";");
                }
            }
            System.out.println();
        }
    }
}
