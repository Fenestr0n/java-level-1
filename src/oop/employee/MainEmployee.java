package oop.employee;

public class MainEmployee {
    public static void main(String[] args) {
//        Employee employee = new Employee("John", "Director", 100_000);
//        employee.showInfo();

        String[] employees = getEmployees();

//        Добавить сотрудника
        String[] newArray = new String[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newArray[i] = employees[i];
        }
        newArray[newArray.length - 1] = "James";
        employees = newArray;

//        Удалить сотрудника
        employees[0] = null;
        String[] newestArray = new String[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            String employee = employees[i];
            if (employee != null) {
                newestArray[j] = employee;
                j++;
            }
        }
        employees = newestArray;



        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    private static String[] getEmployees() {
        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Olivia";
        employees[2] = "Emma";
        employees[3] = "Max";
        employees[4] = "Nick";
        return employees;
    }
}
