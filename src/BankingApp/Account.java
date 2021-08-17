package BankingApp;

import BankRepo.AccountType;

import java.math.BigDecimal;

public class Account {
    private long accountNumber;
    private AccountType typeOfAccount;
    private BigDecimal balance;
    private String accountPin;
public  Account(){

}
    public Account(long accountNumber, AccountType typeOfAccount) {
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(AccountType typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(String accountPin) {
        this.accountPin = accountPin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", typeOfAccount=" + typeOfAccount +
                ", balance=" + balance +
                ", accountPin='" + accountPin + '\'' +
                '}';
    }
}
