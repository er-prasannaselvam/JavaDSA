public class Main { //Bubble Sorting
    public static void main(String[] args) {
        int nums[] = {9,7,6,8,4,9,3};
        System.out.println("Before sorting");
        for (int n : nums)
            System.out.print(n+" ");
        System.out.println();
        for (int i=0;i<nums.length;i++){  //outer loop for iteration
            for (int j=0;j<nums.length-1;j++){ //inner loop for comparing two values
                if (nums[j]>nums[j+1]){ //swap condition
                    nums[j]=nums[j]+nums[j+1];
                    nums[j+1]=nums[j]-nums[j+1];
                    nums[j]=nums[j]-nums[j+1];
                }
            }
        }
        System.out.println("after sorting");
        for (int n : nums)
            System.out.print(n+" ");
    }
}