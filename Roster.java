/**
 * Created by Josie on 7/10/2017.
 */
import java.util.ArrayList;
public class Roster {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main (String[] args){
        add( "1", "John", "Smith", "John1989@gmail.com", 20, 89,79, 59);
        add("2", "Suzan", "Erickson", "Erickson_1990@gmail.com", 19, 91, 82, 85);
        add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
        add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
        add("5", "Josie", "Anderson", "jand311@wgu.edu", 35, 90, 85, 93);
        print_all();
        print_invalid_emails();
        //loop through ArrayList and for each element print average grade:
        for(Student person : students){
            print_average_grade(person.getStudentID());
        }
        remove("3");
        remove("3");
        //expected: this should print a message saying such a studen
        //with this ID was not found
    }

    //adds Students
    public static void add(String id, String firstNm, String lastNm, String eml, int age, int grade1, int grade2, int grade3){
        int[] scores = {grade1, grade2, grade3};
        Student newStudent = new Student(id, firstNm, lastNm, eml, age, scores);
        students.add(newStudent);
    }

    //removes students from the roster by studentID
    public static void remove(String studentID){
        int index = getIndexFromID(studentID);
        //prints error msg if studentID was not found
        if(index == -1){
            System.out.println("A Student with StudentID of " + studentID + " was not found.");
        }
        else{
            students.remove(index);
        }
    }

    //prints a complete tab-separated list of student data using accessor methods
    public static void print_all(){
        for(int i=0; i < students.size(); i++){
            students.get(i).print();
        }
    }

    //prints a student's average grade by studentID
    public static void print_average_grade(String studentID){
        int index = getIndexFromID(studentID);
        //retrieves the array of grades for the student
        int[] arrForAvg = students.get(index).getGrades();
        int sum = 0;
        //averages the grades in the given array
        for(int j = 0; j < arrForAvg.length; j++){
            sum = sum + arrForAvg[j];
        }
        System.out.println("Average grade for StudentID# " + studentID + " is " + sum/3);
    }

    //verifies student email addresses and displays all invalid e-mail addresses
    //invalid email should include an @ sign and a period,
    // and doesn't include a space
    public static void print_invalid_emails(){
        String emailToCheck = "";
        String badEmails = "";
        for(int x = 0; x < students.size(); x++){
            emailToCheck = students.get(x).getEmail();

            if(emailToCheck.indexOf(" ") != -1){
                badEmails = badEmails + " " + emailToCheck;
            }
            else if(emailToCheck.indexOf("@") == -1){
                badEmails = badEmails + " " + emailToCheck;
            }
            else if(emailToCheck.indexOf("@") > emailToCheck.indexOf(".", emailToCheck.indexOf("@"))) {
                badEmails = badEmails + " " + emailToCheck;
            }
        }
        System.out.println("The following emails are bad: " + badEmails);
    }

    //loops through students ArrayList and finds index for given @param studentID
    public static int getIndexFromID(String studentID){
        //initialize indexNeeded @ -1
        int indexNeeded = -1;
        //finds the index of the student in
        // students ArrayList that matches the studentID given
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStudentID().equals(studentID)){
                indexNeeded = i;
            }
        }
        return indexNeeded;
    }
}
