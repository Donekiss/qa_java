import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
    public class ParamTest {

        private int inputKittens;
        private int expectedKittens;
        private String animalKind;
        private List<String> expectedFood;

        public ParamTest(int inputKittens, int expectedKittens, String animalKind, List<String> expectedFood) {
            this.inputKittens = inputKittens;
            this.expectedKittens = expectedKittens;
            this.animalKind = animalKind;
            this.expectedFood = expectedFood;
        }

        @Parameterized.Parameters
        public static Object[][] testData() {
            return new Object[][]
                            {{0, 0, "Травоядное", List.of("Трава", "Различные растения")},
                            {256, 256, "Хищник", List.of("Животные", "Птицы", "Рыба")}};
        }

        @Test
        public void testGetKittensWithParam() {
            Feline feline = new Feline();
            int result = feline.getKittens(inputKittens);
            assertEquals(expectedKittens, result);
        }

        @Test
        public void testGetFood() throws Exception {
            Feline feline = new Feline();
            List<String> foodList = feline.getFood(animalKind);
            assertArrayEquals(expectedFood.toArray(), foodList.toArray());
        }
    }
