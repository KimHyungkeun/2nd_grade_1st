package Question3;

public class Question3test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myHybrid = new Car(50); //50 km per liters
		myHybrid.addGas(20); //Tank 20 liters
		myHybrid.drive(100); // Drive 100 km
		double gasLeft = myHybrid.getGasInTank();
		
		System.out.println("Remain Gas : "+gasLeft); //remain gas
	}

}
