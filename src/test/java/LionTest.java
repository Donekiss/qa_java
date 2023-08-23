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

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class LionTest {
    @Mock
    Feline felineMock;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testGetKittens() throws Exception {
        when(felineMock.getKittens()).thenReturn(1);

        Lion lion = new Lion(felineMock);
        int result = lion.getKittens();
        assertEquals(1, result);
    }

   @Rule
   public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testLionSexInvalid() throws Exception {

        assertThrows(Exception.class, () -> new Lion(felineMock,"InvalidSex"));
    }

    @Test
    public void testEatMeat() throws Exception {
        when(felineMock.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion(felineMock);
        List<String> foodList = lion.eatMeat();

        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), foodList);
    }

}