package com.abhi.OnlineGroceryStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.abhi.OnlineGroceryStore.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}

