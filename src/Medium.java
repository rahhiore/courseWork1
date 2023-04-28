public class Medium {

    public static void medium(Employee[] employer) {
        int percent = 10;
        salaryIncrease(employer, percent);
        byte department = 2;
        minWage(employer, department);
        maxWage(employer, department);
        costAllWage(employer, department);
        averageWage(employer, department);
        salaryIncreaseDepartment(employer, percent, department);
        printInfoAboutDepartment(employer, department);
        int wage = 150000;
        lessThan(employer, wage);
        moreThan(employer, wage);
    }
    public static void salaryIncrease(Employee[] employer, int percent) {
        for (Employee employee : employer) {
            employee.setWage(employee.getWage() * (1 +percent / 100));
            System.out.print(employee.getWage() + " ");
        }
        System.out.println();
    }
    public static void minWage(Employee[] employer, byte department) {
        int minWage = 0;
        for (Employee employee : employer) {
            if (employee.getDepartment() == department) {
                if (minWage == 0) {
                    minWage = employer[0].getWage();
                } else if (minWage > employee.getWage()) {
                    minWage = employee.getWage();
                }
            }
        }
        System.out.println(minWage);
    }
    public static void maxWage(Employee[] employer, byte department) {
        int maxWage = 0;
        for (Employee employee : employer) {
            if (employee.getDepartment() == department) {
                if (maxWage == 0) {
                    maxWage = employer[0].getWage();
                } else if (maxWage < employee.getWage()) {
                    maxWage = employee.getWage();
                }
            }
        }
        System.out.println(maxWage);
    }
    public static void costAllWage(Employee[] employer, byte department) {
        int sumWage = 0;
        for (Employee employee : employer) {
            if (employee.getDepartment() == department) {
                sumWage += employee.getWage();
            }
        }
        System.out.println(sumWage);
    }
    public static void averageWage(Employee[] employer, byte department) {
        int sumWage = 0;
        int count = 0;
        for (Employee employee : employer) {
            if (employee.getDepartment() == department) {
                sumWage += employee.getWage();
                count++;
            }
        }
        System.out.println(sumWage / count);
    }
    public static void salaryIncreaseDepartment(Employee[] employer, int percent, byte department) {
        for (Employee employee : employer) {
            if (employee.getDepartment() == department) {
                employee.setWage(employee.getWage() * (1 + percent / 100));
                System.out.print(employee.getWage() + " ");
            }
        }
        System.out.println();
    }
    public static void printInfoAboutDepartment(Employee[] employer, byte department) {
        for (int i = 0; i < employer.length; i++) {
            if (employer[i].getDepartment() == department) {
                System.out.println(employer[i].getId() + "; " + employer[0].getEmployer()[i]
                        + "; " + employer[i].getWage());
            }
        }
    }
    public static void lessThan(Employee[] employer, int wage) {
        for (int i = 0; i < employer.length; i++) {
            if (employer[i].getWage() < wage) {
                System.out.println(employer[i].getId() + "; " + employer[0].getEmployer()[i]
                        + "; " + employer[i].getWage());
            }
        }
    }
    public static void moreThan(Employee[] employer, int wage) {
        for (int i = 0; i < employer.length; i++) {
            if (employer[i].getWage() > wage) {
                System.out.println(employer[i].getId() + "; " + employer[0].getEmployer()[i]
                        + "; " + employer[i].getWage());
            }
        }
    }
}
