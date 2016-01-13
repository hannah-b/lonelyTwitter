package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hbarlow on 1/12/16.
 */
public class SadMood extends CurrentMood {
    // Sad mood. Inherits from CurrentMood.

    public Date getDate() {
        return this.date;
    }

    public String getMood() {
        return "Sad";
    }
}
