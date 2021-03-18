package com;

import java.sql.*;

public class SampleLab {
	
	
	public Connection connect() {
		
		Connection con = null;
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","dilshik980310*@1");
				
				System.out.println("Successfully Connected");
				
			
			
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
		
		
			return con;
	}
	
	public String InsertItem(String productId, String productName, String quantity, String price, String description) {
		
		String output = "";
		
		 
		try {
				Connection con = connect();
				
				if(con == null) {
					
					return "Error while inserting to the database";
					
				}

				String sql = "insert into product_details (`ProductId`,`ProductName`,`Quantity`,`Price`,`Description`)" + " values  (?,?,?,?,?)";
				
				PreparedStatement pst = con.prepareStatement(sql);
				
				pst.setInt(1, 0);
				pst.setString(1,productId);
				pst.setString(2,productName);
				pst.setString(3, quantity);
				pst.setDouble(4, Double.parseDouble(price));
				pst.setString(5, description);
				
				pst.execute();
				con.close();
				
				System.out.println("Inserted Successfully");
				output = "Inserted Successfully";
			
			
			
			}catch(Exception e) {
				
				System.out.println("Error while inserting");
				//output = "Error while inerting";
				System.err.println(e.getMessage());
				
			}
		
		
			return output;
	
	}
	
	public String readProducts() {
		
		String output = "";
		
		try {
				Connection con = null;
				
				if(con == null) {
					
					
					
				}
			
			
			
			}catch(Exception e) {
				
				
				
				
			}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}

	
