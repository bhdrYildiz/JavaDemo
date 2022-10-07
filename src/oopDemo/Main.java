package oopDemo;

public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		//creditManager.add();
		//creditManager.calculate();
		
		VehicleManager vehicleManager = new VehicleManager();
		//vehicleManager.calculate();
		
		MortgageManager mortgageManager = new MortgageManager();
		//mortgageManager.add();
		
		CreditManager[] credits = new CreditManager[] {vehicleManager,mortgageManager};
		
		for (CreditManager cM : credits) {
			cM.add();
			cM.calculate();
		}	
	}
}
