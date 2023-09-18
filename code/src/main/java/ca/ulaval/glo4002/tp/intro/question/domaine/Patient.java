package ca.ulaval.glo4002.tp.intro.question.domaine;

public class Patient {

    private String name;
    private int gravity;

    private VisibleSymptom visibleSymptom ;
    public Patient(){

    }
    public Patient(String name,int gravity,VisibleSymptom visibleSymptom){
        this.name = name;
        this.gravity=gravity;
        this.visibleSymptom=visibleSymptom;
    }

    public VisibleSymptom getVisibleSymptom() {
        return this.visibleSymptom;
    }

    public int getGravity() {
        return gravity;
    }
}
