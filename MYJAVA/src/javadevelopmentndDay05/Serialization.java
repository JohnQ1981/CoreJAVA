package javadevelopmentndDay05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("Bike",2500,'B');
		Vehicle car = new Vehicle("Car",23000,'C');
		Vehicle truck = new Vehicle("Truck",46000,'T');

		try(FileOutputStream fos = new FileOutputStream("FolderToWrite/Vehicle.dat")){
			ObjectOutputStream vehicle = new ObjectOutputStream(fos);
			vehicle.writeObject(bike);
			vehicle.writeObject(car);
			vehicle.writeObject(truck);
			System.out.println("Objects are written on Vehicle.dat");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
class Vehicle implements Serializable{


	private static final long serialVersionUID = 2763304555223519853L;
	private String type;
	private double price;
	private char initial;

	public Vehicle(String type, double price, char initial) {

		this.type = type;
		this.price = price;
		this.initial = initial;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", price=" + price + ", initial=" + initial + "]";
	}

}

class ReadableObjects{
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("FolderToWrite/Vehicle.dat")){

			ObjectInputStream obj = new ObjectInputStream(fis);

			try {
				Vehicle vBike = (Vehicle) obj.readObject();
				Vehicle vCar = (Vehicle) obj.readObject();
				Vehicle vTruck = (Vehicle) obj.readObject();
				System.out.println(vBike);
				System.out.println(vCar);
				System.out.println(vTruck);

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
