/**
 * 
 */
package com.eCommerce.promotion.controller;

import java.util.Date;
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

	@GetMapping(value = "/getPromotion1ByID",produces="application/json")
	public int getPromotion1ByID(@RequestParam int productID) {
		return promotionServiceImpl.getPromotion1ByID(productID);
	}

	@GetMapping(value = "/getPromotion2ByID",produces="application/json")
	public int getPromotion2yID(@RequestParam int productID) {
		return promotionServiceImpl.getPromotion2yID(productID);
	}

	@GetMapping(value = "/getPromotion3ByID",produces="application/json")
	public int getPromotion3ByID(@RequestParam int productID) {
		return promotionServiceImpl.getPromotion3ByID(productID);
	}

	@GetMapping(value = "/getProductStartDateByID",produces="application/json")
	public Date getStartDateByID(@RequestParam int productID) {
		// TODO Auto-generated method stub
		return promotionServiceImpl.getStartDateByID(productID);
	}

	@GetMapping(value = "/getProductEndDateByID",produces="application/json")
	public Date getEndDateByID(@RequestParam int productID) {
		// TODO Auto-generated method stub
		return promotionServiceImpl.getEndDateByID(productID);
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
	

	@DeleteMapping(value="/deletePromotionsByID",consumes="application/json",produces="application/json")
	public String deletePromotionDetails(@RequestParam int productID)
	{
	return promotionServiceImpl.deletePromotionDetailsByID(productID);	
	}
	
	@PostMapping(value="/createPromotionForProduct",consumes="application/json",produces="application/json")
	public String createPromotionForProduct(@RequestBody Promotion promotion)
	{
	return promotionServiceImpl.createPromotionForProduct(promotion);	
	}
}
