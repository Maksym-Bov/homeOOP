package company.com.air.plane.characteristic;

public enum PlaneName {
    BOEING777("Boeing 777"),
    BOEING737("Boeing 737"),
    AN225("AN 225");

    private String name;
    PlaneName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}


