package si.flyp.oop_demos;

import java.util.LinkedList;
import java.util.List;

public class Tutorium {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public List<Teilnehmer> getTeilnehmerListe() {
        return teilnehmerListe;
    }

    private Tutor tutor;
    private String name;
    private List<Teilnehmer> teilnehmerListe = new LinkedList<Teilnehmer>();

    public Tutorium(Tutor tutor, String name) {
        this.tutor = tutor;
        this.name = name;
    }

    public void addTeilnehmer(Teilnehmer teilnehmer) {
        teilnehmerListe.add(teilnehmer);
    }

    public static Tutorium erstelleTutorium() {
        // System.out.println(tutor.getName()); // Geht nicht, da tutor nur innerhalb einer Objektinstanz existiert.

        return new Tutorium(new Tutor(), "Tutorium 1");
    }
}
