package com.icms.jungabahadhurstory.story;

import com.icms.jungabahadhurstory.R;

public class StoryBoard {


    public enum choices {CHOICE1, CHOICE2}

    private Story[] storyBoard = {
            new Story("Rise of Junga Bahadur", "start", "", R.drawable.image0),
            new Story("Impress the king Rajendra Bikram Shah and become captain", "Jump from dharhara", "Accompanying with him during terai visit ", R.drawable.image1),
            new Story("Create the Power vacuum", "Kill the prime minster Mathabar singh Thapa", "Kill the Crown Prince", R.drawable.image2),
            new Story("Dismantle queen power", "Kill the king", "Kill Army Chief Gagan Singh", R.drawable.image3),
            new Story("Becomes Prime minster", "Massacre of all the powerful person in kot parva", "Kill the queen", R.drawable.image4),
            new Story("Eliminated all opposition and exiled the Queen", "Another Mass Massacre i.e Bhandarkhal Parva", "Alau massacre", R.drawable.image5),
            new Story("Junga Bahadur and his families rules for 108 years", "Re-start", "", R.drawable.image6),

    };


    private int storyNumber = 0;


}
