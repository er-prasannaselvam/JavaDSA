public class Main {
    public static void main(String[] args) {
       int nums[] = {11,48,69,78,81,91};
       int target = 78;
       int result = binarysearch(nums,target); //method calling
       if (result!=-1)
           System.out.println("index for the element is:"+result);
       else System.out.println("element not found");
    }

    public static int binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if (nums[mid]==target)
                return  mid;  // mid represent index value of the array
             else if (nums[mid]<target)
                left=mid+1; //skip Left hand side of the array
            else
                right=mid-1; //skip Right hand side of the array
        }
        return -1;
    }
}