public class Bank_B{
	private CheckingAccount_B accountOne;
	private CheckingAccount_B accountTwo;
	
	public Bank_B(){
	accountOne = new CheckingAccount_B("Zeus", 100, "1");
	accountTwo = new CheckingAccount_B("Hades", 200, "2");
	}

	public static void main(String[] args){
	  Bank_B bankOfGods = new Bank_B();
	  System.out.println(bankOfGods.accountOne.getBalance());
	  bankOfGods.accountOne.setBalance(5000);
	  System.out.println(bankOfGods.accountOne.getBalance());
	  System.out.println(bankOfGods.accountOne.getMonthlyInterest());
	}
}
	