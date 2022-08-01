package Tarea4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(6, Solution.sumGroups(new int[] {2, 1, 2, 2, 6, 5, 0, 2, 0, 5, 5, 7, 7, 4, 3, 3, 9}));
        assertEquals(5, Solution.sumGroups(new int[] {2, 1, 2, 2, 6, 5, 0, 2, 0, 3, 3, 3, 9, 2}));
        assertEquals(1, Solution.sumGroups(new int[] {2}));
        assertEquals(2, Solution.sumGroups(new int[] {1,2}));
        assertEquals(1, Solution.sumGroups(new int[] {1,1,2,2}));
    }
}
