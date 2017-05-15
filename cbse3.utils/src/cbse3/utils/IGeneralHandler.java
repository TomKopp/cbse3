package cbse3.utils;

import java.util.List;

public interface IGeneralHandler<T> {
	/*  add, remove and list  */
	boolean add(T t);
	boolean remove(T t);
	List<T> list();
}
