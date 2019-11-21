public enum DriverList {
    NOOB("Noob", 0.7), AMATEUR("Amateur", 0.8), SKILLED("Skilled", 0.9), PRO("Pro", 0.95), JESUSTAKESTHEWHEEL(
            "God himself", 1);

    private String nickname;
    private double skillLevel;

    DriverList(String nickname, double skillLevel) {
        this.nickname = nickname;
        this.skillLevel = skillLevel;
    }

}
