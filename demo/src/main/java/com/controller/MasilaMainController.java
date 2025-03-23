package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MasilaMainController {

	@GetMapping("/")
	public String Index() {
		return "wellcome";
	}
	
	//wellcome --> browesProducts
	

	@GetMapping("/browse")
	public String BrowseProducts() {
		return "browesProducts";
	}

	@GetMapping("/profile")
	public String userProfile() {
		return "profile"; // Make sure profile.html exists
	}

	@GetMapping("/orders")
	public String userOrders() {
		return "orders"; // Create orders.html
	}

	@GetMapping("/details")
	public String userDetails() {
		return "details"; // Create details.html
	}

	@GetMapping("/address")
	public String userAddress() {
		return "address"; // Create address.html
	}
	//wellcome->postProduct
	@GetMapping("/post-product")
	public String postProduct() {
		return "PostYourProducts"; // Create post-product.html
	}
	
//*************First Start This line************************************************

	@GetMapping("/products")
	public String browseProducts() {
		return "browse-products"; // Make sure browse-products.html exists
	}

	@GetMapping("/product/{id}")
	public String viewProduct(@PathVariable String id, Model model) {
		model.addAttribute("productId", id);
		return "product-details"; // Create product-details.html for individual products
	}

	@GetMapping("/category/electronics")
	public String electronics() {
		return "electronics";
	}

	@GetMapping("/category/furniture")
	public String furniture() {
		return "furniture";
	}

	@GetMapping("/category/vehicles")
	public String vehicles() {
		return "vehicles";
	}

	@GetMapping("/category/fashion")
	public String fashion() {
		return "fashion";
	}

	@GetMapping("/category/real-estate")
	public String realEstate() {
		return "real-estate";
	}

	@GetMapping("/category/games")
	public String games() {
		return "games";
	}
}
