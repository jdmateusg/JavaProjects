public class Bank1{
	private CheckingAccount1 accountOne;
	private CheckingAccount1 accountTwo;

	public Bank1(){
	  accountOne = new CheckingAccount1("Zeus", 100, "1");
	  accountTwo = new CheckingAccount1("Hades", 200, "2");
	}

	public static void main(String[] args){
	  Bank1 bankOfGods = new Bank1();
	  System.out.println(bankOfGods.accountOne.name);
	  bankOfGods.accountOne.addFunds(5);
	  bankOfGods.accountTwo.getInfo();
	}
}