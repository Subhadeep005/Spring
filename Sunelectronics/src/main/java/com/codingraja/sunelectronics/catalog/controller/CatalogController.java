package com.codingraja.sunelectronics.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingraja.sunelectronics.catalog.service.CatalogService;

@Controller
@RequestMapping("/product")
public class CatalogController {

	@Autowired
	private CatalogService catalogService;

	public CatalogController(CatalogService catalogService) {
		super();
		this.catalogService = catalogService;
	}

	private static final String PRODUCT_LISTING_PAGE = "catalog/productListingPage";
	private static final String PRODUCT_DETAIL_PAGE = "catalog/productDetailPage";

	@RequestMapping("/viewAllProducts")
	public String productListingPage(Model model) {
		model.addAttribute("productList", this.catalogService.findAllProducts());
		return PRODUCT_LISTING_PAGE;
	}

	@RequestMapping("/{category}/{subCategory}")
	public String productListingPage(@PathVariable String category, @PathVariable String subCategory, Model model) {
		if ("sound-device".equals(subCategory))
			subCategory = "Sound Device";
		if ("washing-machine".equals(subCategory))
			subCategory = "Washing Machine";
		model.addAttribute("productList",
				this.catalogService.findProductByCategoryAndSubcategory(category, subCategory));
		return PRODUCT_LISTING_PAGE;
	}

	@RequestMapping("{category}/{id}/productDetail")
	public String productDetailPage(@PathVariable String category, @PathVariable Long id, Model model) {
		model.addAttribute("product", this.catalogService.findProductById(id));
		model.addAttribute("relatedProducts", this.catalogService.findRelatedProductsByCategory(category));
		return PRODUCT_DETAIL_PAGE;
	}
}
