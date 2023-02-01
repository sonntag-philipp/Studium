package si.flyp.oop_demos;

import java.util.Scanner;

public class TutoriumVerwaltung {
    
    /**
     * - Methoden
     * - Klassen
     * - Konstruktoren
     * - Getter/Setter
     * - Arrays
     * - Static Methoden / Properties
     */

    public static void main(String[] args) {
        String name; // Deklaration
        name = "Tutorium 1"; // Initialisierung

        Tutor tut1; // Deklaration
        tut1 = new Tutor(); // Initialisierung

        Tutorium t1;
        t1 = new Tutorium(tut1, name);

        Scanner scanner = new Scanner(System.in);
        String tutoriumName = scanner.nextLine();

        // Erstellung und Initialisierung in einem Schritt.
        Tutorium t2 = new Tutorium(new Tutor("Sebastian"), tutoriumName);

        // Setzen des Namens des Tutors von t2
        t2.getTutor().setName("Robin");

        System.out.println("Name vor Bearbeitung: " + t2.getName());

        t2.setName("Tutorium - " + t2.getName());

        System.out.println("Name nach Bearbeitung: " + t2.getName());

        t2.addTeilnehmer(new Teilnehmer("Max"));
        t2.addTeilnehmer(new Teilnehmer("Moritz"));
        t2.addTeilnehmer(new Teilnehmer("Marius"));

        for (Teilnehmer teilnehmer : t2.getTeilnehmerListe()) {
            System.out.println("Teilnehmer: " + teilnehmer.getName());
        }
    }
}
