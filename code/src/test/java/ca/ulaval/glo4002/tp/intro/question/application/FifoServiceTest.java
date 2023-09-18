package ca.ulaval.glo4002.tp.intro.question.application;

import ca.ulaval.glo4002.tp.intro.question.domaine.Fifo;
import ca.ulaval.glo4002.tp.intro.question.domaine.Patient;
import jakarta.validation.constraints.AssertTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class FifoServiceTest {
    @Test
    public void whenCreated_mustBeEmpty(){
        Fifo fifo = new Fifo();
        assertTrue(fifo.isEmpty());
    }

    @Test
    public void whenAjouterPatient_mustNotBeEmpty(){
        Fifo fifo = new Fifo();
        Patient patient = new Patient();
        fifo.ajouterPatient(patient);
        assertFalse(fifo.isEmpty());
    }

    @Test
    public void givenManyPatient_WhenDefiler_returnFirstInElement(){
        Fifo fifo = new Fifo();
        Patient firstPatient =new Patient();
        Patient lastPatient = new Patient();
        fifo.ajouterPatient(firstPatient);
        fifo.ajouterPatient(lastPatient);
        assertEquals(firstPatient,fifo.defiler());

    }
}
