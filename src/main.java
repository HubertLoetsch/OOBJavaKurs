import java.sql.SQLOutput;

public class main {

    public static void main(String[] args) {

        //Konstruktor
        Car c4 = new Car();
        c4.setFuelConsumption(5);
        //System.out.println(c4.getFuelConsumption());
        c4.setColor("red");
        //  System.out.println(c4.getColor());
        c4.setBrand("Audi");
        // System.out.println(c4.getBrand());
        c4.setFuelConsumption(3);
        // System.out.println(c4.getFuelConsumption());
        c4.setSerielNumber("A001");
        //System.out.println(c4.getSerielNumber());
        c4.setFuelAmount(43);
        // System.out.println(c4.getFuelAmount());
        c4.setFuelCapacity(60);
        //System.out.println(c4.getFuelConsumption());

        //Mit toString gibt es alles aus
        System.out.println(c4.toString());



        /*
        Car c1 = new Car();
        c1.brand = "audi";
        c1.fuelConsumption = 7;
        c1.serielNumber = "A1203";
        c1.fuelAmount = 70;
        c1.color = "Green";

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 3;
        c2.fuelCapacity = 74;
        c2.serielNumber = "AM1234";
        c2.color = "Red";


         */

/*      Konstruktor
        Car c3 = new Car(40,"Audi","A5100");
        System.out.println(c3.serielNumber);
 */

        /*
        //Drive Befehl
        System.out.println("check Fahren: ");
        System.out.println(c2.fuelCapacity);
        c2.drive();
        System.out.println(c2.fuelAmount);
        //brake
        System.out.print("check Bremsen: ");
        c2.brake();

        //TurboBoost
        System.out.print("check TurboBoost: ");
        c2.isAmountOfFuelEnough();
        //Hupen
        System.out.println("Check Hupen: ");
        c2.honk(4);
        //Restreichweite
        System.out.println("Check Rest Reichweite: ");
        c2.getRemainingRange();

         */


    }

}














        /*
        car1 c1 = new car1();
        c1.brand = "audi";
        c1.fuelConsumption = 7;
        c1.serielNumber = "A1203";
        c1.fuelAmount = 70;
        c1.color = "Green";

        car1 c2 = new car1();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 4;
        c2.serielNumber = "AM1234";
        c2.fuelAmount = 20;
        c2.color = "Red";



        car1 c3 = new car1(17,"Opel","A5643");
        System.out.print(c3.serielNumber);


    //    System.out.println(c2.fuelAmount);
    //   c2.drive();
    //    System.out.println(c2.fuelAmount);


      //  System.out.println(c1.serielNumber);
      //  System.out.println(c2.brand);


    }

}

   */