public class Main {
    public static void main(String[] args) {
 ServiceStation serviceStation = new ServiceStation();
 Bycicle bycicle = new Bycicle("stels",2);
 Car car = new Car("Bugatti", 4);
 Truck truck = new Truck("belaz" , 8);
 serviceStation.check(bycicle);
        System.out.println("_________________________"
        );
 serviceStation.check(car);
        System.out.println("_____________________________________");
 serviceStation.check(truck);
    }
}