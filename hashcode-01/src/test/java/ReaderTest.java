import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

/**
 * Created by kescha on 23.02.2017.
 */
public class ReaderTest {
    @Test
    public void read() throws Exception {
        Reader reader = new Reader();
        reader.read("me_at_the_zoo.in");
    }

}