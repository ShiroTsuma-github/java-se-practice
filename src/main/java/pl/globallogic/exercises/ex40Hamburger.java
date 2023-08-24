package pl.globallogic.exercises;

public class ex40Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public ex40Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        this.addition1Name = null;
        this.addition1Price = 0;

        this.addition2Name = null;
        this.addition2Price = 0;

        this.addition3Name = null;
        this.addition3Price = 0;

        this.addition4Name = null;
        this.addition4Price = 0;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
    return hamburgerPrice;
    }

    public static void main(String[] args) {
        ex40Hamburger hamburger = new ex40Hamburger("Basic", "Sausage", 3.56, "White");
        double price;

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is " + price);

        ex40HealthyBurger healthyBurger = new ex40HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        price = healthyBurger.itemizeHamburger();
        System.out.println("Total burger price is " + price);

        ex40DeluxeBurger db = new ex40DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        price = db.itemizeHamburger();
        System.out.println("Total burger price is " + price);
    }
}
