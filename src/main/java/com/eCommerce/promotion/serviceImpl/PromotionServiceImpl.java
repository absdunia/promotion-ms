/**
 * 
 */
package com.eCommerce.promotion.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.promotion.model.Promotion;
import com.eCommerce.promotion.repository.PromotionCRUDRepo;
import com.eCommerce.promotion.service.PromotionService;

/**
 * @author Team 6
 *
 */
@Service
public class PromotionServiceImpl implements PromotionService {

	@Autowired
	PromotionCRUDRepo promotionCRUDRepo;

	public List<Promotion> getAllPromotions() {
		// TODO Auto-generated method stub
		return promotionCRUDRepo.findAll();
	}

	public Promotion getPromotionByID(int productID) {
		// TODO Auto-generated method stub
		return promotionCRUDRepo.findById(productID).get();
	}


	public Promotion updatePromotionDetailsByID(Promotion promotion) {
		return promotionCRUDRepo.saveAndFlush(promotion);
	}

	public String deletePromotionDetailsByID(String productID) {
		promotionCRUDRepo.deleteById(Integer.parseInt(productID));
		return "Product promotion has been removed from the DB";
	}

	public String createPromotionForProduct(Promotion promotion) {
		
		System.out.println("Product "+promotion.getProductID()+"  Promotion : 1"+promotion.getPromotion1());
		promotionCRUDRepo.save(promotion);
		return "Product has been inserted to the DB";
	}

}
