package hm4;

public class DeviceFactory {
	public static Device getDevice(String device) {
		
		if (device.equalsIgnoreCase("Phone")) {
			return new Phone();
		}
		else if (device.equalsIgnoreCase("Tablet")) {
			return new Tablet();
		}
		else if (device.equalsIgnoreCase("Laptop")) {
			return new Laptop();
		}
		else {
			return null;
		}
	}
}
