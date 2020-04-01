import org.junit.Assert;
import org.junit.Test;
import Stuff.TestClass;
import static org.assertj.core.api.Assertions.*;

public class TestClassTest {

    @Test
    public void additionTest() {
        int n1 = 5;
        int n2 = 7;
        int n1n2 = 12;

        assertThat(TestClass.addition(n1, n2)).isEqualTo(n1n2);
    }

}
