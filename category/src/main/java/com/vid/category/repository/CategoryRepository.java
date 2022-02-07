package com.vid.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vid.category.dto.OrderResponse;
import com.vid.category.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

   @Query("SELECT new com.vid.category.dto.OrderResponse(c.name , p.productName) FROM Category c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
