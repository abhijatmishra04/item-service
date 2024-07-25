package com.example.purchase.controller;

import com.example.purchase.domain.Purchase;
import com.example.purchase.domain.Item;
import com.example.purchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping
    public List<Purchase> getAllPurchases() {
        return purchaseService.getAllPurchases();
    }

    @PostMapping
    public Purchase addPurchase(@RequestBody Purchase purchase) {
        return purchaseService.savePurchase(purchase);
    }

    @GetMapping("/search")
    public List<Item> searchItems(@RequestParam String name) {
        return purchaseService.searchItems(name);
    }
}
