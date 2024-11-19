import devices.Device;
import devices.TV;
import devices.SmartTV;
import remotes.AdvancedRemote;
import remotes.BasicRemote;
import remotes.SmartRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testSmartDevice(new SmartTV());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

    public static void testSmartDevice(Device device) {
        System.out.println("Tests with smart remote.");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power();
        smartRemote.voiceControl("turn on");
        smartRemote.voiceControl("open netflix");
        device.printStatus();
    }
}