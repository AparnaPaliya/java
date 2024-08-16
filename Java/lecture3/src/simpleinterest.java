import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("enter the interest rate: ");
        double rate = sc.nextDouble();
        System.out.println("enter the time: ");
        double time = sc.nextDouble();
        double interest = (principal*time*rate)/100;
        System.out.println("principal: " + principal);
        System.out.println("interest rate: " + rate);
        System.out.println("time duration: " + time);
        System.out.println("simple interest: " + interest);
    }
}
