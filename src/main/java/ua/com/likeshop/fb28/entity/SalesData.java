package ua.com.likeshop.fb28.entity;

public class SalesData {
    private Number id;
    private Number sold;
    private Product product;

    public SalesData() {
    }

    public SalesData(Object[] data) {
        this.id = (Number) data[0];
        this.sold = (Number) data[1];
    }

    public SalesData(Long id, Long sold) {
        this.id = id;
        this.sold = sold;
    }

    public Number getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getSold() {
        return sold;
    }

    public void setSold(Long sold) {
        this.sold = sold;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
