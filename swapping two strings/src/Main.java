public class Main {
    public static void main(String[] args) {
        // using temporary variable
        String str1 = "Hello";
        String str2 = "John";
        System.out.println("Before swapping str1 :"+str1+" "+"str2 :"+str2);
        String str3 = str1;
        str1 = str2;
        str2 = str3;
        System.out.println("using third variable,After swapping str1 :"+str1+" "+"str2 :"+str2);

        //using sub-string method(without using third variable)
        String name1 = "Hi";
        String name2 = "angeline";
        System.out.println("Before swapping name1 :"+name1+" "+"name2 :"+name2);
        name1 = name1+name2;
        name2 = name1.substring(0,name1.length()-name2.length());
        name1 = name1.substring(name2.length());
        System.out.println("using sub-string method After swapping name1 :"+name1+" "+"name2 :"+name2);
    }
}