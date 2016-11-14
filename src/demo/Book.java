package demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by HaouJohan on 11/14/2016.
 */

public class Book {

    String title;
    String description;
    String author;
    int year;

    Gson gson = new Gson();

    public Book(){
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;
    }


}
