class student{
    int rollno;
    int marks;
    int age;
}

public class ArrauObj {
    public static void main(String[] args) {

        student s1 =new student();
        s1.rollno=21;
        s1.marks=100;
        s1.age=18;

        student s2 =new student();
        s2.rollno=20;
        s2.marks=95;
        s2.age=18;

        student s3 =new student();
        s3.rollno=27;
        s3.marks=90;
        s3.age=18;

        student students[] = new student[3];
        students[0] = s1;
        students[1]=s2;
        students[2]=s3;

        for(int i =0; i<students.length;i++){

            System.out.println(students[i].rollno +" " + students[i].marks);

        }



        
    }
}

