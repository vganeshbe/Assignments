package Week3.Day1;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit - Axis Bank");
	}
	
	public static void main(String[] args) {
		AxisBank objBank = new AxisBank();
		
		objBank.saving();
		objBank.fixed();
		objBank.deposit();
	}

}
