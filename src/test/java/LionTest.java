import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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
        Lion lion = new Lion("Самец");
        int result = lion.getKittens();
        assertEquals(1, result);
    }

   @Rule
   public ExpectedException thrown = ExpectedException.none();
    @Test
   public void testLionSexInvalid() throws Exception {
       thrown.expect(Exception.class);
       thrown.expectMessage("Используйте допустимые значения пола животного - Самец или Самка");
       new Lion("InvalidSex");
   }

    @Test
    public void testEatMeat() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> foodList = lion.eatMeat();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), foodList);
    }

}