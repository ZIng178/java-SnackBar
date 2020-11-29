package snackBarApp;

public class Main {
    private static void workwithData() {
        System.out.println(" My first hello world code for Java!!");
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine(" Food ");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate", 36, 1, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2, v1.getId());

        // why do we use the getID method to instantiate the Food Vending Machine Drinks

        Snack s4 = new Snack("Soda", 24, 2, v2.getId());
        Snack s5 = new Snack("Water", 20, 2, v2.getId());

        System.out.println(" Jane buys three sodas");
        s4.buySnack(3);

        c1.buySnacks(s4.getTotalCost(3));
        System.out.println("customer " + c1.getId() + "cash on hand " + c1.getCashOnHand());
        System.out.println("Qunatity of snack " + s4.getId() + "is " + s4.getQuantity());

        System.out.println(" Jane buys one pretzel");
        s3.buySnack(1);

        c1.buySnacks(s1.getTotalCost(1));
        System.out.println("customer " + c1.getId() + "cash on hand " + c1.getCashOnHand());
        System.out.println("Qunatity of snack " + s4.getId() + "is " + s4.getQuantity());

        System.out.println(" Bob buys two sodas");
        s4.buySnack(2);
        c2.buySnacks(s4.getTotalCost(2));
        System.out.println("customer " + c2.getId() + "cash on hand " + c2.getCashOnHand());
        System.out.println("Qunatity of snack " + s4.getId() + "is " + s4.getQuantity());

        System.out.println(" Jane adds cash");
        c1.addCash(10);
        System.out.println(" Customer " + c1.getId() + "cash on hand" + c1.getCashOnHand());

        System.out.println(" Jane buys a chocolate bar");
        s2.buySnack(1);
        c1.buySnacks(s2.getTotalCost(1));
        System.out.println("customer " + c1.getId() + "cash on hand " + c1.getCashOnHand());
        System.out.println("Qunatity of snack " + s2.getId() + "is " + s2.getQuantity());

        System.out.println("Jane adds pretzels");
        s3.addQuantity(12);
        System.out.println("Quantity of snack " + s3.getId() + "is" + s3.getQuantity());

        System.out.println(" Bob buys pretzels");
        s3.buySnack(3);

        c2.buySnacks(s3.getTotalCost(3));
        System.out.println("customer" + c2.getId() + "cash on hand" + c2.getCashOnHand());
        System.out.println(" qunatity of snack" + s3.getId() + "is" + s3.getQuantity());

    }

    public static void main(String[] args) {
        workwithData();
    }
}