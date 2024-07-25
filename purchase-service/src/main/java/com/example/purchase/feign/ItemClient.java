package com.example.purchase.feign;

import com.example.purchase.domain.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "item-service", url = "http://localhost:8080/items")
public interface ItemClient {

    @GetMapping("/search")
    List<Item> searchItems(@RequestParam("name") String name);
}
