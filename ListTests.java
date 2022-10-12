import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {

    @Test
    public void filterTest() {
        List<String> list_input = new ArrayList<String>();
        list_input.add("Apple");
        list_input.add("Bannana");
        list_input.add("Orange");
        StringChecker SC = new StrCh();
        list_input = ListExamples.filter(list_input, SC);
        List<String> list_output = new ArrayList<String>();
        list_output.add("Bannana");
        list_output.add("Orange");
        assertEquals(list_output, list_input);
    }
}