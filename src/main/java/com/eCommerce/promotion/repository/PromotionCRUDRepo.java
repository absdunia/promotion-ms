/**
 * 
 */
package com.eCommerce.promotion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.promotion.model.Promotion;

/**
 * @author Team 6
 *
 */
@Repository
public interface PromotionCRUDRepo extends JpaRepository<Promotion, Integer>  {

}
