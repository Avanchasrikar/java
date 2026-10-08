class Student {
    String name;
    int rollNo;
    int marks;
}

public class Practice3 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Ravi";
        s1.rollNo = 101;
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Anu";
        s2.rollNo = 102;
        s2.marks = 35;

        Student s3 = new Student();
        s3.name = "Kiran";
        s3.rollNo = 103;
        s3.marks = 92;

        Student s4 = new Student();
        s4.name = "Sita";
        s4.rollNo = 104;
        s4.marks = 67;

        Student s5 = new Student();
        s5.name = "Rahul";
        s5.rollNo = 105;
        s5.marks = 40;

        Student[] students = {s1, s2, s3, s4, s5};

        Student topStudent = students[0];

        System.out.println("Students scoring 80+:");

        for (int i = 0; i < students.length; i++) {

            if (students[i].marks >= 80) {
                System.out.println(
                    students[i].name + " - " + students[i].marks
                );
            }

          
            if (students[i].marks > topStudent.marks) {
                topStudent = students[i];
            }
        }

        System.out.println();

        System.out.println("Failed students:");

        for (int i = 0; i < students.length; i++) {

            if (students[i].marks < 40) {
                System.out.println(
                    students[i].name + " - " + students[i].marks
                );
            }
        }

        System.out.println();

        System.out.println("Top student:");
        System.out.println(
            topStudent.name + " - " + topStudent.marks
        );
    }
}