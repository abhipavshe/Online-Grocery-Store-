package com.abhi.OnlineGroceryStore.service;

import java.util.List;
import com.abhi.OnlineGroceryStore.model.Item;

public interface ItemService {
    Item saveItem(Item item);
    List<Item> getAllItems();
    Item getItemById(Long id);
    void deleteItem(Long id);
}
