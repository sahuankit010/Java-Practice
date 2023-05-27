package oops;

class FunctionOverloading {

    void f1(){
        System.out.println("Ankit Sahu");
    }
    void f1(int first){
        System.out.println(first);
    }

    void f1(float first){
        System.out.println("Float f1 called " + first);
    }

    void f1(int first, int second){
        System.out.println(first + " "+ second);
    }
    public static void main(String[] args){
        FunctionOverloading fo = new FunctionOverloading();
        fo.f1();
        fo.f1(2);
        fo.f1(2, 3);
        fo.f1(2.3f);
    }
}
