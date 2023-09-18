package ca.ulaval.glo4002.tp.intro.question.domaine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClinicTest {
    private Clinic clinic;

    @BeforeEach
    public void setUp(){
        TriageType doctorTriageType = TriageType.FIFO;
        TriageType radiologieTriageType = TriageType.FIFO;
        clinic  = new Clinic(doctorTriageType,radiologieTriageType);
    }
    @Test
    public void givenParameters_WhenClinicCreated_typeOfParametersMustBeTriageType() {

        Assertions.assertSame(clinic.getTypeOfDoctorTriage(), TriageType.FIFO);
        Assertions.assertSame(clinic.getTypeOfRadiologieTriage(), TriageType.FIFO);
    }
    @Test
    public void givenPatientWithMigraine_whenAddPatientToClinic_doctorPatientsListMustNotBeEmpty() {
        Patient patient = new Patient("john",5,VisibleSymptom.MIGRAINE);
        clinic.ajouterPatient(patient);
        assertFalse(clinic.getDoctorPatientsList().isEmpty());
        assertFalse(clinic.getRadiologiePatientsList().trouver(patient));

    }
    @Test
    public  void givenPatientInDoctorPatientsList_whenAddSecondPatientToClinic_doctorPatientsListIncreaseOne(){
        Patient firstPatient = new Patient("john",5,VisibleSymptom.MIGRAINE);
        Patient secondPatient = new Patient("joe",10,VisibleSymptom.FLU);
        clinic.ajouterPatient(firstPatient);
        clinic.ajouterPatient(secondPatient);
        Assertions.assertEquals(clinic.getDoctorPatientsList().getLength(), 2);

    }
    @Test
    public void givenPatientWithSprain_WhenAddPatientToClinic_mustBeFirstOut(){
        Patient firstPatient = new Patient("john",5,VisibleSymptom.MIGRAINE);
        Patient secondPatient = new Patient("joe",10,VisibleSymptom.FLU);
        clinic.ajouterPatient(firstPatient);
        clinic.ajouterPatient(secondPatient);

        Patient sprainPatient = new Patient("john",7,VisibleSymptom.SPRAIN);
        clinic.ajouterPatient(sprainPatient);
        Assertions.assertEquals(clinic.depiler(), sprainPatient);
    }

    // D'autres méthodes peuvent être nécessaires
}
