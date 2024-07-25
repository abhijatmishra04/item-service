package com.example.item.repository;

import com.example.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    @Query("SELECT i FROM Item i WHERE i.code = :code")
    List<Item> findItemsByCode(@Param("code") String code);

    @Query("SELECT i FROM Item i WHERE UPPER(i.name) LIKE UPPER(CONCAT('%', :name, '%'))")
    List<Item> findItemsByName(@Param("name") String name);
}
