
public class pratice3 {
    public static void main(String[] args) {
        int nums[][] ={
            {1,2,3},
            {4,5,6}
        };
        int num[][] = new int[3][2];

        for(int i =0; i<2;i++){
            for(int j=0;j<3;j++){
              
              num[j][i] = nums[i][j];
            }
            
        }
        System.out.println("-------------------------------");
        for(int i =0; i<3;i++){
            for(int j=0;j<2;j++){
            
                System.out.print(num[i][j]);
               
            }
            System.out.println(" ");
        }
        
        
    }
}
