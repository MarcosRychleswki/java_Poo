package Bank_Logic;





//Enter account number: 8532
//Enter account holder: Alex Green
//Is there na initial deposit (y/n)? y
//Enter initial deposit value: 500.00
//Account data:
//Account 8532, Holder: Alex Green, Balance: $ 500.00
//Enter a deposit value: 200.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 700.00
//Enter a withdraw value: 300.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 395.00








public class Bank {
	
	private Integer number;
	private String holder;
	private double balance;
	
	public Bank(Integer number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Bank(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
		
	}
	

	

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void AddBalance(double balance) {
		// this e para chamar o atributo da classe
		this.balance += balance;
	}
	
	public void NegBalance(double balance) {
		// this e para chamar o atributo da classe
		this.balance -= balance;
	}
	
	
	

}
