import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(scn.hasNextLine()){
            String a = scn.next();
            String b = scn.next();
            System.out.println(a+b);
        }
    }
}
