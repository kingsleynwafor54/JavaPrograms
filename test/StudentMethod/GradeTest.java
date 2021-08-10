package StudentMethod;

import GradeException.GradeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class GradeTest {
    Grader grader;

    @BeforeEach
    void setUp() {
        grader = new Grader();
    }

    @Test
    void testToShowThatTheMethodIsNotNull() {
        assertNotNull(grader);
    }

    @Test
    void testToShowGradeRepository() throws GradeException {
        grader.addGradesToTheRepo(30);
        assertEquals(30, grader.getGradeRepository(0));
    }

    @Test
    void testToHandleExceptions() throws GradeException {
        grader.addGradesToTheRepo(-1);
        assertEquals(-1, grader.getGradeRepository(0));
    }
}