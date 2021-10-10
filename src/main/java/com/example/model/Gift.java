package com.example.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Gift {

    private ArrayList<Candy> gift = new ArrayList<Candy>();
    private final static Logger LOGGER = LoggerFactory.getLogger(Gift.class);

    public ArrayList<Candy> getGift() { return gift; }

    public void addToGift(Candy candy){
        LOGGER.debug("MODEL: Adding candy : {} to the New Year gift", candy.getName());
        this.gift.add(candy);
        LOGGER.info("MODEL: Candy {} was successfully added to the gift", candy.getName());
    }

    public void deleteFromGift(Candy candy){
        LOGGER.debug("MODEL: Deleting candy : {} from the New Year gift: {}", candy.getName());
        this.gift.remove(candy);
        LOGGER.info("MODEL: Candy {} was successfully deleted from the gift", candy.getName());
    }

    public double checkSugarContent(){
        LOGGER.debug("MODEL: Gift: checkSugarContent()");
        int sugarContent = 0;

        for(Candy candy : gift){
            sugarContent += candy.getSugar();
        }
        LOGGER.info("MODEL: Gift has sugar content: {}", sugarContent);
        return sugarContent;
    }

    public ArrayList<Candy> findCandiesBySugarContent(Integer minSugar, Integer maxSugar){
        LOGGER.debug("MODEL: Gift: findCandiesByDurationRange()");
        ArrayList<Candy> candies = new ArrayList<Candy>();
        for(Candy candy : gift) {
            if (candy.getSugar() >= minSugar && candy.getSugar() <= maxSugar)
                candies.add(candy);
        }
        LOGGER.info("MODEL:  Gift: retrieved list with {} candy(es)", candies.size());
        return candies;
    }
}
