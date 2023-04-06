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


public class TestCatClass {
    Cat cat;

    @Before
    public void testData() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void testCatGetCorrectSound() {
        assertEquals("Котик не сказал Мяу","Мяу", cat.getSound());
    }
    @Test
    public void testCatIsPredator() throws Exception {
        assertEquals(List.of("Котик кушает не это", "Животные", "Птицы", "Рыба"),cat.getFood());

    }

}
