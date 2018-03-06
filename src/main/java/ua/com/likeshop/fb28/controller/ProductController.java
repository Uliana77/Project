package ua.com.likeshop.fb28.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.method.P;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.com.likeshop.fb28.entity.Product;
import ua.com.likeshop.fb28.repository.ProductRepisitory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    List<Product> listP = new ArrayList<>();
    @Autowired
    ProductRepisitory productRepisitory;

//
//    @GetMapping("/product")
//    public Iterable<Product> list() {
//        return productRepisitory.findAll(new PageRequest());
//    }
////////////

//}
//    //////////



//@RequestMapping("/product")
//public String showPages(Model model, Pageable pageable) {
//
//    model.addAttribute("product", productRepisitory.findAll(pageable));
//    return "product";
//}
//    public String showUsers(Model model,
//                            @Qualifier("foo") Pageable first,
//                            @Qualifier("bar") Pageable second) {
//return "hello";

///////////
////
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


    //This is for testing
//    @GetMapping("/fakeProd")
//    public String fake() {
//
//        productRepisitory.save(new Product("item1", "http://localhost:63342/templatemo_367_shoes/css/images/product/10.jpg", "asasas", 26));
//        productRepisitory.save(new Product("item2", "http://localhost:63342/templatemo_367_shoes/css/images/product/10.jpg", "qweasasas", 526));
//        productRepisitory.save(new Product("item3", "http://localhost:63342/templatemo_367_shoes/css/images/product/10.jpg", "asasas", 26));
//        return "fake";
//    }


}
