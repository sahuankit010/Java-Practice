package oops;

public class Kangaroo implements Animal, Herbivore, TwoLeggedMammal {
    @Override
    public void liveInJungle() {
        System.out.println("I live in Outback country");
    }

    @Override
    public void move() {
        moveWithTwoLegs();
    }

    @Override
    public void moveWithTwoLegs() {
        System.out.println("I like to jump");
    }

    @Override
    public void eat() {
        eatPlant();
    }

    @Override
    public void eatPlant() {
        System.out.println("I like this grass");
    }

    @Override
    public boolean possessIntelligence() {
        return false;
    }
}

