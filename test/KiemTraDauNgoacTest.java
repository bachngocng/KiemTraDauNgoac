import com.codegym.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KiemTraDauNgoacTest {
    @DisplayName("IsValidExpression Test")
    @ParameterizedTest(name = "#{index}\t \"{0}\" \t {1}")
    @CsvSource({
            "s * (s – a) * (s – b) * (s – c), true",
            "(– b + (b2 – 4*a*c)^0.5) / 2*a, true",
            "s * (s – a) * (s – b * (s – c), false",
            "s * (s – a) * s – b) * (s – c), false",
            "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)), true",
    })
    public void test(String input, boolean expected){
        boolean actual = Main.kiemTraDauNgoac(input);
        assertEquals(expected, actual);
    }
}