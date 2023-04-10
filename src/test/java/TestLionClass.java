import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestLionClass {

   Feline feline = new Feline();

//проверка какуж еду ест лев
   @Test
   public void testLionEatCorrectFood() throws Exception {
      Lion lion = new Lion("Самец", feline);
      assertEquals("Лев кушает не это",List.of( "Животные", "Птицы", "Рыба"),lion.getFood());
   }

  //проверка неподходящего пола для льва
   @Test
   public void testLionOtherSexTrowsException(){
      String expectedAnswer = "Используйте допустимые значения пола животного - самец или самка";
      Exception actualAnswer = Assert.assertThrows(Exception.class, () -> new Lion("Боевой вертолет апач", feline));
      assertEquals("Ответы не совпали", expectedAnswer, actualAnswer.getMessage());
   }





}
