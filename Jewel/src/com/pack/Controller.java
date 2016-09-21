package com.pack;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.JewelJDBC.Jewel;
import com.pack.JewelJDBC.JewelJDBCTemplate;

@Path("/jewels")
@Produces(MediaType.APPLICATION_JSON)
public class Controller {
	
	@Path("/{category}")
	@GET
	public List listJewels(@PathParam ("category") String category) 
	{
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

      JewelJDBCTemplate jewelJDBCTemplate = 
      (JewelJDBCTemplate)context.getBean("jewelJDBCTemplate");
      
      List<Jewel> jewel = jewelJDBCTemplate.listJewels(category);
      ((AbstractApplicationContext) context).close();
      return jewel;
      }
}