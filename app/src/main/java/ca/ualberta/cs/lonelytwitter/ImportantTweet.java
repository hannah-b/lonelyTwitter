package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hbarlow on 1/12/16.
 */
public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(Date date, String message) {
        super(date, message);
        this.setIsImportant(Boolean.TRUE);
    }

    public ImportantTweet(String message) {
        super(message);
    }
}
