package Test;

public enum Team {
    TEAM_1("Tổ 1"), TEAM_2("Tổ 2"), TEAM_3("Tổ 3"), TEAM_4("Tổ 4"), TEAM_5("Tổ 5"), TEAM_6("Tổ 6"), TEAM_7("Tổ 7"), TEAM_8("Tổ 8"), TEAM_9("Tổ 9"), TEAM_10("Tổ 10");

    private final String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
