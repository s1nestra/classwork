public class Teacher extends Person {
    private String chemistry;
    private String english;
    private String computerScience;
    private double salary;

    public Teacher(String name, int age, String gender, String Subject, double salary){
        super(name, age, gender);
        this.chemistry = Subject;
        this.english = Subject;
        this.computerScience = Subject;
        this.salary = salary;

    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(String computerScience) {
        this.computerScience = computerScience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "chemistry='" + chemistry + '\'' +
                ", english='" + english + '\'' +
                ", computerScience='" + computerScience + '\'' +
                ", salary=" + salary +
                '}';
    }
}
