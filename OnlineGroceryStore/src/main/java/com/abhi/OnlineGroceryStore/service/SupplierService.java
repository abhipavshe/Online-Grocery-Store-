package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Supplier;

public interface SupplierService {
    Supplier saveSupplier(Supplier supplier);
    Supplier getSupplierById(Long id);
    List<Supplier> getAllSuppliers();
    void deleteSupplier(Long id);
    Supplier getSupplierByEmail(String email);
	Supplier saveSupplier1(Supplier supplier);
	Supplier getSupplierByEmail();
}
