package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.OnlineGroceryStore.model.Supplier;
import com.abhi.OnlineGroceryStore.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Supplier saveSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier getSupplierByEmail(String email) {
        return (Supplier) supplierRepository.findAll();
    }

	@Override
	public Supplier saveSupplier1(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier getSupplierByEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}

