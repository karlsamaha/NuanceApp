package com.nuance.speechkitsample;

import java.util.regex.Pattern;

/**
 * Created by Karl S on 2/21/2016.
 */
public  class Emotion {


    public static  String getEmotion(String text) {

        int happyCounter = 0, sadCounter = 0, angryCounter = 0, loveCounter = 0, maxCount = 0;

        //HAPPY
        Pattern pattern1 = Pattern.compile("cheerful | cheery| merry| joyful| jovial| jolly| " +
                "jocular| gleeful| carefree| untroubled| delighted| smiling| beaming| grinning| " +
                "in good spirits| in a good mood| lighthearted| pleased| contented| content| " +
                "satisfied| gratified| buoyant| radiant| sunny| blithe| joyous| beatific");
        if (pattern1.matcher(text).find())
            happyCounter++;

        //ANGRY
        Pattern pattern2 = Pattern.compile("angry|mad|fuck|piss|bitch|ass|cunt|upset| irate| mad|" +
                " annoyed| cross| vexed| irritated| indignant");
        if (pattern2.matcher(text).find())
            angryCounter++;

        //LOVE
        Pattern pattern3 = Pattern.compile("love|sweet|sex|bliss|infatuated|loving|lover| crush | " +
                "romantic | romance");
        if (pattern3.matcher(text).find())
            loveCounter++;

        //SAD
        Pattern pattern4 = Pattern.compile("sad | unhappy| sorrowful| dejected| depressed| downcast| " +
                "miserable| down| despondent| despairing| disconsolate| desolate| wretched| glum| " +
                "gloomy| doleful| dismal| melancholy| mournful| woebegone| forlorn| crestfallen| " +
                "heartbroken| inconsolable");
        if (pattern4.matcher(text).find())
            sadCounter++;

        //Method max() below
        maxCount=max(angryCounter, sadCounter, loveCounter, happyCounter);


        //Associate Counter with emotion
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