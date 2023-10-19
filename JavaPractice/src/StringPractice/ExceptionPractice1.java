package StringPractice;


class Bike {
    private String bikeName;
    private int tankCapacity;

    public Bike(String bikeName, int tankCapacity) {
        this.bikeName = bikeName;
        this.tankCapacity = tankCapacity;
    }

    public String getBikeName() {
        return bikeName;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}

public class ExceptionPractice1 {

	public static void main(String[] args) 
	{
        Bike myBike = new Bike("MyBike", 10);
        PetrolFilling petrolFilling = new PetrolFilling();

        int noOfLiters = 5; 

        String result = petrolFilling.fillPetrol(myBike, noOfLiters);
        System.out.println("Result: " + result);

	}

}
