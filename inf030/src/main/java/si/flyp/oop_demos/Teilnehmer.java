package si.flyp.oop_demos;

public class Teilnehmer extends Student {
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    
    // Standard Konstruktor
    public Teilnehmer() {
        super("00000000");
        this.name = "Teilnehmer";
    }

    // Überladung des Konstruktors
    public Teilnehmer(String name, String matrikelNummer) {
        super(matrikelNummer);
        this.name = name;
    }
}
