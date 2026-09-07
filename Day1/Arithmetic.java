public class Arithmetic {
    public static void main(String arg[]) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        // in Arithmetic +,-,/,% ,*

        int result = num1 + num2;
        int value = num1 % num2;
        //num3 = num3+1;
        num3 += 1;

        // num3++ ; // post increment 
        // ++num3;  pre increment
// difference detween post and pre is post will fetch the value and then increment 
// but in pre increment first we will increment and then fetch the value

        System.out.println(result);
        System.out.println(value);
        System.out.println(num3);

    }
}
