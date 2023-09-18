package ca.ulaval.glo4002.tp.intro.question.domaine;

public class Clinic {
    private TriageType  doctorTriageType;
    private TriageType  radiologieTriageType;
    Fifo doctorPatientsList = new DoctorFifo();
    Fifo radiologiePatientsList = new RadiologieFifo();
    
    public Clinic(TriageType doctorTriageType,TriageType radiologieTriageType) {
        this.doctorTriageType = doctorTriageType;
        this.radiologieTriageType = radiologieTriageType;
    }

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {
        // TODO
    }

    public TriageType getTypeOfDoctorTriage() {
        return TriageType.FIFO;
    }

    public TriageType getTypeOfRadiologieTriage() {
        return  TriageType.FIFO;
    }

    public void ajouterPatient(Patient patient) {
        doctorPatientsList.ajouterPatient(patient);
        if(patient.getVisibleSymptom()==VisibleSymptom.SPRAIN){
            radiologiePatientsList.ajouterPatient(patient);
        }

    }

    public Fifo getDoctorPatientsList() {
        return doctorPatientsList;
    }

    public Fifo getRadiologiePatientsList() {
        return radiologiePatientsList;
    }

    public Patient depiler() {
        return doctorPatientsList.defiler();
    }


    // D'autres méthodes peuvent être nécessaires
}
