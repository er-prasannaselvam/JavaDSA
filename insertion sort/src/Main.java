public class Main {
    public static void main(String[] args){
        int nums[]={51,98,63,11,3,78};
        System.out.println("Before sorting");
        for (int n:nums){
            System.out.print(n+" ");
        }
        System.out.println();
        for (int i=1;i<nums.length;i++){
            int key = nums[i];
            int j=i-1;
            while (j>=0 && nums[j] > key){
                nums[j+1]=nums[j]; //shifting
                j--;
            }
            nums[j+1]=key;
        }
        System.out.println("After sorting");
        for (int n:nums){
            System.out.print(n+" ");
        }
    }

}