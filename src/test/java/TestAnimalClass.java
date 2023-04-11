import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAnimalClass {
    Animal animal = new Animal();

   //проверка вывода воможных семейств
    @Test
    public void testAnimalGetFoodReturnCorrectString() {
        assertEquals("Строки не совпали", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    //проверка вывода исключения в случае несовпадения вида
    @Test
    public void testAnimalGetFoodReturnCorrectTrowString(){
        String expectedAnswer = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception actualAnswer = Assert.assertThrows(Exception.class, () -> animal.getFood("Пончикоядное"));
        assertEquals("Ответы не совпали", expectedAnswer, actualAnswer.getMessage());
    }
}
