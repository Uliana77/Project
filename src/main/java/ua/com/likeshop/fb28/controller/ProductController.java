package ua.com.likeshop.fb28.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import ua.com.likeshop.fb28.entity.Product;
import ua.com.likeshop.fb28.repository.ProductRepisitory;

@RestController
public class ProductController {

    @Autowired
    ProductRepisitory productRepisitory;


    @GetMapping("/product")
    public Iterable<Product> list2(@RequestParam("page") int page,
                                  @RequestParam("count") int count) {
        return productRepisitory.findAll(new PageRequest(page,count));
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody Product message) {
        productRepisitory.save(message);
        return "ok";
    }

    @DeleteMapping("/product/{id}")
    public String deletFromProd(@PathVariable("id") Long id) {
        productRepisitory.delete(id);
        return "delete from Prod";
    }
}
