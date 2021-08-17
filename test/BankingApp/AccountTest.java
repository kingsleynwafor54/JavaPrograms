package BankingApp;


import BankRepo.AccountType;
import BankRepo.CustomerRepo;
import BvnGenerationCentre.BVNService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {
    Customer customer;
    Account johnAccount;
    Account johnAccount2;
    Account johnAccount3;
    @BeforeEach
    void beforeEach(){
        customer=new Customer();
        johnAccount=new Account();
        johnAccount2=new Account();
        johnAccount3=new Account();
    }
    @Test
    void openAccount(){
    customer.setBvn(BvnGenerationCentre.BVNService.generateBvn());
    customer.setEmail("John@doe.com");
    customer.setFirstName("John");
    customer.setLastName("Paw");
    customer.setPassword("1234");
    johnAccount.setAccountNumber(BvnGenerationCentre.BVNService.generateAccountNumber());
    johnAccount2.setAccountNumber(BvnGenerationCentre.BVNService.generateAccountNumber());
    johnAccount3.setAccountNumber(BvnGenerationCentre.BVNService.generateAccountNumber());
//        System.out.println(customer.getAccountList().add(johnAccount));
//        System.out.println(customer.getAccountList().add(johnAccount2));
////        for(int counter=0;counter<customer.getAccountList().size();counter++){
////            System.out.println(customer.getAccountList().get(counter).toString());
////        }
//        System.out.println(johnAccount);

//        System.out.println(customer, AccountType.SAVINGS);
//    assertTrue(BankRepo.CustomerRepo.getCustomers().isEmpty());
    assertEquals(2,johnAccount2.getAccountNumber());
    assertEquals(1,johnAccount.getAccountNumber());
    assertEquals(3,johnAccount3.getAccountNumber());

    }

}

