package FileOnePractices;

import java.util.Arrays;

public class CreditInquiry {
  private  static MenuOption[] choices=MenuOption.values();

    public static void main(String[] args) {
        MenuOption accountType=getRequest();
        System.out.println(accountType);
        System.out.println(Arrays.toString(choices));
    }

    private static MenuOption getRequest() {

        return choices[0];
    }
}
