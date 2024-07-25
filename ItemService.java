package com.example.item.service;

import com.example.item.domain.Item;
import com.example.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> searchItems(String typedItem) {
        if (typedItem.chars().allMatch(Character::isDigit)) {
            return itemRepository.findItemsByCode(typedItem);
        } else {
            return itemRepository.findItemsByName(typedItem);
        }
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }


}
