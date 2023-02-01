package si.flyp.oop_demos;

public class Teilnehmer {
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    
    // Standard Konstruktor
    public Teilnehmer() {
        this.name = "Teilnehmer";
    }

    // Überladung des Konstruktors
    public Teilnehmer(String name) {
        this.name = name;
    }
}
