import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionManeParametrized {
    private String sex;
    private boolean expectedHasMane;
    Feline feline = new Feline();

    public TestLionManeParametrized(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] shouldHaveMane() {
        return new Object[][]{
                {"Самец", Boolean.TRUE},
                {"Самка", Boolean.FALSE},
        };
    }

    @Test
    public void testLionWhatIsMane() throws Exception{
        Lion lion = new Lion(sex, feline);
        assertEquals("Пол не совпал",expectedHasMane,lion.doesHaveMane());
    }


}
