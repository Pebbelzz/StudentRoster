/**
 * Created by Josie on 7/10/2017.
 */
public class Student {

    //instance variables
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades = new int[3];

    //Accessor Methods(getters)

    //returns studentID
    public String getStudentID(){return studentID;}
    //returns firstName
    public String getFirstName(){return firstName;}
    //returns lastName
    public String getLastName(){return lastName;}
    //returns email
    public String getEmail(){return email;}
    //returns age
    public int getAge(){return age;}
    //returns grades
    public int[] getGrades(){return grades;}


    //Mutator Methods(setters)

    //sets studentID
    public void setStudentID(String id){this.studentID = id;}
    //sets firstName
    public void setFirstName(String fName){this.firstName = fName;}
    //sets lastName
    public void setLastName(String lName){this.lastName = lName;}
    //sets email
    public void setEmail(String emailAddress){this.email = emailAddress;}
    //sets age
    public void setAge(int howOld){this.age = howOld;}
    //sets grades
    public void setGrades(int[] scores){this.grades = scores;}


    //constructor for Student
    public Student(String id, String fName, String lName, String emailAddress, int howOld, int[]scores){
        setStudentID(id);
        setFirstName(fName);
        setLastName(lName);
        setEmail(emailAddress);
        setAge(howOld);
        setGrades(scores);
    }

    //prints Student data using getter methods
    public void print(){
        System.out.println(
                "Student ID: " + getStudentID() +
                        "\t| First Name: " + getFirstName() +
                        "\t| Last Name: " + getLastName() +
                        "\t| Email Address: " + getEmail() +
                        "\t| Age: " + getAge()
        );
    }
}
