package remotes;

import devices.Device;
import devices.SmartTV;

public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice control command: " + command);
        if (device instanceof SmartTV) {
            SmartTV smartTV = (SmartTV) device;
            switch (command.toLowerCase()) {
                case "turn on":
                    smartTV.enable();
                    break;
                case "turn off":
                    smartTV.disable();
                    break;
                case "open netflix":
                    smartTV.netflix();
                    break;
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        } else {
            System.out.println("Voice control is not supported for this device.");
        }
    }
}