import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
        @Test
        public void testGetKittensWithParam() {
            Feline feline = new Feline();
            int result = feline.getKittens(3);
            assertEquals(3, result);
        }
        @Test
        public void testGetKittens() {
            Feline feline = new Feline();
            int result = feline.getKittens();
            assertEquals(1, result);
        }
        @Test
        public void testEatMeat() throws Exception {
            Feline feline = new Feline();
            List<String> foodList = feline.eatMeat();
            assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), foodList);
        }

        @Test
        public void testGetFamily() {
            Feline feline = new Feline();
            String result = feline.getFamily();
            assertEquals("Кошачьи", result);
        }
    }


