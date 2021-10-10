package com.example.model;

public class Candy implements Comparable<Candy> {

    private CandyType type;
    private String name;
    private int weight;
    private int sugar;

    public CandyType getType() { return type; }

    public void setType(CandyType type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public int getSugar() { return sugar; }

    public void setSugar(int sugar) { this.sugar = sugar; }


    @Override
    public int compareTo(Candy o) {
        if(getSugar()<o.getSugar())
            return -1;
        if(getSugar()>o.getSugar())
            return 1;
        return 0;
    }
}
