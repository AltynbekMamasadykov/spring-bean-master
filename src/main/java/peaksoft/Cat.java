package peaksoft;

public class Cat {
    public String name;


    public Cat() {
        System.out.println("miyau");
    }

    public Cat(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
