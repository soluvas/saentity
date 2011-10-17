package com.soluvas.sample.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Product.
 * 
 * Fields:
 * <ol>
 *   <li>product_id</li>
 *   <li>set</li>
 *   <li>name</li>
 *   <li>type</li>
 *   <li>sku</li>
 *   <li>price</li>
 * </ol>
 *
 * @author ceefour
 */
public class Product {
	
	private Integer productId;
	private Integer set;
	private String name;
	private String type;
	private String sku;
	private BigDecimal price;
	
	//PROTECTED REGION ID (custom.methods) ENABLED START
	// !!!!!!! add your own methods here
	//PROTECTED REGION END
	
	@Override public String toString() {
		return "Product(productId=" + productId + ", sku=" + sku + ", name=" + name + ", type=" + type + ", price=" + price + ")";
	}
	
	/**
	 * product_id
	 * 
	 */
	public Integer getProductId() { return productId; }
	public void setProductId(Integer productId) { this.productId = productId; }
	
	/**
	 * set
	 * 
	 */
	public Integer getSet() { return set; }
	public void setSet(Integer set) { this.set = set; }
	
	/**
	 * name
	 * Product name
	 */
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	/**
	 * type
	 * Type of product
	 */
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	
	/**
	 * sku
	 * Stock-Keeping Unit (SKU)
	 */
	public String getSku() { return sku; }
	public void setSku(String sku) { this.sku = sku; }
	
	/**
	 * price
	 * Sale price
	 */
	public BigDecimal getPrice() { return price; }
	public void setPrice(BigDecimal price) { this.price = price; }
	
}
