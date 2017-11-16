public class testingClass {
    public static void main(String[] args) {

    Person bob = new Person("Coach Bob", 27, "M");
System.out.println("name:" + bob.getname() + " ," + "age:" + bob.getage() + " ," + "gender:" + bob.getgender());

    Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
System.out.println("name:" + lynne.getname() + " ," + "age:" + lynne.getage() + " ," + "gender:" + lynne.getgender() + " ," +"idNum:" + lynne.getidNum() + " ," + "gpa:" + lynne.getgpa());

    Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
System.out.println("name:" + mrJava.getname() + " ," + "age:" + mrJava.getage() + " ," + "gender:" + mrJava.getgender() + " ," + "Subject:" + mrJava.getComputerScience() + " ," + "salary:" + mrJava.getSalary());

    collegeStudent ima = new collegeStudent("UBC123", 4.0, "Ima Frosh", 18,"F",1, "English");
System.out.println("name:" + ima.getname() + " ," + "age:" + ima.getage() + " ," + "gender:" + ima.getgender() + " ," + "idNum:" + ima.getidNum() + " ," + "major:" + ima.getmajor() + " ," + "year;" + ima.getyear());
    }
}