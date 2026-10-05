public class pratice6 {
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        // Given an integer array, move all 0s to the end while maintaining the relative order of the non-zero elements.
        int j =0 ;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]!=0){
               int  temp = nums[i];
               nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
             for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
