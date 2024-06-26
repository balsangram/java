	class Transation{
		public void deposit(String accNo, int depositAmt){
			System.out.println("deposit() method from Transation Class");
			System.out.println(depositAmt+ "deposited in an account" + accNo);
		}
		public void withdraw(String accNo, int withdrawAmount){
			System.out.println("withdraw() method from Transition Class");
			System.out.println(withdrawAmount+ "withdraw for the account" + accNo);
		}
		public void transferFunds(String fromAccount, String toAccount, int transferAmount){
			System.out.println("transferFunds() from Transation Class");
			System.out.println(transferAmount+ "is transfer from Account" + fromAccount + "to the account" + toAccount);
		}
	}
	class Testb {
		public static void main(String []arge){
			Transation transation = new Transation();
			transation.deposit("abc123", 5000);
			
			System.out.println();
			
			transation.withdraw("abc123", 2000);
			
			System.out.println();
			
			transation.transferFunds("abc123", "lll12133", 1000);
		}
	}