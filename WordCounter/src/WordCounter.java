import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileReader;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WordCounter {

    public static ArrayList<String> fileRead(String fileName) throws Exception {
        
        ArrayList<String> contentList=new ArrayList<String>();
        BufferedReader buffReader = new BufferedReader(new FileReader(fileName));
        String line = buffReader.readLine();
        String separated[] = line.split(",");
        
        for(String str: separated)
        {
            contentList.add(str);
        }
        buffReader.close();
        return contentList;
        
    }
    public static void main (String[] args) throws Exception {
        
                //ArrayList<String> urlsList = fileRead("./urls.txt");
                //ArrayList<String> wordsLst = fileRead("words.txt");
                
               // for(String urls: urlsList) {
                
                    URL url = new URL("https://en.wikipedia.org/wiki/Spring_Framework");
                    URLConnection connection = url.openConnection();
                    InputStream is = connection.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is, "UTF8");
                    BufferedReader bufferedReader = new BufferedReader(isr);
                    String line="";
                    while(true) {
                        line = bufferedReader.readLine();
                        if(line!=null) {
                            Document doc = Jsoup.parse(line);
                            String text= doc.body().text();
                            System.out.println(text);
                        }
                 //   }
                }
                
                
                
                
    }

}
