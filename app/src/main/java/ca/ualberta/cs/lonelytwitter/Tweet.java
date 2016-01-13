package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hbarlow on 1/12/16.
 */
public abstract class Tweet {
    protected Date date;
    protected String message;
    protected Boolean isImportant;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
        this.isImportant = Boolean.FALSE;
    }

    public Tweet(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public Tweet(Date date) {
        this.date = date;
    }
}
