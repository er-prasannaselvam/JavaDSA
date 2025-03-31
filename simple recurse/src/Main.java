import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       recurse(0);
    }
    public static void recurse( int i) {
        if (i<=20){
            System.out.println(i);
            i++;
            recurse(i);
        }
    }
}