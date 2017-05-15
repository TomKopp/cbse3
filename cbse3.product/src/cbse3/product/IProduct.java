package cbse3.product;

import java.util.List;

import cbse3.utils.IGeneralHandler;

public interface IProduct extends IGeneralHandler<Product>{
	@Override boolean add(Product t);
	@Override boolean remove(Product t);
	@Override List<Product> list();
}
