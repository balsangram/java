class Bank{
	public String[] getCustomersName(){
		String[] customersName = {"AAA","BBB","CCC"};
		return customersName;
		}
}
class testf{
	public static void main(String []args){
		Bank bank = new Bank();
		String[] customersName = bank.getCustomersName();
		for(int index = 0; index<customersName.length;index++){
			System.out.println(customersName[index]);
		}
	}
}