package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Address;

public interface AddressService {
    Address saveAddress(Address address);
    Address getAddressById(Long id);
    List<Address> getAllAddresses();
    void deleteAddress(Long id);
    List<Address> getAddressesByUserId(Long userId);
	Address saveAddress1(Address address);
}
