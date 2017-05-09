package service;

import java.util.List;

import scc.dao.GuitarsDaoJDBCImpl;
import scc.entity.Guitars;

public class GuitarsService {

	private static GuitarsDaoJDBCImpl guitarsDao=new GuitarsDaoJDBCImpl();
	public boolean add(Guitars guitars){
	    return	guitarsDao.add(guitars);		
	}
	
	public static GuitarsDaoJDBCImpl getGuitarsDao() {
		return guitarsDao;
	}

	public static void setGuitarsDao(GuitarsDaoJDBCImpl guitarsDao) {
		GuitarsService.guitarsDao = guitarsDao;
	}

	public List<Guitars> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		return guitarsDao.getAll(price,serialNumber, builder, model, type, backWood, topWood);
	}	

}