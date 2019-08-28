
public class BankAccount {

	private int accNo;
	private String name;
	private double balance;
	private String accType;
	private static int TotalWithdrwal = 0;
	private static int TotalDeposit = 0;

	BankAccount() {

	}

	BankAccount(int a, String b, double c, String d) {
		accNo = a;
		name = b;
		balance = c;
		accType = d;
	}

	private void setdata(int a, String b, double c, String d) {
		accNo = a;
		name = b;
		balance = c;
		accType = d;
	}

	private void showdata() {
		System.out.println(accNo + "," + name + "," + balance + "," + accType);
	}

	private void deposit(int rs) {
		balance = balance + rs;
		TotalDeposit = TotalDeposit + rs;

	}

	private void withdraw(int rs) {
		if (rs > balance) {
			System.out.println("insufficient balance");
		} else {
			balance = balance - rs;
			TotalWithdrwal = TotalWithdrwal + rs;
		}
	}

	private static void SummaryOfTheDay() {
		System.out.println("Today's total money withdrawn is :" + TotalWithdrwal);
		System.out.println("Today's total money deposited  is :" + TotalDeposit);

	}

	private static void avg(BankAccount... ba) {
		double sum = 0;
		for (BankAccount x : ba) {
			sum = sum + x.balance;
		}

		double average = 0;
		average = sum / ba.length;
		System.out.println("The average of n bank Account's balance  is :" + average);
	}

	public static void main(String[] args) {

		BankAccount ac1 = new BankAccount();
		BankAccount ac2 = new BankAccount();
		BankAccount ac3 = new BankAccount(123456, "MohdfaizAquib", 150000, "saving");
		ac1.setdata(1234, "faiz", 50000, "saving");
		ac2.setdata(12345, "faizAquib", 100000, "saving");
		ac1.showdata();
		ac1.deposit(400);
		ac1.showdata();
		ac1.withdraw(1500);
		ac1.showdata();
		ac1.withdraw(100000);
		ac1.showdata();
		ac1.withdraw(15000);
		ac1.showdata();
		ac1.deposit(10000);
		ac1.showdata();
		ac2.showdata();
		ac3.showdata();
		// System.out.println(TotalWithdrwal);
		// System.out.println(TotalDeposit);
		// ac1.balance;
		// ac2.balance;
		SummaryOfTheDay();
		BankAccount.avg(ac1, ac2, ac3);

	}

}
