public class Student extends Person
{
    private String idNum;
    private double gpa;

    public Student(String name, int age, String gender,
                   String idNum, double gpa)
    {
        super(name, age, gender);
        this.idNum = idNum;
        this.gpa = gpa;
    }

    public String getidNum()
    {
        return idNum;
    }

    public double getgpa()
    {
        return gpa;
    }


    public void setidNum(String idNum)
    {
        idNum = idNum;
    }

    public void setgpa(double gpa)
    {
        gpa = gpa;
    }
    public String toString()
    {
        return super.toString() + ", student id: " + idNum + ", gpa: " + gpa;
    }
}