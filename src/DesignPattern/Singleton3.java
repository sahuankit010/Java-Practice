package DesignPattern;

public class Singleton3 {
    private static volatile Singleton3 singleton3Instance = null;

    private Singleton3(){
        System.out.println("Called Constructor");
    }
    public static Singleton3 getSingleton3Instance(){
        if(singleton3Instance == null){
            singleton3Instance = new Singleton3();
        }

        return singleton3Instance;
    }
    public void log(String message) {
        // log the message
    }
}
