package ua.com.likeshop.fb28.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ua.com.likeshop.fb28.entity.Product;

import java.util.List;

public interface ProductRepisitory extends CrudRepository<Product, Long>, PagingAndSortingRepository<Product, Long> {


 //   Iterable<Product> findAll(Sort sort);
    //new code
    //Page<Product> findAll(Pageable pageable);


    ///////

//    List<Product> getAllPostsByRank(PageRequest pageRequest);
//
//

//    ///////
}




