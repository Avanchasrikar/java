public class pratice2 {
    public static void main(String[] args) {
        int nums[][] = new int[3][3];
          int max = nums[0][0];
          int maxRow = 0;
        int maxColumn = 0;
        
        for(int i =0 ; i< 3;i++){
            for(int j = 0; j<3;j++){
                nums[i][j] = (int)(Math.random()*10);
            }

        }
        for(int i =0 ; i< 3;i++){
          
            
            for(int j = 0; j<3;j++){
               System.out.print(nums[i][j] + " ");

                if( nums[i][j] > max){
                    max = nums[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
                
            }

            System.out.println();
           
            
        }
          System.out.println("Largest = " + max);
        System.out.println("Row = " + maxRow);
        System.out.println("Column = " + maxColumn);
        
    }
}
