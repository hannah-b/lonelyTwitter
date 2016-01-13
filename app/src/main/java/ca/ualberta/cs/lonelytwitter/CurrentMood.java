package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hbarlow on 1/12/16.
 */
public abstract class CurrentMood {
    // Abstract Base Class which represents the current mood.
    protected Date date;
    protected String mood;

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
