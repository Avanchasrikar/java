    class Student{
        public int calculateResult(int marks){
            return marks;
        }
        public  int calculateResult(int marks1, int marks2){
            return (marks1 + marks2)/ 2;
        }
        public  int calculateResult(int marks1, int marks2, int marks3){
            return (marks1 + marks2 + marks3)/3;
        }
    }
    public class pratice3 {
        public static void main(String[] args) {
            Student obj = new Student();
        int r1 =  obj.calculateResult(80);
        int r2 =   obj.calculateResult(80, 90);
        int r3 =  obj.calculateResult(80, 90, 70);

            System.out.println(r1 + ": " + r2 + " : " + r3);
        }
    }
