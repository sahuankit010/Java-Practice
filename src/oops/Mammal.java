package oops;

public interface Mammal {
    void move();
    void eat();
    default boolean possessIntelligence(){
        System.out.println("It has a default implementation");
        return false;
    }
}
