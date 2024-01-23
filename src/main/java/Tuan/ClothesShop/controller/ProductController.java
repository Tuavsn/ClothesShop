package Tuan.ClothesShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@RequestMapping("/san-pham")
	public String getAllProduct() {
		return "user/shop";
	}
	
	@RequestMapping("/san-pham/{productId}")
	public String getProductById() {
		return "user/shop-details";
	}
}
