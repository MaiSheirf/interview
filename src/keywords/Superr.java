package keywords;

class Parent {
    // instance variable
    int a = 10;

    // static variable
    static int b = 20;
}
public class Superr extends Parent{

    void rr()
    {
        // referring parent class(i.e, class Parent)
        // instance variable(i.e, a)
        System.out.println(super.a);

        // referring parent class(i.e, class Parent)
        // static variable(i.e, b)
        System.out.println(super.b);
    }

    public static void main(String[] args)
    {
        // Uncomment this and see here you get
        // Compile Time Error since cannot use 'super'
        // in static context.
        // super.a = 700;
        new Superr().rr();
    }
}
