import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test
    public void file1() throws IOException {
        File f1 = new File("some-files/");
        File f2 = new File("some-files/more-files");
        File f3 = new File("some-files/even-more-files");
        File f4 = new File("some-files/a.txt");
        List<File> result = new ArrayList<>();
        //result.add(f1);
        result.add(f4);
        result.add(f3);
        result.add(f2);
        assertEquals(result, FileExample.getFiles(f1));
    }
}
