package com.pack.JewelJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.pack.constants.JewelConstants;

public class JewelMapper implements RowMapper<Jewel> {
   public Jewel mapRow(ResultSet rs, int rowNum) throws SQLException {
	   
      Jewel jewel = new Jewel();
      jewel.setJewelId(rs.getInt(JewelConstants.JEWEL_ID));
      jewel.setProductName(rs.getString(JewelConstants.PRODUCT_NAME));
      jewel.setProductCode(rs.getString(JewelConstants.PRODUCT_CODE));
      jewel.setCategory(rs.getString(JewelConstants.CATEGORY));
      jewel.setJewelType(rs.getString(JewelConstants.JEWEL_TYPE));
      jewel.setMetalType(rs.getString(JewelConstants.METAL_TYPE));
      jewel.setWeight(rs.getString(JewelConstants.WEIGHT));
      jewel.setPurity(rs.getString(JewelConstants.PURITY));
      jewel.setWastage(rs.getString(JewelConstants.WASTAGE));
      jewel.setCertification(rs.getString(JewelConstants.CERTIFICATION));
      jewel.setNoOfImages(rs.getInt(JewelConstants.NO_OF_IMAGES));
      jewel.setMainImageLink(rs.getString(JewelConstants.MAIN_IMAGE_LINK));
      jewel.setAllImageLink(rs.getString(JewelConstants.ALL_IMAGES_LINK));
      jewel.setShopNameAndBranch(rs.getString(JewelConstants.SHOP_NAME_AND_BRANCH));
      jewel.setAddress(rs.getString(JewelConstants.ADDRESS));
      jewel.setDesignType(rs.getString(JewelConstants.DESIGN_TYPE));
      jewel.setOccasion(rs.getString(JewelConstants.OCCASION));
      jewel.setSex(rs.getString(JewelConstants.SEX));

      return jewel;
   }
}