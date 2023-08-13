import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline felineMock;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testGetSound() {
        Cat cat = new Cat(felineMock);
        String result = cat.getSound();
        assertEquals("Мяу", result);
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(felineMock);
        when(felineMock.eatMeat()).thenReturn(Arrays.asList("Хищник"));
        List<String> result = cat.getFood();
        assertEquals(Arrays.asList("Хищник"), result);
    }
}
