package si.flyp.oop_demos;

public class Tutor {
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    
    // Standard Konstruktor
    public Tutor() {
        this.name = "Tutor";
    }

    // Überladung des Konstruktors
    public Tutor(String name) {
        this.name = name;
    }
}
