package com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.dao.IProductDAO;
import com.app.MavenSpringBootMvcSecurityWithLoginLogoutAndMethodLevelThruAnnotation.model.Product;

@Controller
public class ProductTaskController {
	
	@Autowired
	private IProductDAO iproduct;
	
	@RequestMapping(value = "/welcome-product")
	public ModelAndView showWelcomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("add");
		return model;
	}
	
	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public ModelAndView callAddProduct(@RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam("desc") String desc, 
			@RequestParam("price") double price, @ModelAttribute() Product proud) throws Exception {
		iproduct.addProduct(id, name, desc, price);
		return new ModelAndView("redirect:/list-product");
	}
	
	@RequestMapping(value = "/list-product", method = RequestMethod.GET)
	public ModelAndView callfetchAllProducts() throws Exception {
		ModelAndView model = new ModelAndView("list-product");
		List<Product> productList = iproduct.getAllProducts();
		model.addObject("proudList", productList);
		return model;
	}
	
	@RequestMapping(value = "/delete-product/{id}", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')") 
	public ModelAndView callDeleteProduct(@PathVariable("id") int id) throws Exception {
		iproduct.deleteProduct(id);
		return new ModelAndView("redirect:/list-product");
	}	
}
