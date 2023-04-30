import java.util.Arrays;

public class Hard {
    public static void hard(Employee[] employer) {
        String fullName = "Трофимов Тимофей Даниэльевич";
        int salary = 100000;
        byte department = 3;
        int id = 5;
        addEmployer(employer, fullName, salary, department);
        delEmployerByID(employer, id);
        delEmployerByFullName(employer, "Беляев Леонид Владимирович");
        changeSalary(employer, "Кузнецов Андрей Даниэльевич");
        changeDepartment(employer, "Кузнецов Андрей Даниэльевич");
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
            System.out.println("Штат переполнен");
        }
    }
    public static void delEmployerByID(Employee[] employer, int id) {
        String[] temp = employer[0].getEmployer();
        temp[id - 1] = "0";
        employer[id -1].setSalary(0);
        employer[id -1].setDepartment((byte) 0);
        employer[0].setEmployer(temp);
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
        }
    }
    public static void changeSalary(Employee[] employer, String fullName) {
        String[] temp = employer[0].getEmployer();
        int index = Arrays.asList(temp).indexOf(fullName);
        if (index == -1) {
            System.out.println("Не правильно введены ФИО");
        } else {
            employer[index].setSalary(0);
        }
    }
    public static void changeDepartment(Employee[] employer, String fullName) {
        String[] temp = employer[0].getEmployer();
        int index = Arrays.asList(temp).indexOf(fullName);
        if (index == -1) {
            System.out.println("Не правильно введены ФИО");
        } else {
            employer[index].setDepartment((byte) 0);
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
