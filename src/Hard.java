import java.util.Arrays;
import java.util.LinkedList;

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
        if (Employee.emptyID.size() != 0) {
            addItembyID(employer, Employee.emptyID.get(0));
            employer[Employee.emptyID.get(0)] = new Employee(department, salary);
            temp[Employee.emptyID.get(0)] = fullName;
            employer[0].setEmployer(temp);
        } else {
            employer[Employee.counter] = new Employee(department, salary);
            temp[Employee.counter - 1] = fullName;
            System.out.println(Arrays.asList(temp));
            employer[0].setEmployer(temp);
        }
        System.out.println("Сотрудник успешно добавлен в базу данных");
    }
    public static void delEmployerByID(Employee[] employer, int id) {
        removeItemList(employer, id);
    }
    public static void delEmployerByFullName(Employee[] employer, String fullName) {
        String[] temp = employer[0].getEmployer();
        int index = Arrays.asList(temp).indexOf(fullName);
        if (index == -1) {
            System.out.println("Не правильно введены ФИО");
        } else {
            removeItemList(employer, index);
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
            for (int j = 0; j < Employee.counter; j++) {
                if ((byte)i == employer[j].getDepartment()) {
                    System.out.println(employer[j].getDepartment() + ", " + employer[0].getEmployer()[j] + ";");
                }
            }
            System.out.println();
        }
    }
    public static void removeItemList(Employee[] employees, int id) {
        String[] tempFullName = employees[0].getEmployer();
        --Employee.counter;
        for (int i = id - 1; i < Employee.counter; i++) {
            employees[i] = employees[i + 1];
            tempFullName[i] = employees[0].getEmployer()[i + 1];
        }
        employees[Employee.counter] = null;
        tempFullName[Employee.counter] = null;
        Employee.emptyID.add(id);
        if (Employee.emptyID.size() > 1) {
            bubbleSort(Employee.emptyID);
        }
        System.out.println("Сотрудник успешно удален");
    }
    public static void addItembyID(Employee[] employees, int id) {
        String[] tempFullName = employees[0].getEmployer();
        for (int i = Employee.counter; i > id - 1; i--) {
            employees[i] = employees[i - 1];
            tempFullName[i] = employees[0].getEmployer()[i - 1];
        }
        employees[0].setEmployer(tempFullName);
    }
    public static void bubbleSort(LinkedList<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    temp = list.get(j - 1);
                    list.add(j - 1, list.get(j));
                    list.add(j, temp);
                }
            }
        }
    }
}
