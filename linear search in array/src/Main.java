
public class Main {
    public static void main(String[] args) {
       int array1[] = {2,4,1,8,4,3,9};
       int target = 8;

       for (int i = 0;i<array1.length;i++){
           if (array1[i]==target)
               System.out.println("The index value of the target element is:"+i);
       }
    }
}