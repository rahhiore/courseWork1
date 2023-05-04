public class Easy {
    public static void easy(Employee[] employer) {
        printInfoAboutAll(employer);
        costAllWage(employer);
        minWage(employer);
        maxWage(employer);
        averageWage(employer);
        printFullName(employer);
    }
    public static void printInfoAboutAll(Employee[] employer) {
        System.out.println(Employee.counter);
        for (int i = 0; i < Employee.counter; i++) {
            System.out.println(employer[i].getId() + "; " + employer[0].getEmployer()[i]+ "; "
                    + employer[i].getDepartment() + "; " + employer[i].getSalary());
        }
    }
    public static void costAllWage(Employee[] employer) {
        int sumWage = 0;
        for (int i = 0; i < Employee.counter; i++) {
            sumWage += employer[i].getSalary();
        }
        System.out.println(sumWage);
    }
    public static void minWage(Employee[] employer) {
        int minWage = employer[0].getSalary();
        for (int i = 0; i < Employee.counter; i++) {
            if (minWage > employer[i].getSalary()) {
                minWage = employer[i].getSalary();
            }
        }
        System.out.println(minWage);
    }
    public static void maxWage(Employee[] employer) {
        int maxWage = employer[0].getSalary();
        for (int i = 0; i < Employee.counter; i++) {
            if (maxWage < employer[i].getSalary()) {
                maxWage = employer[i].getSalary();
            }
        }
        System.out.println(maxWage);
    }
    public static void averageWage(Employee[] employer) {
        int sumWage = 0;
        for (int i = 0; i < Employee.counter; i++) {
            sumWage += employer[i].getSalary();
        }
        System.out.println(sumWage / Employee.counter);
    }
    public static void printFullName(Employee[] employer) {
        for (int i = 0; i < Employee.counter; i++) {
            System.out.print(employer[0].getEmployer()[i]);
            if (i + 1 != Employee.counter) {
                System.out.print("; ");
            } else {
                System.out.println();
            }
        }
    }
}
