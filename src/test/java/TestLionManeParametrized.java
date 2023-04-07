import com.example.Feline;
import com.example.IFelines;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class TestLionManeParametrized {
    private String sex;
    private boolean expectedHasMane;

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
        Lion lion = new Lion(sex);
        Assert.assertEquals("Пол не совпал",expectedHasMane,lion.doesHaveMane());
    }


}
