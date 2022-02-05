package univer;

public class Aspirant extends  Student {

    private static final String firstName = "";
    private static final String lastName = "";
    private static final double averageMark = 0;
    private String scientificWork;
    public  Aspirant(){}

    public Aspirant(String firstName, String lastName, double averageMark, String scientificWork) {
        super(firstName, lastName, averageMark);
        this.scientificWork = scientificWork;
    }
    @Override
    public  int getScholarship(double averageMark){
        return  (averageMark == 5) ? 200 : 180;

    }
}
