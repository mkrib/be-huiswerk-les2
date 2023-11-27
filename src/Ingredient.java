public class Ingredient {

    private double amount;
    private String unit;

    private String name;

//  Dit is een constructor met de 3 variabelen
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

//  Dit is een lege constructor
    public Ingredient() {
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name){
        this.name = name;
    }
}


