package ua.com.likeshop.fb28.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.likeshop.fb28.entity.Product;
import ua.com.likeshop.fb28.repository.ProductRepisitory;

@RestController
public class ProductController {

    @Autowired
    ProductRepisitory productRepisitory;

    @GetMapping("/product")
    public Iterable<Product> list(){
        return productRepisitory.findAll();
    }
    @PutMapping("/product")
    public String addProduct(){
return addProduct();
    }



    @GetMapping("/fakeProd")
    public String fake(){
        productRepisitory.save(new Product("item1","http://localhost:63342/templatemo_367_shoes/css/images/product/10.jpg","asasas",26));
        productRepisitory.save(new Product("item3","http://localhost:63342/templatemo_367_shoes/css/images/product/10.jpg","qweasasas",526));
        productRepisitory.save(new Product("item2","http://localhost:63342/templatemo_367_shoes/css/images/product/10.jpg","asasas",26));
        return "fake";
    }
}
