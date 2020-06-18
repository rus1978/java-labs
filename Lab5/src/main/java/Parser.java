import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public void start() throws IOException {
        Parser parser= new Parser();
        String pageContent= parser.getContentByUrl("https://bondar.rv.ua");
        HashMap tags= parser.countTags(pageContent);

        Object[] counted= parser.sortTagsCounted(tags);
        for (Object tag : counted) {
            System.out.println(tag);
        }

        System.out.println("==========");

        Object[] sorted= parser.sortTagsSorted(tags);
        for (Object tag : sorted) {
            System.out.println(tag);
        }
    }

    public String getContentByUrl(String $pageUrl) throws IOException {
        URL url = new URL($pageUrl);
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;

        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public HashMap countTags(String pageContent){
        HashMap<String, Integer> tags = new HashMap();

        Pattern p = Pattern.compile("\\</(.+?)\\>");
        Matcher m = p.matcher(pageContent);
        String tag;

        while (m.find()){
            tag= m.group(1);
            if( tags.containsKey(tag) ){
                tags.put(tag, tags.get(tag)+1);
            }else{
                tags.put(tag, 1);
            }
        }
        return tags;
    }

    public Object[] sortTagsCounted(HashMap tags){
        return tags.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).toArray();
    }

    public Object[] sortTagsSorted(HashMap tags){
        return tags.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey()).toArray();
    }
}
