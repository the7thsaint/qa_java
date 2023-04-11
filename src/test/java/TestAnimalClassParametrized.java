import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

//проверка вывода корректной еды для семейства животных
@RunWith(Parameterized.class)
public class TestAnimalClassParametrized {
    private final String animalKind;
    private final List<String> expectedFood;


    public TestAnimalClassParametrized(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFoodGroups() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void testAnimalFoodGroups() throws Exception {
        Animal animal = new Animal();
        assertEquals(expectedFood, animal.getFood(animalKind));
    }
}
