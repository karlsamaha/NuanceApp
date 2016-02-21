package com.nuance.speechkitsample;

import java.util.regex.Pattern;

/**
 * Created by Karl S on 2/21/2016.
 */
public  class Emotion {

    public static  String getEmotion(String text) {

        int happyCounter = 0, sadCounter = 0, angryCounter = 0, loveCounter = 0, maxCount = 0;

        //HAPPY
        String[] matches = new String[] {"merry", "cheery", "happy", "cheerful", "joyful", "jovial",
                "jolly", "jocular",  "gleeful", "carefree", "untroubled", "delighted", "smiling", "beaming", "grinning",
              "good", "lighthearted", "pleased", "contented", "content", "satisfied", "gratified",
               "buoyant", "radiant", "sunny", "blithe", "joyous", "beatific", "wonderful"};

        for (String s : matches) {
            if (text.contains(s)) {
                happyCounter++;
                System.out.println(happyCounter);
            }
        }

        //ANGRY
        matches = new String[]{"angry","mad","bitch","asshole","cunt","upset","irate","mad",
                "annoyed","cross","vexed","irritated","indignant","appalled"};
        for (String s : matches) {
            if (text.contains(s)) {
                angryCounter++;
                System.out.println(angryCounter);
            }
        }

        //LOVE
        matches = new String[]{"love","sweet","sexy","bliss","infatuated","loving","lover","crush",
                "romantic","romance","horny"};
        for (String s : matches) {
            if (text.contains(s)) {
                loveCounter++;
                System.out.println(loveCounter);
            }
        }

        //SAD
        matches = new String[]{"sad","unhappy","sorrowful","dejected","depressed","downcast",
                "miserable","down","despondent","despairing","disconsolate","desolate","wretched","glum",
                "gloomy","doleful","dismal","melancholy","mournful","woebegone","forlorn","crestfallen",
                "heartbroken","inconsolable"};
        for (String s : matches) {
            if (text.contains(s)) {
                sadCounter++;
                System.out.println(sadCounter);
            }
        }

        maxCount=max(angryCounter, sadCounter, loveCounter, happyCounter);
        System.out.println("max is "+maxCount);

        if(maxCount ==0)
            return "BLING";
        if(maxCount == angryCounter)
            return "ANGRY";
        if(maxCount == sadCounter)
            return "SAD";
        if(maxCount == loveCounter)
            return "LOVE";
        else
            return "HAPPY";
    }


//Associate Counter with emotion


    //Need to compute the max of all counters
    public static Integer max(Integer... vals) {
        Integer ret = null;
        for (Integer val : vals) {
            if (ret == null || (val != null && val > ret)) {
                ret = val;
            }
        }
        return ret;
    }
}

