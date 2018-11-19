public class account{
	private double balance;
	private int accountNumber;
	private user accountUser;
	private int pin;
	
	public account(double balance, int accountNumber, user accountUser, int pin) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountUser = accountUser;
		this.pin = pin;
	}
	public int getaccountNumber() {
		return accountNumber;
	}
	public double getbalance() {
		return balance;
	}
	public int getPin() {
		return pin;
	}
	public user getuser() {
		return accountUser;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setUser(user accountUser) {
		this.accountUser = accountUser;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	public void withdraw(double value) {
		balance -= value;
	}
	
}