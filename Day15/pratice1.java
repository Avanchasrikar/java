
public class pratice1 {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];

        for(int i =0 ; i< 3;i++){
            for(int j = 0;j<3;j++){
                 nums[i][j] = (int)(Math.random() * 10 );
            }
        }
         for(int i =0 ; i< 3;i++){

            for(int j = 0;j<3;j++){
                System.out.print(nums[i][j] + " ");
            }
          System.out.println();
        }
        
        for (int i = 0; i < 3; i++) {

        int sum = 0;

    for (int j = 0; j < 3; j++) {

         sum = sum + nums[i][j];

    }

    System.out.println(sum);
}
System.out.println("___________________");
 for (int i = 0; i < 3; i++) {

        int sum = 0;

    for (int j = 0; j < 3; j++) {

         sum = sum + nums[j][i];

    }

    System.out.println(sum);
}
        

    }
}
