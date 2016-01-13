package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hbarlow on 1/12/16.
 */
public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    public NormalTweet(String message) {
        super(message);
    }


}
