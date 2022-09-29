package Test;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeImplement employeeMain = new EmployeeImplement();

        List<Employee> employees = employeeMain.addEmployee();

        Map<Team, List<Employee>> yody = employeeMain.deviceEmployeeToYody(employees);

        System.out.println(employeeMain.getLate(yody));

        System.out.println(employeeMain.getOver3Time(yody));
    }
}
