package org.example.principles.openclosed.bad;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Clothes> clothes = new ArrayList<>();
    private List<Shoe> shoes = new ArrayList<>();

    public void store(Clothes clothes){
        this.clothes.add(clothes);
    }

    public void store(Shoe shoe){
        this.shoes.add(shoe);
    }
}
