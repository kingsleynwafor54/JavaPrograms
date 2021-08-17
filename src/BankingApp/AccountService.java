package BankingApp;

import BankRepo.AccountType;
import MaveBankException.MavenBankException;
import MaveBankException.TransactionException;

import java.math.BigDecimal;

public interface AccountService {
    public long openAccount(Customer theCustomer, AccountType type) throws MavenBankException;
    public BigDecimal deposit(BigDecimal amount,long account) throws MavenBankException;
    public Account findAccount(long accountNumber)throws MavenBankException;
//    public Account findAccount(Customer customer,long accountNumber)throws MavenBankException;
}
