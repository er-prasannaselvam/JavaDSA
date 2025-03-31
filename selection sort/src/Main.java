public class Main {
    public static void main(String[] args) {//take min value
        int nums[] = {3,1,5,6};
        int size = nums.length;
        int temp = 0;
        int minindex = 0;


        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");}
        System.out.println();

        for (int i=0;i<size-1;i++){  // to start iteration //size-1 for iterates upto index of the array
            minindex = i;
            for (int j=i+1;j<size;j++){ // loop to compare to values
                if (nums[minindex]>nums[j])  // condition to find minimum value in the array
                    minindex = j;  //haves lowest value index

            }
            temp = nums[minindex]; //swap
            nums[minindex]=nums[i]; //smaller values moves to beginning of the array
            nums[i]=temp;
        }
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        //take maxindex
        int nums1[] = {4,6,11,2,56};
        int maxindex = 0;
        int size1 = nums1.length;
        int temp1 = 0;

        System.out.println("before sorting");
        for (int num : nums1) {
            System.out.print(num + " ");}
        System.out.println();

        for (int i=size1-1;i>=0;i--){
            maxindex=i;
            for (int j=0;j<i;j++){
                if (nums1[j]>nums1[maxindex])
                    maxindex = j;
            }
            temp1=nums1[i];
            nums1[i]=nums1[maxindex];
            nums1[maxindex]=temp1;
        }
        System.out.println("After sorting");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}