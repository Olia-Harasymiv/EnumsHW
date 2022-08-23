package main.java.enums;

public enum Months {
    JANUARY(31, "WINTER"),
    FEBRUARY(28, "WINTER"),
    MARCH(31, "SPRING"),
    APRIL(30, "SPRING"),
    MAY(31, "SPRING"),
    JUNE(30, "SUMMER"),
    JULY(31, "SUMMER"),
    AUGUST(31, "SUMMER"),
    SEPTEMBER(30, "AUTUMN"),
    OCTOBER(31, "AUTUMN"),
    NOVEMBER(30, "AUTUMN"),
    DECEMBER(31, "WINTER");
     Integer daysAmount;
     String season;

    Months(Integer daysAmount, String season) {
        this.daysAmount = daysAmount;
        this.season = season;
    }

    public Integer getDaysAmount() {
        return daysAmount;
    }

    public String getSeason() {
        return season;
    }

}
