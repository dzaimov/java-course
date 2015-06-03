package hm4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter device: ");
		String name = input.nextLine();
		input.close();
		Device device = DeviceFactory.getDevice(name);
		device.printInfo();
	}

}
