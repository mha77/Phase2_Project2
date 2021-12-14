package com.markus.action;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.markus.database.Database;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int id;  
	private String name;  
	private float price;  
		
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public float getPrice() {  
	    return price;  
	}  
	public void setPrice(float price) {  
	    this.price = price;  
	}  
		  
	public String execute(){  
			
		ServletContext context = ServletActionContext.getServletContext();
		Database db = (Database) context.getAttribute("db");
		//Connection conn = db.getConnection();
		
		String sqlString = "SELECT * FROM `test`";
		
		ResultSet rs = db.query(sqlString);	
				
			
		try {
			while(rs.next()) {
			setPrice(rs.getFloat(3));
			setName(rs.getString(2));
			setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	    return "success";  
	}  
}