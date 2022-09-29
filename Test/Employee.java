package Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private LocalDate birthday;
    private String homeTown;
    private Team team;

    private List<LocalDateTime> timeKeeping;

    public Employee() {
    }

    public Employee(String id, String name, LocalDate birthday, String homeTown, Team team, List<LocalDateTime> timeKeeping) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.homeTown = homeTown;
        this.team = team;
        this.timeKeeping = timeKeeping;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<LocalDateTime> getTimeKeeping() {
        return timeKeeping;
    }

    public void setTimeKeeping(List<LocalDateTime> timeKeeping) {
        this.timeKeeping = timeKeeping;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", homeTown='" + homeTown + '\'' +
                ", team=" + team +
                '}';
    }
}
