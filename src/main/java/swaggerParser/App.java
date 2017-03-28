package swaggerParser;

import java.io.File;
import java.io.IOException;
import java.util.Map;
 
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class App 
{
    public static void main( String[] args )
    {
 
        ObjectMapper mapper = new ObjectMapper(); 
 
        try {
                 
            //POJO to JSON
            mapper.writeValue(new File("article.json"), createArticle());
            System.out.println("json created!");
 
            //JSON to POJO
            Article article = mapper.readValue(new File("article.json"), Article.class);
            System.out.println(article);
 
            //"Raw" Data Binding Example
            Map<String,Object> articleMap = mapper.readValue(new File("article.json"), Map.class);
            System.out.println(articleMap);
 
 
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    private static Article createArticle(){
 
        Article article = new Article();
 
        article.setTitle("Jackson - Java to JSON & JSON to Java");
        article.setUrl("http://hmkcode.com/jackson-java-json");
        article.addCategory("Java");
        article.addTag("Java");
        article.addTag("Jackson");
        article.addTag("JSON");
        article.addTag("dizztag");
        article.addTag("dizz");
        
        return article;
    }
}
