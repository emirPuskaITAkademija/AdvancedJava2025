package three.pattern.decorator;

public class PatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Pije Faruk piće " + coffee.getName() + " i to ga košta " + coffee.cost());
        BosnianCoffee bosnianCoffee = new BosnianCoffee();
        System.out.println("Pije Tarik piće " + bosnianCoffee.getName() + " i to ga košta " + bosnianCoffee.cost());
        //kafu s mlijekom
        Beverage coffee1 = new MilkDecorator(new Coffee());
        System.out.println("Pije Jovan piće " + coffee1.getName() + " i to ga košta " + coffee1.cost());
        Tee tee = new Tee();
        System.out.println("Pije Marko piće " + tee.getName() + " i to ga košta " + tee.cost());
        Beverage tee1 = new MilkDecorator(new Tee());
        System.out.println("Pije Dženita piće " + tee1.getName() + " i to ju košta " + tee1.cost());
        Beverage irishCoffee = new WhisheyDecorator(new Coffee());
        System.out.println("Pije Danko piće " + irishCoffee.getName() + " i to ga košta " + irishCoffee.cost());
    }
}
