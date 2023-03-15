package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType; 


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
    @Id
    private long vehicleId;

    private String manufacturer;

	public Vehicle(long vehicleId, String manufacturer) {
		super();
		this.vehicleId = vehicleId;
		this.manufacturer = manufacturer;
	}

	

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", manufacturer=" + manufacturer + "]";
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

    
}