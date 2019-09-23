/**
 * 
 */
package com.eCommerce.promotion.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Team 6
 *
 */

@Entity
@Table(name="promotion")
public class Promotion {

	@Id
	private int productID;

	private int promotion1;
	private int promotion2;
	private int promotion3;

	@Column(name="start_date")
	private Timestamp startDate;
    @Column(name="end_date")
	private Timestamp endDate;

	public int getPromotion3() {
		return promotion3;
	}

	public void setPromotion3(int promotion3) {
		this.promotion3 = promotion3;
	}


	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getPromotion1() {
		return promotion1;
	}

	public void setPromotion1(int promotion1) {
		this.promotion1 = promotion1;
	}

	public int getPromotion2() {
		return promotion2;
	}

	public void setPromotion2(int promotion2) {
		this.promotion2 = promotion2;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}


}
