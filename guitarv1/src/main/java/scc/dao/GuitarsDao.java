package scc.dao;
import java.util.List;

import scc.entity.Guitars;

public interface GuitarsDao {

	public boolean add(Guitars guitars);
	public List<Guitars> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood);
}
