package edu.bzu.ecommerce.repository;

import edu.bzu.ecommerce.model.OrderProduct;
import edu.bzu.ecommerce.model.OrderProductPK;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {

}
