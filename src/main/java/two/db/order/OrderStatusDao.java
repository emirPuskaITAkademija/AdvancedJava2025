package two.db.order;

import two.db.dao.Dao;

import java.util.List;

public class OrderStatusDao implements Dao<OrderStatus> {
    @Override
    public OrderStatus create(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public OrderStatus update(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public OrderStatus delete(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public List<OrderStatus> findAll() {
        return List.of();
    }

    @Override
    public OrderStatus findById(int id) {
        return null;
    }
}
