class Student{
    String name;
    int rollno;
    int marks;
}
public class pratice1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Srikar";
        s1.rollno =4;
        s1.marks=100;

         Student s2 = new Student();
        s2.name="ram";
        s2.rollno =9;
        s2.marks=98;

         Student s3 = new Student();
        s3.name="vicky";
        s3.rollno =2;
        s3.marks=90;

         Student s4 = new Student();
        s4.name="ajay";
        s4.rollno =3;
        s4.marks=97;

         Student s5 = new Student();
        s5.name="Srikar";
        s5.rollno =6;
        s5.marks=99;

        Student Students[] = new Student[5];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;
         Students[3] = s4;
          Students[4] = s5;


        for(int i =0 ; i<Students.length;i++){
            System.out.println("Roll No:"+Students[i].rollno +", Name:"+Students[i].name + ", Marks:"+ Students[i].marks);
        }

    }
}
