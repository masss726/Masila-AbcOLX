package com.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.model.product;
import com.repo.ProductRepository;

@Controller
public class MasilaMainController {

	@GetMapping("/")
	public String Index() {
		return "wellcome";
	}

	// wellcome --> browesProducts

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

	// wellcome->postProduct
	@GetMapping("/post-product")
	public String postProduct() {
		return "PostYourProducts"; // Create post-product.html
	}

//*************First Start This line************************************************

	@GetMapping("/products")
	public String browseProducts() {
		return "browse-products"; // Make sure browse-products.html exists
	}
	
		@Autowired
		product product;
		
		ProductRepository ProductRepo;

		//afdfsdfasdfsafsdafd
		public MasilaMainController(com.model.product product, ProductRepository productRepo) {
			super();
			this.product = product;
			ProductRepo = productRepo;
		}

		// Save Product Detailes From PostYourProducts
		@PostMapping("/saveProductDetails") // No spaces in mapping
		public String saveProduct(
		        @RequestParam("name") String name,
		        @RequestParam("category") String category,
		        @RequestParam("description") String description,
		        @RequestParam("price") Double price,
		        @RequestParam("image") MultipartFile imageFile,
		        Model model) throws IOException {
			
		        product.setName(name);
		        product.setCategory(category);
		        product.setDescription(description);
		        product.setPrice(price);
		        product.setImage(imageFile.getBytes());

		        ProductRepo.save(product);

		        model.addAttribute("product", product);
		        return "post_success"; // Redirect to success page
		    
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
