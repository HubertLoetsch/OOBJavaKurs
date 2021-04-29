

public class Engine {
    public enum TYPE {DIESEL, GAS} //JavaInsel seite 429/617/bei enum wird alles Gropß geschrieben (alles in der Klammer)
    private int horsePower;
    private TYPE type;//Diesel oder Benzin
    private int speed;
    private int accelerate;


    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    //amount should be between 0 and 100
    public void drive(int km)
    {
        accelerate = this.speed;

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
    public void AccelerateSpeed (int speed)
    {
        speed = speed + 5;

    }
    public void BrakeSpeed (int speed)
    {
        speed = speed - 5;

    }
    public int setSpeed(int speed)
    {
        this.speed = speed;
        return speed;
    }




}
