package com.osc.dddspring.domain2;

public class OscKoreaMember {

    private String name;
    private int year;
    private Rank rank;

    public OscKoreaMember(String name, int year) {
        this.year = year;
        this.name = name;
        setRank();
    }

    private void setRank() {
        if (this.year <= 2) {
            this.rank = Rank.STAFF;
        } else if (this.year <= 4) {
            this.rank = Rank.ASSISTANT_MANAGER;
        } else if (this.year <= 6) {
            this.rank = Rank.MANAGER;
        } else if (this.year <= 8) {
            this.rank = Rank.DEPUTY_GENERAL_MANAGER;
        } else if (this.year <= 10) {
            this.rank = Rank.GENERAL_MANAGER;
        } else if (this.year > 11) {
            this.rank = Rank.EXECUTIVE_DIRECTOR;
        }
    }

    public Rank getRank() {
        return rank;
    }

    public static void main(String[] args) {
        OscKoreaMember kyeongrok = new OscKoreaMember("kyeongrok", 10);
        System.out.println(kyeongrok.getRank());
    }

}
