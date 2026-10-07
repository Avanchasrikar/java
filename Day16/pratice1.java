
public class pratice1 {
    public static void main(String[] args) {
        // int nums[][] = new int[4][];

        // nums[0] = new int[3];
        // nums[1] = new int[2];
        // nums[2] = new int[4];
        // nums[3] = new int[1];
        int nums[][] ={

            {10,20,30},
            {40,50},
            {60,70,80,90},
            {100}
        };

        for(int i=0; i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
