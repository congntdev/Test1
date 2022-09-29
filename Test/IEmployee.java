package Test;

import java.util.List;
import java.util.Map;

public interface IEmployee {
    List<Employee> addEmployee();

    Map<Team, List<Employee>> deviceEmployeeToYody(List<Employee> yody);

    Map<Team, List<Employee>> getLate(Map<Team, List<Employee>> yody);

    Map<Team, List<Employee>> getOver3Time(Map<Team, List<Employee>> yody);


}
