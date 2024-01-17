package Tuan.ClothesShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Tuan.ClothesShop.entity.User;
import Tuan.ClothesShop.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/findAll")
	public String index(Model model) {
		model.addAttribute("message", "helloworld");
		return "user/malefashion-master/index";
	}
}
