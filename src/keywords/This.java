package keywords;

class This {
    // instance variable
    int a = 10;

    // static variable
    static int b = 20;
    void GFG()
    {
        // referring current class(i.e, class RR)
        // instance variable(i.e, a)
        this.a = 100;

        System.out.println(a);

        // referring current class(i.e, class RR)
        // static variable(i.e, b)
        this.b = 600;

        System.out.println(b);
    }

    public static void main(String[] args)
    {
        // Uncomment this and see here you get
        // Compile Time Error since cannot use
        // 'this' in static context.
        // this.a = 700;
        new This().GFG();
    }}
