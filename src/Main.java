public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW",4);
        Car car2 = new Car("Audi",4);


        Truck truck = new Truck("Man",8);
        Truck truck2 = new Truck("volvo",6);


        Bicycle bicycle = new Bicycle("BMX",2);
        Bicycle bicycle2 = new Bicycle("BMX2",2);


        ServiceStation station = new ServiceStation();
        System.out.println("Ремонт легкового автомобиля");
        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();
        System.out.println("Ремонт грузовика");
        station.check(truck);
        System.out.println();
        station.check(truck2);
        System.out.println();
        System.out.println("ремонт велосипеда");
        station.check(bicycle);
        System.out.println();
        station.check(bicycle2);
    }
}