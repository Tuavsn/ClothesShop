package Tuan.ClothesShop.repository;

import org.springframework.data.repository.CrudRepository;

import Tuan.ClothesShop.entity.CartItem;

public interface CartItemRepository extends CrudRepository<CartItem, String>{

}
