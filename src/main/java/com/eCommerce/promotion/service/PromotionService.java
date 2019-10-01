/**
 * 
 */
package com.eCommerce.promotion.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eCommerce.promotion.model.Promotion;

/**
 * @author Team 6
 *
 */
@Service
public interface PromotionService {
	public List<Promotion> getAllPromotions();
	public Promotion getPromotionByID(int productID);
	public Promotion updatePromotionDetailsByID(Promotion promotion);
	public String deletePromotionDetailsByID(String productID);
}
