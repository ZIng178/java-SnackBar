package snackBarApp;

public class Snack {
    public static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendId;

    // constructor
    public Snack(String name, int quantity, double cost, int vendId) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendId = vendId;

    }

    // methods

    // getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double cost() {
        return cost;
    }

    public int vendId() {
        return vendId;
    }

    public double getTotalCost(int num) {
        return cost * num;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setVendID(int vendId) {
        this.vendId = vendId;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int quantity) {
        this.quantity -= quantity;
    }

}