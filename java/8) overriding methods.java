class Scratch {
    public static void main(String[] args) {

        Tank tank = new Tank("Grass Humper");

        tank.describeVehicle();
        tank.start();
        tank.shoot();
        tank.stop();

        MiniVan miniVan = new MiniVan(false);
        miniVan.describeVehicle();
        miniVan.start();
        miniVan.claw();
        miniVan.stop();
    }
}

class Vehicle {

    String name;
    int numberOfWheels;
    boolean canFly;

    void describeVehicle() {
        String fullText1 = "VEHICLE DETAILS - Name: " + name + ", Number of wheels: " + numberOfWheels + ", Capable of flight: " + canFly;
        System.out.println(fullText1);
    }

    void start() {
        System.out.println("<Engine Started>");
    }

    void stop() {
        System.out.println("<Engine Stopped>");
    }


}

class Tank extends Vehicle {
    String model;

    Tank(String model) {
        this.name = "Tank";
        this.numberOfWheels = 2;
        this.canFly = false;
        this.model = model;
    }

    // We took the parent Vehicle method and extended it, Override it
    @Override
    void describeVehicle() {
        // We still called the vehicle's method
        super.describeVehicle();
        // But then we added to it
        String fullText2 = "TANK DETAILS - Model: " + model;
        System.out.println(fullText2);
    }

    void shoot() {
        System.out.println("BOOM!");
    }
}

class MiniVan extends Vehicle {

    boolean hasFood;

    MiniVan(boolean hasFood) {
        this.name = "Mini Van";
        this.numberOfWheels = 4;
        this.canFly = true;
        this.hasFood = hasFood;
    }

    // We did an Override for the describeVehicle again just like the car
    // And we also did an Override for the start and stop method, and if the MiniVan had food we added to it
    @Override
    void describeVehicle() {
        super.describeVehicle();
        String fullText3 = "VAN DETAILS - Has Food: " + hasFood;
        System.out.println(fullText3);
    }

    @Override
    void start() {
        super.start();
        if (hasFood) {
            System.out.println("I'm about to deliver the food to you");
        } else {
            System.out.println("I have no food :(");
        }
    }

    @Override
    void stop() {
        super.stop();
        if (hasFood) {
            System.out.println("Here's your food");
        } else {
            System.out.println("Fuck you I said I have no food!");
        }
    }

    void claw() {
        System.out.println("ZZZZT! Haha I took your balls");
    }
}