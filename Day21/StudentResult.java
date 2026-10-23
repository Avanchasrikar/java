//Student Result Management

import java.util.Arrays;

class Student{
    int rollNo;
    String name;
   int[]  marks = new int[3];
    public Student(String name) {
        this.name = name;
        this.rollNo = 101;
        this.marks[0] = 2;
        this.marks[1] = 4;
        this.marks[2] = 6;
    }
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public void studentdetails(){
        System.out.println("roll no:" + rollNo);
        System.out.println("Name:"+ name);
        System.out.println("Marks:" + Arrays.toString(marks));
        System.out.println();
        System.out.println("Total:" + CalculateTotalMarks());
        System.out.println("Average:" + CalculateAverageMarks());

    }
    public int CalculateTotalMarks(){
        return this.marks[0] + this.marks[1] +this.marks[2];
    }
    public int CalculateAverageMarks(){
        return CalculateTotalMarks()/3;
        
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
      return Arrays.copyOf(marks, marks.length);
    }
    
    
    public void setMarks(int[] marks) {
    this.marks = marks;
}
}
    
    

public class StudentResult {
    public static void main(String[] args) {
        Student student1 = new Student("Srikar");

        // Constructor 2: Roll number and name
        Student student2 = new Student(102, "Ravi");

        // Constructor 3: Roll number, name, and marks
        Student student3 = new Student(
            103, "Ravi", new int[]{80, 75, 90}
        );

        Student[] students = {student1, student2, student3};

        for (int i = 0; i < students.length; i++) {
            System.out.println("========== Student " + (i + 1) + " ==========");
            students[i].studentdetails();
            System.out.println();
        }

    }
}
