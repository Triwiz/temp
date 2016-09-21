package com.pack.JewelJDBC;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JewelJDBCTemplate implements JewelDAO{

	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }

	   @Override
		public void create() {
			// TODO Auto-generated method stub
			
		}


	   @Override
		public Jewel getJewel(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}

	   public List<Jewel> listJewels(String category) {
	      String SQL = "select * from jewels where category='"+category+"'";
	      List <Jewel> jewel = jdbcTemplateObject.query(SQL, 
	                                new JewelMapper());
	      return jewel;
	   }

	   public void delete(Integer id){
	      String SQL = "delete from jewels where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }

	   public void update(){
	      String SQL = "update jewel set weight = ? where id = ?";
	      jdbcTemplateObject.update(SQL);
	      System.out.println("Updated Record with ID " );
	      return;
	   }

	
	}
