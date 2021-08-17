package BankRepo;

import BankingApp.Account;
import BankingApp.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepo {
    private  static Map<Long, Customer>customers=new HashMap<>();
    public static Map<Long, Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(Map<Long, Customer> customers) {
        CustomerRepo.customers = customers;
    }

//    public void initializeDataStore(){
//        Customer abu=new Customer();
//        Customer bessie=new Customer();
//        Account  johnAccount=new Account(1,AccountType.SAVINGS);
//        abu.getAccountList().add(johnAccount);
//        customers.put(abu.getBvn(),abu);
//        Account  janeAccount=new Account(1,AccountType.SAVINGS);
//        bessie.getAccountList().add(janeAccount);
//        customers.put(bessie.getBvn(),bessie);
//    }
}
