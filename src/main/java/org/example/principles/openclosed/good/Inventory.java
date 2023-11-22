package org.example.principles.openclosed.good;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Goods> goodsList = new ArrayList<>();

    public void store(Goods goods) {
        goodsList.add(goods);
    }
}
