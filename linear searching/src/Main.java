public class Main { //linear searching
    public static void main(String[] args) {
        int[] array = {8,9,6,7,1,3,8,3,19};
        int target = 19;
        for (int i =0;i<array.length;i++){
            if (array[i]==target){
                System.out.println("value found"+ " "+array[i]);
            }
        }
    }
}