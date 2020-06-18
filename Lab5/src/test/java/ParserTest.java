import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    @Test
    void countTags() throws IOException {
        Parser parser= new Parser();

        //String pageContent= parser.getContentByUrl("https://bondar.rv.ua");
        String pageContent= "<b>bbb</b><a>111</a><a>222</a>";

        HashMap tags= parser.countTags(pageContent);

        assertEquals(1 , tags.get("b"));
        assertEquals(2 , tags.size());
    }
}