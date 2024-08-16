import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks1 = scn.nextInt();
        int marks2 = scn.nextInt();
        int marks3 = scn.nextInt();
        int total_marks = marks1+marks2+marks3;
        int percentage = (total_marks / 3);
        System.out.println(total_marks);
        System.out.println(percentage + "%");
    }
}
