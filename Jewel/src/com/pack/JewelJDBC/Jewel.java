package com.pack.JewelJDBC;

public class Jewel {
	private int jewelId;
	private String productName;
	private String productCode;
	private String category;
	private String jewelType;
	private String metalType;
	private String weight;
	private String purity;
	private String wastage;
	private String certification;
	private int noOfImages;
	private String mainImageLink;
	private String allImageLink;
	private String shopNameAndBranch;
	private String address;
	private String designType;
	private String occasion;
	private String sex;
	/**
	 * @return the jewelId
	 */
	public int getJewelId() {
		return jewelId;
	}
	/**
	 * @param jewelId the jewelId to set
	 */
	public void setJewelId(int jewelId) {
		this.jewelId = jewelId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the jewelType
	 */
	public String getJewelType() {
		return jewelType;
	}
	/**
	 * @param jewelType the jewelType to set
	 */
	public void setJewelType(String jewelType) {
		this.jewelType = jewelType;
	}
	/**
	 * @return the metalType
	 */
	public String getMetalType() {
		return metalType;
	}
	/**
	 * @param metalType the metalType to set
	 */
	public void setMetalType(String metalType) {
		this.metalType = metalType;
	}
	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * @return the purity
	 */
	public String getPurity() {
		return purity;
	}
	/**
	 * @param purity the purity to set
	 */
	public void setPurity(String purity) {
		this.purity = purity;
	}
	/**
	 * @return the wastage
	 */
	public String getWastage() {
		return wastage;
	}
	/**
	 * @param wastage the wastage to set
	 */
	public void setWastage(String wastage) {
		this.wastage = wastage;
	}
	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}
	/**
	 * @param certification the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}
	/**
	 * @return the noOfImages
	 */
	public int getNoOfImages() {
		return noOfImages;
	}
	/**
	 * @param noOfImages the noOfImages to set
	 */
	public void setNoOfImages(int noOfImages) {
		this.noOfImages = noOfImages;
	}
	/**
	 * @return the mainImageLink
	 */
	public String getMainImageLink() {
		return mainImageLink;
	}
	/**
	 * @param mainImageLink the mainImageLink to set
	 */
	public void setMainImageLink(String mainImageLink) {
		this.mainImageLink = mainImageLink;
	}
	/**
	 * @return the allImageLink
	 */
	public String getAllImageLink() {
		return allImageLink;
	}
	/**
	 * @param allImageLink the allImageLink to set
	 */
	public void setAllImageLink(String allImageLink) {
		this.allImageLink = allImageLink;
	}
	/**
	 * @return the shopNameAndBranch
	 */
	public String getShopNameAndBranch() {
		return shopNameAndBranch;
	}
	/**
	 * @param shopNameAndBranch the shopNameAndBranch to set
	 */
	public void setShopNameAndBranch(String shopNameAndBranch) {
		this.shopNameAndBranch = shopNameAndBranch;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the designType
	 */
	public String getDesignType() {
		return designType;
	}
	/**
	 * @param designType the designType to set
	 */
	public void setDesignType(String designType) {
		this.designType = designType;
	}
	/**
	 * @return the occasion
	 */
	public String getOccasion() {
		return occasion;
	}
	/**
	 * @param occasion the occasion to set
	 */
	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Jewel() {
		super();
	}
	public Jewel(int jewelId, String productName, String productCode, String category, String jewelType,
			String metalType, String weight, String purity, String wastage, String certification, int noOfImages,
			String mainImageLink, String allImageLink, String shopNameAndBranch, String address, String designType,
			String occasion, String sex) {
		super();
		this.jewelId = jewelId;
		this.productName = productName;
		this.productCode = productCode;
		this.category = category;
		this.jewelType = jewelType;
		this.metalType = metalType;
		this.weight = weight;
		this.purity = purity;
		this.wastage = wastage;
		this.certification = certification;
		this.noOfImages = noOfImages;
		this.mainImageLink = mainImageLink;
		this.allImageLink = allImageLink;
		this.shopNameAndBranch = shopNameAndBranch;
		this.address = address;
		this.designType = designType;
		this.occasion = occasion;
		this.sex = sex;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jewel [jewelId=" + jewelId + ", productName=" + productName + ", productCode=" + productCode
				+ ", category=" + category + ", jewelType=" + jewelType + ", metalType=" + metalType + ", weight="
				+ weight + ", purity=" + purity + ", wastage=" + wastage + ", certification=" + certification
				+ ", noOfImages=" + noOfImages + ", mainImageLink=" + mainImageLink + ", allImageLink=" + allImageLink
				+ ", shopNameAndBranch=" + shopNameAndBranch + ", address=" + address + ", designType=" + designType
				+ ", occasion=" + occasion + ", sex=" + sex + "]";
	}
	
}