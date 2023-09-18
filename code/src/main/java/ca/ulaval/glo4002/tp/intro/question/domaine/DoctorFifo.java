package ca.ulaval.glo4002.tp.intro.question.domaine;

public class DoctorFifo extends Fifo{
    @Override
    public void ajouterPatient(Patient patient) {
        ajouterPatient(patient,triageType);

    }
    public void setTypeTriage(TriageType triageType){
        this.triageType = triageType;

    }

    public void ajouterPatient(Patient patient,TriageType triageType){
        if(triageType==TriageType.GRAVITY){
            if(patient.getGravity()>=5){
               patients.add(0,patient);
            }
        }else{
            super.ajouterPatient(patient);
        }
        if(triageType==TriageType.FIFO){
            if(patient.getVisibleSymptom()==VisibleSymptom.SPRAIN) {
                patients.set(0, patient);
            }
            else{
                super.ajouterPatient(patient);
            }

        }
    }
}
