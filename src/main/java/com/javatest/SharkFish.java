package com.javatest;

import java.util.ArrayList;
import java.util.List;

public class SharkFish implements FishInterface{

    private List<FishSpeciality> fishSpecialities;

    public SharkFish() {
        fishSpecialities = new ArrayList<FishSpeciality>();
        fishSpecialities.add(FishSpeciality.LARGE_GREY);
        fishSpecialities.add(FishSpeciality.EATS_FISH);
    }
}
