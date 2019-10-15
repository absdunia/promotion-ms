/**
 * 
 */
package com.eCommerce.promotion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.promotion.model.Promotion;
import com.eCommerce.promotion.serviceImpl.PromotionServiceImpl;

/**
 * @author Team 6
 *
 */

@RestController
@RequestMapping("/eCommerce/promotion")
public class PromotionController {

	@Autowired
	private PromotionServiceImpl promotionServiceImpl;

	@GetMapping(value = "/getAllPromotions",produces="application/json")
	public List<Promotion> getAllPromotions() {
		return promotionServiceImpl.getAllPromotions();
	}

	@GetMapping(value = "/getPromotionByID",produces="application/json")
	public Promotion getPromotion1ByID(@RequestParam int productID) {
		return promotionServiceImpl.getPromotionByID(productID);
	}

	@GetMapping(value="/",produces="application/json")
	public String welcomeToPromotionsPage()
	{
		return "Welcome to the Promotions Page";
	}
	
	@PutMapping(value="/updatePromotionsByID",consumes="application/json",produces="application/json")
	public Promotion updatePromotionDetails(@RequestBody Promotion promotion)
	{
	return promotionServiceImpl.updatePromotionDetailsByID(promotion);	
	}
	

	@DeleteMapping(value="/deleteByProductID",produces="application/json")
	public String deletePromotionDetails(@RequestParam String productID)
	{
	return promotionServiceImpl.deletePromotionDetailsByID(productID);	
	}
	
	@PostMapping(value="/createPromotionForProduct",consumes="application/json",produces="application/json")
	public Promotion createPromotionForProduct(@RequestBody Promotion promotion)
	{
	return promotionServiceImpl.createPromotionForProduct(promotion);
	}
}
