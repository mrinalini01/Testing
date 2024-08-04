interface WaterBottleInterface {
	String color = "blue";
	void fillup();
}

public class InterfaceExample implements WaterBottleInterface{

	public static void main(String[] args) {
		System.out.println(color);
		InterfaceExample ex = new InterfaceExample();
		ex.fillup();

	}

	@Override
	public void fillup() {
		System.out.println("It is filled up.");
		
	}

}
