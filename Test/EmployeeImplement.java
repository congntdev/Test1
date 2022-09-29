package Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImplement implements IEmployee {

    @Override
    public List<Employee> addEmployee() {
        var employeeList = new LinkedList<Employee>();
        employeeList.add(new Employee("1", "Laura", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of(LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25"))));
        employeeList.add(new Employee("2", "Maya", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("3", "James", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("4", "Jay", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("5", "Jessica", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("6", "Lulu", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("7", "Philip", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("8", "Johnson", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("9", "Rick", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15,2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        employeeList.add(new Employee("10", "Ben", LocalDate.parse("1998-05-06"), "Hai Duong", Team.TEAM_2,
                List.of((LocalDateTime.parse("2022-09-22T07:15, 2022-09-23T07:16, 2022-09-24T-7:20, 2022-09-25T07:25")))));
        return employeeList;
    }

    @Override
    public Map<Team, List<Employee>> deviceEmployeeToYody(List<Employee> yody) {
        return yody.stream()
                .collect(Collectors.groupingBy(
                        Employee::getTeam,
                        HashMap::new,
                        Collectors.mapping(Function.identity(), Collectors.toList())));
    }

    @Override
    public Map<Team, List<Employee>> getLate(Map<Team, List<Employee>> yody) {
        var employeeLate = new HashMap<Team, List<Employee>>();
        yody.forEach((team, employees) -> {
            employeeLate.put(team,
                    employees.stream()
                            .filter(employee -> employee.getTimeKeeping().stream().allMatch(employeeToLate -> employeeToLate.getHour() > 7))
                            .filter(employee -> employee.getTimeKeeping().stream().allMatch(employeeToLate -> employeeToLate.getMinute() < 30))
                            .collect(Collectors.toList()));
        });
        return employeeLate;
    }

    @Override
    public Map<Team, List<Employee>> getOver3Time(Map<Team, List<Employee>> yody) {
        var employeeOver3Time = new HashMap<Team, List<Employee>>();
        yody.forEach(((team, employees) -> {
            employeeOver3Time.put(team,
                    employees.stream()
                            .filter(employee -> employee.getTimeKeeping().stream()
                                    .skip(2).isParallel())
                            .collect(Collectors.toList()));
        }));
        return employeeOver3Time;
    }


}
