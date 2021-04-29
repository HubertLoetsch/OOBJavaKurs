import java.util.ArrayList;
import java.util.List;

public class Car {

    //Author Hubert
    //Version 0.5
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tires> tires;
    public int fuelConsumption; //Kraftstoffverbrauch
    private String serielNumber; //serienNummer
    public int gasintank;  //RestTank
    public int fuelCapacity;    //kapazitet
    private String brand;    //Marke
    private String color;    //Farbe
    private int honkCounter;


    //Konstruktor With Pflichtfelder
    public Car(Engine engine, String brand, String color, String serielNumber) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.serielNumber = serielNumber;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

/*
    //Ausgabe nach Main
    public String toString() {
        return "Car" +
                "fuelConsumption=" + fuelConsumption + ", serielNumber='" + serielNumber + '\'' +
                ", GasinTank=" + gasintank + ", fuelCapacity=" + fuelCapacity + ", brand='" + brand + '\'' +
                ", color='" + color + '\'' + ", Power=" + engine.getHorsePower() + "ps";
                    }
 */

    //AddMirror
    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    //Reifen Tires
    public void addTires(Tires tires){
        this.tires.add(tires);
    }
    public List<Tires> getTires(){
        return tires;
    }


    //Consturktor
    public Car() {
        this.engine = engine;
    }


    //Honk = Hupen
    public void honk() {
        this.honkCounter++;
    }

























    //Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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
        return gasintank;
    }

    public void setFuelAmount(int fuelAmount) {
        this.gasintank = fuelAmount;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getHonkCounter() {
        return honkCounter;
    }

    public boolean setHonkCounter(int honkCounter) {
        this.honkCounter = honkCounter;
        return false;
    }
}


    /*
    Konstruktor
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