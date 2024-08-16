public class logicaloperators {
    public static void main(String[] args) {
        int p = 15, q = 10, r = 5;

        // && and operator *
        System.out.println((p>q) && (p>r)); //true
        System.out.println((p>q) && (p<r)); //fase

        // || or operator +
        System.out.println((r<q) || (p<q)); //true
        System.out.println((p>q) || (q>r)); //true
        System.out.println((p<q) || (q<r)); //false

        // ! not operator
        System.out.println(!(p==q)); //true
        System.out.println(!(p>q)); //false

    }
}
