class calculator{





// Method overloading is nothing but using same Method Name  for different parameters
//  a, b become local variables and num becomes instance variable 

int num =5;
    public int add(int a ,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;

    }
    public int mul(int a ,int b){
        return a*b;
    }
    public int mul(int a ,int b,int c){
        return a*b*c;
    }


}

public class Overloading {
    public static void main(String[] args) {
        int num2 = 10; // it is a local variable 
        calculator obj =new calculator();  // obj is reference of class 
      int value =  obj.add(2, 4);
      int value2 = obj.mul(2, 3,2);
      System.out.println(" add  " + value +  "   mul  " + value2);

        
    }
    
}
