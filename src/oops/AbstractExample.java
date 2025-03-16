package oops;

 abstract class Base {
     abstract void fun();
}
class Derived extends Base {
    @Override
    final void fun() {
        System.out.println("Derived fun() called");
    }
}
class AbstractExample{

    public static void main(String[] args){
/*
 Base base = new Base();
 base object can not be created, as it is an abstract class.
 */

        Derived derived = new Derived();
        derived.fun();
    }

}
