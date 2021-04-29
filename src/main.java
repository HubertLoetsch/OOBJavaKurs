public class main {

    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        //  Engine e2 = new Engine(200, Engine.TYPE.GAS);

        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        //RearMirror r3 = new RearMirror(100,0);
        //RearMirror r4 = new RearMirror(90,-40);

        Tires t1 = new Tires(0,0);
        Tires t2 = new Tires(0,90);
        Tires t3 = new Tires(180,0);
        Tires t4 = new Tires(180,180);

        Car c1 = new Car(e1, "Audi", "blue", "A001");
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTires(t1);
        c1.addTires(t2);

        //Mirrors
        System.out.println(c1.getMirrors().get(0).getPosition());
        System.out.println(c1.getMirrors().get(0).getPosition());
        //Tires Wheel Reifen
        System.out.println(c1.getTires().get(0).getPosition());
        System.out.println();

        //engine ausgabe
        System.out.println(c1.getEngine().getHorsePower());



/*
        //Konstruktor
        Car c4 = new Car(e4);
        c4.setColor("Red");
        c4.setBrand("Audi");
        c4.setSerielNumber("A001");
        c4.setFuelConsumption(3);
        c4.setFuelAmount(43);
        c4.setFuelCapacity(60);
        c4.setEngine(e4);
        c4.addMirror(r1);
        c4.addMirror(r2);

        //Mit toString gibt es alles aus
        System.out.println(c4.toString());

        //Konstruktor Car 2
        Car c5 = new Car (e5);
        c5.setColor("Blue");
        c5.setBrand("BMW");
        c5.setSerielNumber("B0001");
        c5.setFuelAmount(11);
        c5.setFuelConsumption(7);
        c5.setFuelCapacity(80);
        c5.setEngine(e5);
        c5.addMirror(r3);
        c5.addMirror(r4);
        //Mit toString gibt es alles aus
        System.out.println(c5.toString());

        //Check Mirror
        System.out.println(c4.getMirrors().get(0).getPosition());


        //Honk

 */


//    Konstruktor

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