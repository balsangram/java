class Account{
	void getAccountDetails(){
		System.out.println("Account DEtails.....");
	}
}
class Employee{
	void createAccount(Account account){
		System.out.println("Employee Dertails......");
		account.getAccountDetails();
	}
}
public class testd {
	public static void main(String []arge){
		Account account = new Account();
		//account.getAccountDetails();
		Employee employee = new Employee();
		employee.createAccount(account);
	}
}