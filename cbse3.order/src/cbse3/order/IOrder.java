package cbse3.order;

import java.util.List;

import cbse3.utils.IGeneralHandler;

public interface IOrder extends IGeneralHandler<Order> {
	@Override boolean add(Order O);
	@Override boolean remove(Order O);
	@Override List<Order> list();
}
