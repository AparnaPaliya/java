public class swap {
    public static void main(String[] args) {

        int num1=2;
        int num2=3;
        System.out.println("The first number before the swap is : " + num1);
        System.out.println("The second number before swap is : " + num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("the first number after swap is : " + num1);
        System.out.println("the second number after swap is : " + num2);
    }
}
