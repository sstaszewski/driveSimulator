public enum SkillLevel {
    NOOB("Noob", 0.7), AMATEUR("Amateur", 0.8), SKILLED("Skilled", 0.9), PRO("Pro", 0.95), JESUSTAKESTHEWHEEL(
            "God himself", 1);

    private String nickname;
    private double skillLevel;

    SkillLevel(String nickname, double skillLevel) {
        this.nickname = nickname;
        this.skillLevel = skillLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }
}
