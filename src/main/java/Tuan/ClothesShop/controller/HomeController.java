package Tuan.ClothesShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String redirectHome() {
		return "redirect:/trang-chu";
	}
	
	@RequestMapping("/trang-chu")
	public String Home(Model model, HttpSession session) {
		model.addAttribute("page", "home");
		return "user/index";
	}
	
	@RequestMapping("/lien-he")
	public String Contact(Model model) {
		model.addAttribute("page", "about");
		return "user/about";
	}
	
	@RequestMapping("/dang-nhap")
	public String login(Model model) {
		return "user/login";		
	}
	
	@RequestMapping("/dang-ky")
	public String regist() {
		return "user/regist";
	}
	
	@RequestMapping("/quen-mat-khau")
	public String forgetPassword() {
		return "user/forget-password";
	}
	
}
