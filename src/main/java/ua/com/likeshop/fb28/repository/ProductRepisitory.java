package ua.com.likeshop.fb28.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.likeshop.fb28.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ProductRepisitory extends JpaRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {


    default List<Product> getProductsByIds(List<Long> ids) {
        List<Product> productList = this.findAll(ids);
        Map<Long, Product> productsMap = new HashMap<>();
        for (Product p : productList) {
            productsMap.put(p.getId(), p);
        }
        List<Product> result = new ArrayList<>();
        for (long id : ids) {
            result.add(productsMap.get(id));
        }
        return result;
    }
}




