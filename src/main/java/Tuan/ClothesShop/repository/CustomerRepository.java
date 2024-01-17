package Tuan.ClothesShop.repository;

import org.springframework.data.repository.CrudRepository;

import Tuan.ClothesShop.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
