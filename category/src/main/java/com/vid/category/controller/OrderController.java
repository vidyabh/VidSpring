package com.vid.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vid.category.dto.OrderRequest;
import com.vid.category.dto.OrderResponse;
import com.vid.category.entity.Category;
import com.vid.category.repository.CategoryRepository;
import com.vid.category.repository.ProductRepository;

@RestController
public class OrderController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Category placeOrder(@RequestBody OrderRequest request){
       return categoryRepository.save(request.getCategory());
    }

    @GetMapping("/findAllOrders")
    public List<Category> findAllOrders(){
        return categoryRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return categoryRepository.getJoinInformation();
    }
}
