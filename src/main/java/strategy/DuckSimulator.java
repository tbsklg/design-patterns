package strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        final Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.performFly();
    }
}
