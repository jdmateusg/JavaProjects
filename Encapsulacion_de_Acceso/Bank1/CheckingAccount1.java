public class CheckingAccount1{
	public String name;
	public int balance;
	public String id;
	
	public CheckingAccount1(String inputName, int inputBalance, String inputId){
	  name = inputName;
	  balance = inputBalance;
	  id = inputId;
	}

	public void addFunds(int fundsToAdd){
	  balance += fundsToAdd;
	}

	public void getInfo(){
	  System.out.println("This checking account belongs to " + name +". It has "+ balance + " dollars in it.");
	}
}