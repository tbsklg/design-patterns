package strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("MallardDuck");
    }
}
