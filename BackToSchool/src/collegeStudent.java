public class collegeStudent extends Student {
    public int year;
    public String major;

    public collegeStudent(String idNum, double gpa, String name, int age, String gender, int year, String major)
    {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public String getmajor()
    {
        return major;
    }

    public int getyear()
    {
        return year;
    }

    public void setmajor(String major)
    {
        major = major;
    }

    public void setyear(int year)
    {
        year = year;
    }
    public String toString()
    {
        return super.toString() + "year:" + year + "major:" + major;
    }
}