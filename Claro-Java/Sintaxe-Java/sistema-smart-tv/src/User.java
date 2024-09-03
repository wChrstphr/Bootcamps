public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(true, 20, 35);


        System.out.println("Tv on? " + smartTv.on);
        System.out.println("Tv channel? " + smartTv.channel);
        System.out.println("Tv volume? " + smartTv.volume);
        
        // Smart TV ON/OFF
        smartTv.turnOn();
        System.out.println("\nNew state -> Tv on? " + smartTv.on);
        smartTv.turnOff();
        System.out.println("New state -> Tv on? " + smartTv.on);

        // Smart TV Channel
        smartTv.changeChannelUp();
        System.out.println("\nNew state -> Tv channel? " + smartTv.channel);
        smartTv.changeChannelDown();
        System.out.println("New state -> Tv channel? " + smartTv.channel);
        smartTv.changeChannel(133);
        System.out.println("New state -> Tv channel? " + smartTv.channel);
        

        // Smart TV Volume
        smartTv.increaseVolume();
        System.out.println("\nNew state -> Tv volume? " + smartTv.volume);
        smartTv.decreaseVolume();
        System.out.println("New state -> Tv volume? " + smartTv.volume);
        


    }
}
