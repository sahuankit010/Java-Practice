package Examples;

public class Test
{
    Test(Test t) {
        m1();
        System.out.println("Constructor");
    }

    void m1() {
        m2();
        System.out.println("Instance");
    }

    static void m2() {
        System.out.println("Static");
    }

    public static void main(String[] args)
    {
        new Test(null);
    }
}
