package si.flyp.oop_demos;

public class Student {
    
    public String getMatrikelNummer() {
        return matrikelNummer;
    }

    private String matrikelNummer;

    public Student(String matrikelNummer) {
        super();
        this.matrikelNummer = matrikelNummer;
    }
}
