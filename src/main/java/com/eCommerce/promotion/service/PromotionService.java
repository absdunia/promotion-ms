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
	public int getPromotion1ByID(int productID);
    public int getPromotion2yID(int productID);
	public int getPromotion3ByID(int productID);
	public Date getStartDateByID(int productID);
	public Date getEndDateByID(int productID);
	public Promotion updatePromotionDetailsByID(Promotion promotion);
	public String deletePromotionDetailsByID(int productID);
}
