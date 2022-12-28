import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandGenerator passwordGen = new RandGenerator();

//        input the number of passwords to be generated
//        input the length
        System.out.println("Input password length ");
        int length = sc.nextInt();
        System.out.println("Include special characters? \n yes or no");
        String answer = sc.next();


        System.out.println(passwordGen.randomGenerator(length,answer));

        sc.close();

        final String original = "Hello world";

        StringBuilder sb = new StringBuilder(original);

        sb.reverse();
        System.out.println(sb.toString());


    }
}
