import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class MyFirstTest {

    @Test
    public void testFirstMethod() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testArrayLists() {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        List<String> morelanguages = new ArrayList<>();


        assertNotSame(languages, morelanguages);
    }

}
