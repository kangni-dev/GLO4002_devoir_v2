package ca.ulaval.glo4002.tp.intro.question.domaine;

public class Clinic {
    private TriageType  doctorTriageType;
    private TriageType  radiologieTriageType;
    DoctorFifo doctorPatientsList = new DoctorFifo();
    RadiologieFifo radiologiePatientsList = new RadiologieFifo();
    
    public Clinic(TriageType doctorTriageType,TriageType radiologieTriageType) {
        this.doctorTriageType = doctorTriageType;
        this.radiologieTriageType = radiologieTriageType;
    }

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {
        // TODO
    }

    public TriageType getTypeOfDoctorTriage() {
        return this.doctorTriageType;
    }

    public TriageType getTypeOfRadiologieTriage() {
        return  TriageType.FIFO;
    }

    public void ajouterPatient(Patient patient) {
        doctorPatientsList.ajouterPatient(patient);
        if(patient.getVisibleSymptom()==VisibleSymptom.SPRAIN || patient.getVisibleSymptom()==VisibleSymptom.BROKEN_BONE){
            radiologiePatientsList.ajouterPatient(patient);
        }

    }

    public Fifo getDoctorPatientsList() {
        return doctorPatientsList;
    }

    public RadiologieFifo getRadiologiePatientsList() {
        return radiologiePatientsList;
    }

    public Patient defiler() {
        return doctorPatientsList.defiler();
    }

    public void setDoctorTriageType(TriageType triageType) {
        this.doctorTriageType = triageType;
        doctorPatientsList.setTypeTriage(triageType);
    }


    // D'autres méthodes peuvent être nécessaires
}
