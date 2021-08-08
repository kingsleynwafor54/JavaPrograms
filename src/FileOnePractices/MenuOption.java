package FileOnePractices;

public enum MenuOption {
    // declare contents of enum type
    Zero_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);
    //current menu option
     private final int value;

   MenuOption(int value){
        this.value=value;
    }

}
