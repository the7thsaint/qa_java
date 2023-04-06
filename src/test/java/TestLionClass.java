import com.example.IFelines;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestLionClass {

   Lion lion;

   @Before
   public void testData() throws Exception {
      lion = new Lion("Самец");
   }
   @Test
   public void testLionEatCorrectFood() throws Exception {
      assertEquals("Лев кушает не это",List.of( "Животные", "Птицы", "Рыба"),lion.getFood());
   }





}
