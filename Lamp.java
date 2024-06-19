public class Lamp {
    public String turnOn(){
        return("Lamp is on.");
    }
    public String turnOff(){
        return("Lamp is off.");
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        System.out.println("Turn on LED. " + led.turnOn());
        System.out.println("Turn on Halogen. " + halogen.turnOn());
        System.out.println("Turn off LED. " + led.turnOff());
        System.out.println("Turn off Halogen. " + halogen.turnOff());
    }
}