import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.lubas.practic.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calc_test {
    @Test
    void addition_int(){
        String actual = Main.calculate("-1", "+", "-1");
        assertEquals("-2", actual);
    }
    @Test
    void addition_rat(){
        String actual = Main.calculate("-1/8", "+", "2/3");
        assertEquals("13/24", actual);
    }
    @Test
    void multiplication_int(){
        String actual = Main.calculate("-1", "*", "9");
        assertEquals("-9", actual);
    }
    @Test
    void multiplication_rat(){
        String actual = Main.calculate("-1/3", "*", "9/5");
        assertEquals("-3/5", actual);
    }
    @Test
    void subtraction_int(){
        String actual = Main.calculate("-1", "-", "9");
        assertEquals("-10", actual);
    }
    @Test
    void subtraction_rat(){
        String actual = Main.calculate("5/8", "-", "4/5");
        assertEquals("-7/40", actual);
    }
    @Test
    void division_by_zero(){
        String actual = Main.calculate("1", "/", "0");
        assertEquals("Division by zero", actual);
    }
    @Test
    void division_rat(){
        String actual = Main.calculate("6/25", "/", "3/5");
        assertEquals("2/5", actual);
    }
    @Test
    void division_int(){
        String actual = Main.calculate("20", "/", "5");
        assertEquals("4", actual);
    }
    @Test
    void division_int_rational(){
        String actual = Main.calculate("20", "/", "5/3");
        assertEquals("12", actual);
    }
    @Test
    void addition_int_rational(){
        String actual = Main.calculate("20", "+", "3/2");
        assertEquals("43/2", actual);
    }
    @Test
    void subtraction_int_rational(){
        String actual = Main.calculate("3", "-", "1/5");
        assertEquals("14/5", actual);
    }
    @Test
    void multiplication_int_rational(){
        String actual = Main.calculate("6/5", "*", "5");
        assertEquals("6", actual);
    }


}
