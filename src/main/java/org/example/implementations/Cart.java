package org.example.implementations;


import org.example.Good;

import java.util.List;
import java.util.Map;

public interface Cart {
    void addItem(Good item, int count);
    List<Map> getItems();
    int getCost();
    int getCount();
}
