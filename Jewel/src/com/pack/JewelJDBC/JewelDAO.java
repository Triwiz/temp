package com.pack.JewelJDBC;

import java.util.List;

import javax.sql.DataSource;

public interface JewelDAO {

	public void setDataSource(DataSource ds);
	
	public void create();
	
	public Jewel getJewel(Integer id);
	
	public List<Jewel> listJewels(String category);
	
	public void delete(Integer id);
	
	public void update();
	
}
