public class pratice2 {
    public static void main(String[] args) {
        int nums[][] ={
            {10, 20, 30},
            {5, 15},
            {2, 4, 6, 8},
            {100}
        };

        for(int i =0;i<nums.length;i++){
                int  sum = 0;
            for(int j =0; j<nums[i].length;j++){
                System.out.print(nums[i][j] +" ");
                sum += nums[i][j]; 
            }
             System.out.println("Row "+ (i + 1)+ " : "+sum);
            System.out.println(" ");
        }
        // for(int i =0;i<nums.length;i++){
        //     int  sum = 0;
        //      for(int j =0; j<nums[i].length;j++){
        //         sum += nums[i][j]; 
        //         System.out.print(sum);
        //      }
        //      System.out.println();
        // }
    }
}
