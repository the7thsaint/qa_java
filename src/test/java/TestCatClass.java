import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

// Класс для тестирования класса Cat
public class TestCatClass {
    Cat cat;

    @Before
    public void testData() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }
//Проверка издаваемого котом звука
    @Test
    public void testCatGetCorrectSound() {
        assertEquals("Котик не сказал Мяу","Мяу", cat.getSound());
    }

    //Проверка того, что котик кушает
    @Test
    public void testCatIsPredator() throws Exception {
        assertEquals("Котик кушает не это",List.of( "Животные", "Птицы", "Рыба"),cat.getFood());

    }

}
