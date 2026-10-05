public class pratice5 {
    public static void main(String[] args) {
        int nums[] = {10,5, 20,8,20,15};
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE ;
        //Before my loop even starts, I have already chosen nums[0] as my current maximum."
        //So your current state before the loop is:10
    
        for(int i =1 ; i<nums.length;i++){

            if(nums[i] > max){
                max = nums[i];
            }
            else if (nums[i]!= max && nums[i]>secondMax) {
                secondMax = nums[i];
            }
        }
        System.out.println(secondMax);

    }
}
