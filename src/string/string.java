package string;

public class string {
    public static void main(String[] args)
    {
        // Declare String without using new operator
        String s = "GeeksforGeeks";

        // Prints the String.
        System.out.println("String s = " + s);

        // Declare String using new operator
        String s1 = new String("GeeksforGeeks");

        // Prints the String.
        System.out.println("String s1 = " + s1);

        //two refrence two the same string
        String s11 = "TAT";
        String s2 = "TAT";
        //two different strings
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println(s11);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
