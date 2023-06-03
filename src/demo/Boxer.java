package demo;

public class Boxer {

    private String name;
    private int age;
    private String gimName;

    public Boxer(String name, int age, String gimName) {
        this.name = name;
        this.age = age;
        this.gimName = gimName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGimName() {
        return gimName;
    }
}
