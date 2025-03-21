public class Main {
    public static void main(String[] args) {
        //using third variable
        int n1 = 10;
        int n2 = 15;
        int temp;
        System.out.println("Before swap:"+"n1="+n1+","+"num2="+n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Using third variable,After swap:"+"n1="+n1+","+"num2="+n2);

        //using without third variable
        int x =5;
        int y = 10;
        System.out.println("Before swap:"+"x="+x+","+"y="+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Without Using third variable,After swap:"+"x="+x+","+"y="+y);

        //using * and / operators
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swap:"+"num1="+num1+","+"num2="+num2);
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("using * and / operators After swap:"+"num1="+num1+","+"num2="+num2);

        //using XOR operator
        int number1 = 25;
        int number2 = 50;
        System.out.println("Before swap:"+"number1="+number1+","+"number2="+number2);
        number1 = number1^number2;
        number2 = number1^number2;
        number1 = number1^number2;
        System.out.println("using XOR operator After swap:"+"number1="+number1+","+"number2="+number2);

        //try to swap in single statement
        int a = 30;
        int b = 50;
        System.out.println("Before swap:"+"a="+a+","+"b="+b);
        b = a+b-(a=b);
        System.out.println("In single statement After swap:"+"a="+a+","+"b="+b);
        
    }
}