import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
    Hello hello =new Hello();
    @Test
    void methodToTestHelloWorld(){
        assertEquals("Hello World",hello.helloWorld());
    }
}
