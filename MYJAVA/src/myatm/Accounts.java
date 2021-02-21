package myatm;

public class Accounts {
	private int accountID;
	private int accountPin;
	private String bankName;
	private String accountType;
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public int getAccountPin() {
		return accountPin;
	}
	public void setAccountPin(int accountPin) {
		this.accountPin = accountPin;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Accounts [accountID=" + accountID + ", accountPin=" + accountPin + ", bankName=" + bankName
				+ ", accountType=" + accountType + "]";
	}


}
