package edu.bzu.ecommerce.service;

import edu.bzu.ecommerce.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Iterable<Order> GetAllOrdersByStatusAndDateCreatedGreaterThan();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}
