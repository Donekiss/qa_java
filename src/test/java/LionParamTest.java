import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    private String sex;
    private boolean expectedHasMane;

    public LionParamTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]
                {
                {"Самец", true},
                {"Самка", false},
                });
    }

    @Test
    public void testLionSex() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline,sex);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
