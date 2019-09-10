package attractions;

import people.Visitor;

public abstract class Attraction {
    private String name;
    private int rating;
    private int visitCount;
//    private int price;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
//        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }


}

