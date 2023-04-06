import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestLionMockClass {
    @Mock
    Lion lion;

    @Test
    public void testUseedKittensTimes(){
        lion.getKittens();
        Mockito.verify(lion,Mockito.times(1)).getKittens();
    }


}
