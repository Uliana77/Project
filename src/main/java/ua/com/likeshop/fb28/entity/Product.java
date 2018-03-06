package ua.com.likeshop.fb28.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
public class Product extends AbstractPersistable<Long> {

    String name;
    String imageURL;
    String description;
    int price;

    public Product() {
    }




    public Product(String name, String imageURL, String description, int price) {
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


   // Pageable pageable = new PageRequest(0,9);

//    ///////
//    Page<Product> productList(Pageable pageable) {
//        return null;
//    }
//    ////
}
