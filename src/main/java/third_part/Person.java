package third_part;

public class Person {
    private String name;
    private boolean isBlinded;

    public Person(String name, boolean isBlinded) {
        this.name = name;
        this.isBlinded = isBlinded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBlinded() {
        return isBlinded;
    }

    public void setBlinded(boolean blinded) {
        isBlinded = blinded;
    }
}
