package com.javatest;

import java.util.ArrayList;
import java.util.List;

public class ClownFish implements FishInterface{

    private List<FishSpeciality> fishSpecialities;

    public ClownFish() {
        fishSpecialities = new ArrayList<FishSpeciality>();
        fishSpecialities.add(FishSpeciality.MAKES_JOCKES);
        fishSpecialities.add(FishSpeciality.SMALL_COLOURFUL);
    }
}
