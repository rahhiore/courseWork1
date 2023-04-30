import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = FillBook.fillBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Главное меню:");
            System.out.println("1 - Легкий уровень");
            System.out.println("2 - Средний уровень");
            System.out.println("3 - Тяжелый уровень");
            System.out.println("4 - Все уровни сразу");
            System.out.println("5 - Определенный метод");
            System.out.println("0 - Закрыть программу");
            int temp = sc.nextInt();
            if (temp != 0) {
                if (temp >= 1 && temp <= 4) {
                    chooseLevel(temp, employees);
                } else if (temp == 5) {
                    System.out.println();
                    drawHorizontalLine();
                    while (true) {
                        System.out.println("Меню с выбором определенного метода:");
                        System.out.println("1 - Распечатать информацию о всех сотрудниках");
                        System.out.println("2 - Суммарные расходы на зарплату, за месяц");
                        System.out.println("3 - Минимальный уровень зарплаты");
                        System.out.println("4 - Максимальный уровень зарплаты");
                        System.out.println("5 - Средний уровень зарплаты");
                        System.out.println("6 - Распечатать ФИО всех сотрудников");
                        System.out.println("7 - Првысить зарплату всем сотрудникам, на установленный %");
                        System.out.println("8 - Минимальный уровень зарплаты в выбранном отделе");
                        System.out.println("9 - Максимальный уровень зарплаты в выбранном отделе");
                        System.out.println("10 - Средний уровень зарплаты в выбранном отделе");
                        System.out.println("11 - Суммарные расходы на зарплату в выбранном, за месяц");
                        System.out.println("12 - Повысить зарплату всем сотрудникам в выбранном отделе, на установленный %");
                        System.out.println("13 - Распечатать информацию о всех сотрудниках в выбранном отделе");
                        System.out.println("14 - Распечатать информацию о сотрудниках с зарплатой ниже выбранной отметки");
                        System.out.println("15 - Распечатать информацию о сотрудниках с зарплатой выше выбранной отметки");
                        System.out.println("16 - Записать нового сотрудника");
                        System.out.println("17 - Удалить сотрудника с выбранным ID");
                        System.out.println("18 - Удалить сотрудника с выбранными ФИО");
                        System.out.println("19 - Поменять зарплату сотруднику с выбранными ФИО");
                        System.out.println("20 - Поменять отдел сотруднику с выбранными ФИО");
                        System.out.println("21 - Распечатать список сотрудников, в разрезе отделов");
                        System.out.println("0 - Вернуться в главное меню");
                        int num = sc.nextInt();
                        chooseMethod(num, employees, sc);
                        if (num == 0) {break;}
                    }

                } else {
                    System.out.println("Введено не верное число, необходимо ввести одно из чисел, который прописаны в меню");
                }
            } else {
                sc.close();
                break;
            }
        }
    }
    public static void drawHorizontalLine() {
        for (int i = 0; i < 150; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
    public static void chooseLevel(int num, Employee[] employees) {
        System.out.println();
        drawHorizontalLine();
        switch (num) {
            case 1:
                System.out.println("Легкий уровень");
                Easy.easy(employees);
                break;
            case 2:
                System.out.println("Средний уровень");
                Medium.medium(employees);
                break;
            case 3:
                System.out.println("Тяжелый уровень");
                Hard.hard(employees);
                break;
            case 4:
                System.out.println("Легкий уровень");
                Easy.easy(employees);
                System.out.println();
                drawHorizontalLine();
                System.out.println("Средний уровень");
                Medium.medium(employees);
                System.out.println();
                drawHorizontalLine();
                System.out.println("Тяжелый уровень");
                Hard.hard(employees);
                break;
        }

    }
    public static void chooseMethod(int num, Employee[] employees, Scanner sc) {
        System.out.println();
        drawHorizontalLine();
        switch (num) {
            case 1:
                Easy.printInfoAboutAll(employees);
                break;
            case 2:
                Easy.costAllWage(employees);
                break;
            case 3:
                Easy.minWage(employees);
                break;
            case 4:
                Easy.maxWage(employees);
                break;
            case 5:
                Easy.averageWage(employees);
                break;
            case 6:
                Easy.printFullName(employees);
                break;
            case 7:
                System.out.println("Введите процент, на который хотели бы увеличить зарплату всем сотрудникам:");
                Medium.salaryIncrease(employees, sc.nextInt());
                break;
            case 8:
                System.out.println("Введите отдел, в котором хотели бы узнать минимальый уровень зарплаты:");
                Medium.minWage(employees, sc.nextByte());
                break;
            case 9:
                System.out.println("Введите отдел, в котором хотели бы узнать максимальный уровень зарплаты:");
                Medium.maxWage(employees, sc.nextByte());
                break;
            case 10:
                System.out.println("Введите отдел, в котором хотели бы узнать средний уровень зарплаты:");
                Medium.averageWage(employees, sc.nextByte());
                break;
            case 11:
                System.out.println("Введите отдел, в котором хотели бы узнать суммарные затраты на зарплату:");
                Medium.costAllWage(employees, sc.nextByte());
                break;
            case 12:
                System.out.println("Введите отдел и %, в котором хотели бы повысить размер зарплаты, на заданный %:");
                Medium.salaryIncreaseDepartment(employees, sc.nextInt(), sc.nextByte());
                break;
            case 13:
                System.out.println("Введите отдел, в котором хотели бы увидеть информацию о сотрудниках:");
                Medium.printInfoAboutDepartment(employees, sc.nextByte());
                break;
            case 14:
                System.out.println("Введите размер зарплаты, для получения информации о сотрудниках у которых зарплата ниже этого уровня:");
                Medium.lessThan(employees, sc.nextInt());
                break;
            case 15:
                System.out.println("Введите размер зарплаты, для получения информации о сотрудниках у которых зарплата выше этого уровня:");
                Medium.moreThan(employees, sc.nextInt());
                break;
            case 16:
                System.out.println("Введите ФИО, зарплату и отдел сотрудника, для внесения его в базу данных");
                Hard.addEmployer(employees, sc.nextLine(), sc.nextInt(), sc.nextByte());
                break;
            case 17:
                System.out.println("Введите ID, для удаление сотрудника из базы данных");
                Hard.delEmployerByID(employees, sc.nextByte());
                break;
            case 18:
                System.out.println("Введите ФИО, для удаление сотрудника из базы данных");
                Hard.delEmployerByFullName(employees, sc.nextLine());
                break;
            case 19:
                System.out.println("Введите ФИО и зарплату, для изменения зарплаты сотрудника");
                Hard.changeSalary(employees, sc.nextLine(), sc.nextInt());
                break;
            case 20:
                System.out.println("Введите ФИО и отдел, для изменения отдела сотрудника");
                Hard.changeDepartment(employees, sc.nextLine(), sc.nextByte());
                break;
            case 21:
                Hard.employersList(employees);
                break;
        }
    }
}