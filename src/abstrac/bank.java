package abstrac;
import java.util.*;
public class bank {
	public static void Main(String[]args) {
		BankA bA=new BankA();
		bA.getBalance();
		
		BankB bB=new BankB();
		bB.getBalance();
		
		BankC bC=newBankC();
		bC.getBalance();
		
		
	}

}
 public class Bank {
	public abstract void getBalance();
}
class BankA extends Bank {
	
	
	 
	@Override
	public void getBalance{
		System.out.println("deposite:100$");
		class BankB extends Bank{
			@Override
			public  static void getBalance() {
		System.out.println("deposite:150$");
	
		
		
			}
		}
	class BankC extend Bank{
		@override
		public void getBalance() {
			System.out.println("Deposite 200$");
			
		}
	}
	}