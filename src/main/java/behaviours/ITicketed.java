package behaviours;

import people.Visitor;

public interface ITicketed {

    Double defaultPrice();
    Double priceFor(Visitor visitor);


}


//public String connect(String data);