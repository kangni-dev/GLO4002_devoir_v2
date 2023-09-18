package ca.ulaval.glo4002.tp.intro.question.domaine;

public class DoctorFifo extends Fifo{
    @Override
    public void ajouterPatient(Patient patient) {
        if(patient.getVisibleSymptom()==VisibleSymptom.SPRAIN) {
            patients.set(0, patient);
        }
        else{
            super.ajouterPatient(patient);
        }
    }
}
