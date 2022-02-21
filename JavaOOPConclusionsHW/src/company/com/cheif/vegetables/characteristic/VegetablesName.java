package company.com.cheif.vegetables.characteristic;

public enum VegetablesName {
    POTATO("Potato"),
    BEET("Beet"),
    ONION("Onion"),
    CABBAGE("Cabbage"),
    TOMATO("Tomato");
    String name;

    VegetablesName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

