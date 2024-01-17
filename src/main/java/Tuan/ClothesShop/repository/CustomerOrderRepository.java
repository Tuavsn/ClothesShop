package Tuan.ClothesShop.repository;

import org.springframework.data.repository.CrudRepository;

import Tuan.ClothesShop.entity.CustomerOrder;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, String>{

}
