package two.db.dao;

import java.util.List;

//CRUD
public interface Dao<E>{

    E create(E e);

    E update(E e);

    E delete(E e);

    List<E> findAll();

    E findById(int id);
}
