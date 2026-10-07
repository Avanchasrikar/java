public class pratice3 {
    public static void main(String[] args) {
        int nums[][] = {
                { 10, 25, 7 },
                { 4, 90 },
                { 15, 3, 45, 20 },
                { 100, 50 }
        };
       
        for(int i =0;i<nums.length;i++){
             int max = nums[i][0];
            for(int j=0;j<nums[i].length;j++){
            
                if(nums[i][j] > max){
                    max = nums[i][j];
                  
                }
                  
            }
              System.out.print(max);
            System.out.println(" ");
        }

    }
}
