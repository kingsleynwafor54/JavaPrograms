package KataTest;

import Kata.ReorderStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReOrderTest {
    ReorderStrings reorderStrings =new ReorderStrings();
    @Test
    void testReorderMethod(){
      String message= "this1 goin3g th5e mar6ket i2s t4o";
       // System.out.println(reorderStrings.reOrder(message));
      assertEquals("this1 i2s goin3g t4o th5e mar6ket",ReorderStrings.reOrder(message));
      assertEquals("this1 i2s goin3g t4o th5e mar6ket",ReorderStrings.reOrder1(message));
    }
}
