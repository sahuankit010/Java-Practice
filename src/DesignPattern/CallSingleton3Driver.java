package DesignPattern;

public class CallSingleton3Driver {

    static void print(int [] arr){
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {

        int [] arr = {1, 2, 3};
        int brr [] = {4, 5, 6};

        CallSingleton3Driver.print(arr);
        CallSingleton3Driver.print(brr);



        Singleton3 instance1 = Singleton3.getSingleton3Instance();
        Singleton3 instance2 = Singleton3.getSingleton3Instance();

        System.out.println(instance1);
        System.out.println(instance2);


        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
