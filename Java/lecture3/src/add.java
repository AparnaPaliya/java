import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        int num1 , num2 , sum;
        System.out.println("enter the two number to calculate their sum:");
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println(sum);
    }
}
