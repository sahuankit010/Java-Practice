package CollectionPractice;
class MyGen<T> {
    T x;
    static int count;
    MyGen()
    {
        count++;
    }
}
class Generics2 {
    public static void main(String[] args) {
        // Creating object of generic class
        MyGen<Integer> m1 = new MyGen<>();

        // Creating object of a generic class
        MyGen<Integer> m2 = new MyGen<>();

        MyGen<Float> m3 = new MyGen<>();

        System.out.println(MyGen.count);
    }
}