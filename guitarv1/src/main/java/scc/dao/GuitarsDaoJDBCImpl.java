package scc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import scc.dbutil.DbUtil;
import scc.entity.Guitars;

public class GuitarsDaoJDBCImpl implements GuitarsDao {
	@Override
	public boolean add(Guitars guitars) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into guitar values(?,?,?,?,?,?,?)", 
		new Object[]{guitars.getSerialNumber(),guitars.getPrice(),guitars.getBuilder(),
		guitars.getModel(),guitars.getType(),guitars.getBackWood(),guitars.getTopWood()});		
	}
	@Override
	public List<Guitars> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		String strsql= "select * from guitar where 1 = 1 ";
		if(type.length() > 0){
			strsql+=String.format("and type='"+type+"'");
		}
		if(backWood.length() > 0){
			strsql+=String.format("and backWood='"+backWood+"'");
		}
		if(model.length() > 0){
			strsql+=String.format("and model='"+model+"'");
		}
		if(price!=0){
			strsql+=String.format("and price='"+price+"'");
	   }
		if(serialNumber.length() > 0){
			strsql+=String.format("and serialNumber='"+serialNumber+"'");
	   }	
		if(topWood.length() > 0){
			strsql+=String.format("and topWood='"+topWood+"'");
       }	
	    if(type.length() > 0){
	    	strsql+=String.format("and type='"+type+"'");
       }
		List<Guitars> guitarList=new ArrayList<Guitars>();
		Guitars guitars=null;
		try{
			ResultSet rs= DbUtil.executeQuery(strsql, new Object[]{});
			while(rs.next()){
				guitars=new Guitars();
				guitars.setSerialNumber(rs.getString(1));
				guitars.setPrice(rs.getDouble(2));
				guitars.setBuilder(rs.getString(3));
				guitars.setModel(rs.getString(4));
				guitars.setType(rs.getString(5));
				guitars.setBackWood(rs.getString(6));
				guitars.setTopWood(rs.getString(7));
				guitarList.add(guitars);
			}					
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitarList;
}
}
