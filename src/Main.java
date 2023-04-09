public class Main {
    public static void main(String[] args) {
 serviceStation serviceStation = new serviceStation();
 bycicle bycicle = new bycicle("stels");
 car car = new car("Bugatti");
 truck truck = new truck("belaz" , 8);
 serviceStation.check(bycicle);
        System.out.println("_________________________"
        );
 serviceStation.check(car);
        System.out.println("_____________________________________");
 serviceStation.check(truck);
    }
}