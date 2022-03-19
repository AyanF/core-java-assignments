import java.io.BufferedReader;
import java.util.LinkedHashSet;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class WordCounter {

    public static ArrayList<String> fileReadUrl(String fileName) throws Exception {

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

    public static HashMap<String,Integer> fileReadWords(String fileName)throws Exception{

        HashMap<String,Integer> wordMap= new HashMap<String,Integer>();
        BufferedReader buffReader = new BufferedReader(new FileReader(fileName));
        String line = buffReader.readLine();
        String separated[] = line.split(",");

        for(String str: separated)
        {
            wordMap.put(str, 0);
        }

        buffReader.close();

        return wordMap;

    }

    //Collecting url data with JAVA
    /* public static String urlLoader(String url) {

        String data="yes";

        try {

            URL currURL = new URL(url);
            URLConnection connection = currURL.openConnection();
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            String line="";
            while(true) {
                line = bufferedReader.readLine();
                if(line!=null) {
                    Document doc = Jsoup.parse(line);
                    data+= doc.body().text();

                    }
                else {
                    break;
                }

           }

        }

        catch (Exception e) {
            e.printStackTrace();

        }

       return data;

    }*/


    public static void main (String[] args) throws Exception {

        ArrayList<String> allPagesWords= new ArrayList<String>();

        ArrayList<String> urlsList = fileReadUrl("urls.txt");
        HashMap<String,Integer> wordMap = fileReadWords("words.txt");

        String pageData="";
        String title="";
        for(String url: urlsList) {

            try {

                Document doc=null;
                doc = Jsoup.connect(url).get();
                pageData= doc.body().text();
                title= doc.title();

                for(String word: wordMap.keySet()) {


                    int occr = StringUtils.countMatches(pageData, word);
                    String occurence = Integer.toString(occr);

                    wordMap.put(word,wordMap.get(word)+occr);  
                    if(!allPagesWords.contains(title))
                    {
                        allPagesWords.add(title);
                    }

                    allPagesWords.add(word);
                    allPagesWords.add(occurence);

                }

            }

            catch(IOException ioe) {

                ioe.printStackTrace();
            }

        }

        for(String element: allPagesWords)
        {
            System.out.println(element);
        }
        for(String element: wordMap.keySet())
        {
            System.out.println(element);
            System.out.println(wordMap.get(element));
        }

    }

}
