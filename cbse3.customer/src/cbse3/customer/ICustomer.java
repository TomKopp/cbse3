package cbse3.customer;

import java.util.List;

import cbse3.utils.IGeneralHandler;

public interface ICustomer extends IGeneralHandler<Customer> {
	@Override boolean add(Customer C);
	@Override boolean remove(Customer C);
	@Override List<Customer> list();
}
