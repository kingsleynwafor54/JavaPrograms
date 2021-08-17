package BankingApp;

import BankRepo.AccountType;
import BankRepo.CustomerRepo;
import BvnGenerationCentre.BVNService;
import MaveBankException.MavenBankException;
import MaveBankException.TransactionException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceImplTest {

    private AccountService accountService;
    private Customer john;
    private Customer jane;
    private Account johnAccount;
    private Account johnAccount2;
    CustomerRepo customerRepo;
    private Object Customer;

    @BeforeEach
    void beforeEach() {
        accountService = new AccountServicesImpl();
        john = new Customer();
        jane= new Customer();
        johnAccount = new Account();
        johnAccount2 = new Account();
        customerRepo=new CustomerRepo();
    }
        @AfterEach
        void tearDown(){
        }
    @Test
    void openAccount() throws MavenBankException {
        john.setFirstName("kingsley");
        john.setLastName("Nwafor");
        john.setPassword("1234");
        johnAccount.setTypeOfAccount(AccountType.SAVINGS);
        john.getAccountList().add(johnAccount);
        john.getAccountList().add(johnAccount2);
        johnAccount2.setTypeOfAccount(AccountType.CURRENT);
        john.setBvn(BvnGenerationCentre.BVNService.generateBvn());
        assertTrue(CustomerRepo.getCustomers().isEmpty());
        assertEquals(2, john.getAccountList().size());
    }
    @Test
    void openSameTypeOfAccountForSameCustomer() {
        try {
            long newAccountNumber = accountService.openAccount(john, AccountType.SAVINGS);
            long newAccountNumber2= accountService.openAccount(john, AccountType.CURRENT);
            assertFalse( CustomerRepo.getCustomers().isEmpty());
            assertTrue(CustomerRepo.getCustomers().containsKey(john.getBvn()));
            assertEquals(2, john.getAccountList().size());
            assertEquals(newAccountNumber,john.getAccountList().get(0).getAccountNumber());
        } catch (MavenBankException e) {
            System.out.println("kjfkd");

        }
    }
    @Test
    void openSameTypeOfAccountForSameCustomer1() {
        try {
            long newAccountNumber = accountService.openAccount(john, AccountType.SAVINGS);
            long newAccountNumber2= accountService.openAccount(john, AccountType.CURRENT);
            assertFalse( CustomerRepo.getCustomers().isEmpty());
            assertTrue(CustomerRepo.getCustomers().containsKey(john.getBvn()));
            assertEquals(2, john.getAccountList().size());
            assertEquals(newAccountNumber,john.getAccountList().get(0).getAccountNumber());
        } catch (MavenBankException e) {
            System.out.println("kjfkd");

        }
    }
    @Test
    void testException(){
//        assertThrows(MavenBankException.class,()->)
    }
    @Test
    void deposit(){
        try{
            long newAccount=accountService.openAccount(john,AccountType.SAVINGS);
            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertNull(john.getAccountList().get(0).getBalance());
//            BigDecimal accountBalance=accountService.deposit(new BigDecimal(50000),john.getAccountList().get(0).getAccountNumber());
//            assertNotNull(john.getAccountList().get(0).getBalance());
        }catch (TransactionException e){
            e.printStackTrace();
        }catch(MavenBankException e){
            e.printStackTrace();
        }
    }
    @Test
    void findAccountByAccount(){

        try{
//            long newAccount=accountService.openAccount( john,AccountType.SAVINGS);
//            long newAccount2=accountService.openAccount(jane,AccountType.CURRENT);
//            long newAccount3=accountService.openAccount(jane,AccountType.SAVINGS);
            for(int count=0;count<CustomerRepo.getCustomers().size();count++){
                System.out.println(CustomerRepo.getCustomers().containsKey(count,Customer));
            }
            assertFalse(CustomerRepo.getCustomers().isEmpty());
            assertEquals(1,CustomerRepo.getCustomers().size());
            for(Customer customer:CustomerRepo.getCustomers().values()){
                System.out.println(customer.getFirstName());
            }
            assertEquals(2, BVNService.getGenerateAccountNumber());
            Account johnCurrentAccount=accountService.findAccount(2);
            Account janeCurrentAccount=accountService.findAccount(3);
            assertNotNull(johnCurrentAccount);
        }catch (MavenBankException ex){
            ex.printStackTrace();
        }
    }
//welcome to java
    @Test
    void deposit1(){
        try{
            System.out.println(CustomerRepo.getCustomers().get(1));
            System.out.println(accountService.findAccount(1));
            Account johnAccount=accountService.findAccount(1);
            assertEquals(BigDecimal.ZERO,johnAccount.getBalance());
            BigDecimal accountBalance=accountService.deposit(new BigDecimal(50000),1);
            johnAccount=accountService.findAccount(1);
            assertEquals(new BigDecimal(50000),johnAccount.getBalance());
        }
        catch (TransactionException ex){
            ex.printStackTrace();
        }
        catch(MavenBankException e){
            e.printStackTrace();
        }
    }
}