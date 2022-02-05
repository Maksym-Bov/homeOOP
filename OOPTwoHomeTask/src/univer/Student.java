package univer;

public class Student {

    private String firstName;
    private String lastName;
    private  double averageMark;

    public Student(String firstName, String lastName, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student() {

    }
    public  int getScholarship(double averageMark){
        return  (averageMark == 5) ? 100 : 80;
    }
}
