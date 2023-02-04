package advertisementMessage_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Message {

    private String phrase;
    private String event;
    private String author;
    private String city;

    public String getPhrase() {

        List<String> phraseList = new ArrayList<>();
        phraseList.add("Excellent product.");
        phraseList.add("Such a great product.");
        phraseList.add("I always use that product.");
        phraseList.add("Best product of its category.");
        phraseList.add("Exceptional product.");
        phraseList.add("I can't live without this product.");

        Random random = new Random();
        return phraseList.get(random.nextInt(phraseList.size()));

    }

    public String getEvent() {

        List<String> eventList = new ArrayList<>();
        eventList.add("Now I feel good.");
        eventList.add("I have succeeded with this product.");
        eventList.add("Makes miracles. I am happy of the results!");
        eventList.add("I cannot believe but now I feel awesome.");
        eventList.add("Try it yourself, I am very satisfied.");
        eventList.add("I feel great!");

        Random random = new Random();
        return eventList.get(random.nextInt(eventList.size()));

    }

    public String getAuthor() {

        List<String> authorList = new ArrayList<>();
        authorList.add("Diana");
        authorList.add("Petya");
        authorList.add("Stella");
        authorList.add("Elena");
        authorList.add("Katya");
        authorList.add("Iva");
        authorList.add("Annie");
        authorList.add("Eva");

        Random random = new Random();
        return authorList.get(random.nextInt(authorList.size()));

    }

    public String getCity() {

        List<String> cityList = new ArrayList<>();
        cityList.add("Burgas");
        cityList.add("Sofia");
        cityList.add("Plovdiv");
        cityList.add("Varna");
        cityList.add("Ruse");

        Random random = new Random();
        return cityList.get(random.nextInt(cityList.size()));

    }

    @Override
    public String toString() {
        // {phrase} {event} {author} – {city}.
        return String.format("%s %s %s - %s.", getPhrase(), getEvent(), getAuthor(), getCity());

    }

}
