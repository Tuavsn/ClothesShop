package Tuan.ClothesShop.service;

import Tuan.ClothesShop.entity.User;

public interface UserService {
	Iterable<User> getAllUser();
	User getUserById(String userId);
	void addUser(User user);
	void deleteUser(String userId);
}
