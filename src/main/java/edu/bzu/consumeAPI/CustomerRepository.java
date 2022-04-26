package edu.bzu.consumeAPI;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
//public List<Expense> findByItem(String item);
//
//    @Query("SELECT e FROM Expense e WHERE e.amount >= :amount")
//    public List<Expense> listItemsWithPriceOver(@Param("amount") float amount);
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}