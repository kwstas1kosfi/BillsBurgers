public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", "Sausage & Bacon",
                19.10, "White roll");
        System.out.println( " Deluxe hamburger on a White" +
                " roll with Sausage & Bacon, price is 14.54");
    }


    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        addition1Name = "Chips";
        addition1Price = 2;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        addition2Name = "Drink";
        addition2Price = 2;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {

    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {

    }

}
