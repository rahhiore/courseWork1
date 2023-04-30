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
        for (int i = 0; i < employer.length; i++) {
            System.out.println(employer[i].getId() + "; " + employer[0].getEmployer()[i]+ "; "
                    + employer[i].getDepartment() + "; " + employer[i].getSalary());
        }
    }
    public static void costAllWage(Employee[] employer) {
        int sumWage = 0;
        for (Employee employee : employer) {
            sumWage += employee.getSalary();
        }
        System.out.println(sumWage);
    }
    public static void minWage(Employee[] employer) {
        int minWage = employer[0].getSalary();
        for (Employee employee : employer) {
            if (minWage > employee.getSalary()) {
                minWage = employee.getSalary();
            }
        }
        System.out.println(minWage);
    }
    public static void maxWage(Employee[] employer) {
        int maxWage = employer[0].getSalary();
        for (Employee employee : employer) {
            if (maxWage < employee.getSalary()) {
                maxWage = employee.getSalary();
            }
        }
        System.out.println(maxWage);
    }
    public static void averageWage(Employee[] employer) {
        int sumWage = 0;
        for (Employee employee : employer) {
            sumWage += employee.getSalary();
        }
        System.out.println(sumWage / employer.length);
    }
    public static void printFullName(Employee[] employer) {
        for (int i = 0; i < employer.length; i++) {
            System.out.print(employer[0].getEmployer()[i]);
            if (i + 1 != employer.length) {
                System.out.print("; ");
            } else {
                System.out.println();
            }
        }
    }
}
