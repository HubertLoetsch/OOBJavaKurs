

public class Engine {
    public enum TYPE {DIESEL, GAS} //JavaInsel seite 429/617/bei enum wird alles Gropß geschrieben (alles in der Klammer)
    private int horsePower;
    private TYPE type;//Diesel oder Benzin


    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount) {     //amount should be between 0 and 100
        System.out.println("The motor is running with " + amount);
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
