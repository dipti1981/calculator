import javax.xml.crypto.KeySelector;

public class Calculator
{
    //global static/class variables
    static int a=10, b=5, answer;

    //main method
    public static void main(String[] args)
    {
        addition();
        subtraction();
        multiplication();
        division();
    }

    //Purpose is to add numbers
    static void addition(){
        answer = a + b;
        System.out.println(answer);
    }

    //Purpose is to subtract numbers
    static void subtraction(){
        answer = a -b;
        System.out.println(answer);
    }

    //Purpose is to multiply numbers
    static void multiplication(){
        answer = a * b;
        System.out.println(answer);
    }

    //Purpose is to divide numbers
    static void division(){
        answer = a / b;
        System.out.println(answer);
    }
}

