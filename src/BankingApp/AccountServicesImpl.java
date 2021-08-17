package BankingApp;

import BankRepo.AccountType;
import BankRepo.CustomerRepo;
import MaveBankException.MavenBankException;
import MaveBankException.TransactionException;

import java.math.BigDecimal;

public class AccountServicesImpl implements AccountService {


    @Override
    public long openAccount(Customer theCustomer, AccountType type) throws MavenBankException {
        if( theCustomer==null||type==null){
            throw new MavenBankException("Customer and account type required to open new account");
        }
if(checkIfAccountTypeAlreadyExist(theCustomer,type)){
    throw  new MavenBankException("No two type account in my bank");
}
        Account newAccount = new Account();
        newAccount.setAccountNumber(BvnGenerationCentre.BVNService.generateAccountNumber());
        newAccount.setTypeOfAccount(type);
        theCustomer.getAccountList().add(newAccount);
        CustomerRepo.getCustomers().put(theCustomer.getBvn(), theCustomer);
        return newAccount.getAccountNumber();
    }
    public boolean checkIfAccountTypeAlreadyExist(Customer theCustomer,AccountType type) {
        boolean accountTypeExists = false;
        for (Account customer : theCustomer.getAccountList()) {
            if (customer.getTypeOfAccount() == type) {
                accountTypeExists = true;
                break;
            }

        }
        return accountTypeExists;
    }

    @Override
    public BigDecimal deposit(BigDecimal amount, long account) throws MavenBankException {
        BigDecimal newBalance=BigDecimal.ZERO;
        Account depositAccount=findAccount(account);
        newBalance=depositAccount.getBalance().add(amount);
        depositAccount.setBalance(newBalance);
        return newBalance;
    }

    @Override
    public Account findAccount(long accountNumber) throws MavenBankException {
        Account foundAccount=null;
        boolean accountFound=false;
        for (Customer customer:CustomerRepo.getCustomers().values()) {
            for(Account anAccount:customer.getAccountList()){
                if(anAccount.getAccountNumber()==accountNumber){
                    foundAccount=anAccount;
                    accountFound=true;
                    break;
                }

            }
            if(accountFound){
                break;
            }
        }

        return foundAccount;
    }

//    @Override
//    public Account findAccount(Customer customer, long accountNumber) throws MavenBankException {
//        return null;
//    }


}
