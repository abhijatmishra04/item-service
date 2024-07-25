package com.example.purchase.service;

import com.example.purchase.domain.Purchase;
import com.example.purchase.feign.ItemClient;
import com.example.purchase.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.purchase.domain.Item;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private ItemClient itemClient;
    public Purchase savePurchase(Purchase purchase) {
        // Fetch item details using itemClient
        Item item = itemClient.getItemByCode(purchase.getItemCode());
        if (item == null) {
            throw new IllegalArgumentException("Invalid item code: " + purchase.getItemCode());
        }
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getAllPurchases() {
        return purchaseRepository.findAll();
    }

    public List<Item> searchItems(String name) {
        return itemClient.searchItems(name);
    }
}
