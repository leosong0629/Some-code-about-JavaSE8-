package work1;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	Wand(){
		setName("wz");
		setPower(100.00);
	}
}
