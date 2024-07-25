package com.example.item.controller;

import com.example.item.domain.Item;
import com.example.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam String name) {
        return itemService.searchItems(name);
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping("/{code}")
    public Item getItemByCode(@PathVariable String code) {
        return itemService.findByCode(code);
    }


}
