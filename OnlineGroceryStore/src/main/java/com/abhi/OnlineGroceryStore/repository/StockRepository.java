package com.abhi.OnlineGroceryStore.repository;

import com.abhi.OnlineGroceryStore.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Inventory, Long> {
}

 

