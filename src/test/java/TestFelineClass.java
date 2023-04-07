import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFelineClass {
    Feline feline = new Feline();

    @Test
    public void testIsFelineTest() {
        assertEquals("Виды не совпали","Кошачьи", feline.getFamily());

    }

    @Test
    public void testFelineEatsMeet() throws Exception {
        assertEquals("Кошачьи едят не это",List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testFelineReturnsKittensCountWithoutParameters(){
        assertEquals("Количество котят не совпало",1,feline.getKittens());
    }

    @Test
    public void testFelineReturnsKittensCountWithParameters(){
        assertEquals("Количество котят не совпало",5,feline.getKittens(5));
    }


}
