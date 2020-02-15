package package5;



	
import package4.UAV;

	public class AgriculturalDrone extends UAV {
	    private String  brand;
	    private int carryCapacity;

	    public AgriculturalDrone() {
	        super();
	    }

	    public AgriculturalDrone(String brand, int carryCapacity, double weight, double price) {
	        super(weight, price);
	        this.brand = brand;
	        this.carryCapacity = carryCapacity;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public Integer getCarryCapacity() {
	        return carryCapacity;
	    }

	    public void setCarryCapacity(Integer carryCapacity) {
	        this.carryCapacity = carryCapacity;
	    }

	   
	    public String toString() {
	        return "This AgriculturalDrone is manufactured by " + brand + " has a carry capacity of"
	    + carryCapacity + " and weighs "
	    + super.getWeight()+ " and costs " + super.getPrice()+ "$";
	    }

	   

	   
	    public boolean equals(Object obj) {
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        AgriculturalDrone other = (AgriculturalDrone)obj;
	   
	            if (!(brand.equals(other.brand))||!(carryCapacity!=other.carryCapacity))
	                return false;
	            
	            else 
	           return true;
	    }

	}

