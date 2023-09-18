package ca.ulaval.glo4002.tp.intro.question.domaine;

import java.util.ArrayList;
import java.util.List;

public class Fifo {
    protected final List<Patient> patients = new ArrayList<Patient>();

    public Fifo(){}
    public boolean isEmpty() {
        return patients.isEmpty();
    }

    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public Patient defiler() {

        return patients.remove(0);
    }

    public boolean trouver(Patient patient) {
        return patients.contains(patient);
    }

    public int getLength() {
        return patients.size();
    }
}
