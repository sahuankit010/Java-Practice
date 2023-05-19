package axs210226;

public class Lion implements Animal, FourLeggedMammal, Hunter, Carnivore {
    @Override
    public void liveInJungle() {
        System.out.println("I am king of the jungle!");

    }

    @Override
    public void move() {
        moveWithFourLegs();
    }

    @Override
    public void moveWithFourLegs() {
        System.out.println("I like to run sometimes.");
    }

    @Override
    public void eat() {
        eatMeat();
    }

    @Override
    public void eatMeat() {
        System.out.println("I like deer meat");
    }

    @Override
    public boolean possessIntelligence() {
        return false;
    }

    @Override
    public void huntForFood() {
        System.out.println("My females hunt often");
    }
}