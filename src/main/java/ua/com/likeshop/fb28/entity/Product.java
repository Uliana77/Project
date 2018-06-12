package ua.com.likeshop.fb28.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
public class Product extends AbstractPersistable<Long> {

    String name;
    String imageId;
    String description;
    int price;

    public Product() {
    }


    public Product(String name, String imageId, String description, int price) {
        this.name = name;
        this.imageId = imageId;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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
}
