package axs210226;

public class Teacher implements Human {
    @Override
    public void liveInCivilization() {
        System.out.println("I live in an apartment");
    }

    @Override
    public void moveWithTwoLegs() {
        System.out.println("I wear shoes and walk with two legs one in front of the other");
    }

    @Override
    public void move() {
        moveWithTwoLegs();
    }

    @Override
    public boolean possessIntelligence() {
        return true;
    }

    @Override
    public void huntForFood() {
        System.out.println("My ancestors used to but now I mostly rely on cattle");
    }

    @Override
    public void eat() {
        eatBothMeatAndPlant();
    }

    @Override
    public void eatBothMeatAndPlant() {
        eatPlant();
        eatMeat();
    }

    @Override
    public void eatMeat() {
        System.out.println("I like this bacon");
    }

    @Override
    public void eatPlant() {
        System.out.println("I like this broccoli");
    }

    @Override
    public void moveWithFourLegs() {

    }
}
