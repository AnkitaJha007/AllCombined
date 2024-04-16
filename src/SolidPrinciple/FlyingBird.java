package SolidPrinciple;
interface CanFly {
    void fly();
}

public class FlyingBird implements Bird, CanFly {
    private String name;

    public FlyingBird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}

class NonFlyingBird implements Bird {
    private String name;

    public NonFlyingBird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
