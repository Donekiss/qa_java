import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Lion animalLion;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(animalLion, "Самец");
        int result = lion.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void testLionSexTrue() throws Exception {
        Lion lion = new Lion(animalLion, "Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testLionSexFalse() throws Exception {
        Lion lion = new Lion(animalLion, "Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testLionSexInvalid() {
            try {
                new Lion(animalLion, "InvalidSex");
                fail("Expected Exception");
            } catch (Exception e) {
                assertEquals("Используйте допустимые значения пола животного - Самец или Самка", e.getMessage());
            }
        }

    @Test
    public void testEatMeat() throws Exception {
        Lion lion = new Lion(animalLion, "Самец");
        List<String> foodList = lion.eatMeat();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), foodList);
    }

}