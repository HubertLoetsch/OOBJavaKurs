public class Car {

        private int fuelConsumption; //Kraftstoffverbrauch
        private String serielNumber; //serienNummer
    private int fuelAmount;  //RestTank
    private int fuelCapacity;    //kapazitet
    private String brand;    //Marke
    private String color;    //Farbe

    //Konstruktor With Pflichtfelder
/*
    public Car (String brand,String color, int fuelAmount,int fuelCapacit ){
        this.brand = brand;
        this.color = color;
        this.fuelAmount = fuelAmount;
        this.fuelCapacity = fuelCapacit;
        }
 */
    public String getColor() {
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public String getSerielNumber() {
        return serielNumber;
    }
    public void setSerielNumber(String serielNumber) {
        this.serielNumber = serielNumber;
    }
    public int getFuelAmount() {
        return fuelAmount;
    }
    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Car" +
                "fuelConsumption=" + fuelConsumption +
                ", serielNumber='" + serielNumber + '\'' +
                ", fuelAmount=" + fuelAmount +
                ", fuelCapacity=" + fuelCapacity +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                "";
    }
    // String getSerielNumber();



}

    /* Konstruktor
      public Car(int fuelConsumption,String brand, String serielNumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serielNumber = serielNumber;
       }
    */

    /*
    //Fahren
    public void drive() {
        this.fuelAmount = this.fuelCapacity - fuelConsumption;
        System.out.println("I am Driving ");
    }
    //Brake Bremse
    public void brake() {
        System.out.println("Ich Bremse");
    }
    //Boost Modus
    public boolean isAmountOfFuelEnough() {
        if (this.fuelAmount > 10)
            System.out.println("Super Boost Mode");
        else
            System.out.println("Not enough fuel to go to Superboost");
        return false;
    }
    //Hupen
    public void honk(int amountOfHonks) {
        for (int i = 0; i < amountOfHonks; i++) {
            System.out.println("Tuuut");
        }
    }
    //RestRechweite
    public void getRemainingRange() {
        System.out.println("Der Rest Liter Stand ist: " + this.fuelAmount + "L" + " Der verbrauch ist: " + this.fuelConsumption + "L");
    }
}


     */

//Public ist alles was ich sehen kann Gaspedal usw.
//Private sind die Dinge wo man nicht sieht einspritzung uws.