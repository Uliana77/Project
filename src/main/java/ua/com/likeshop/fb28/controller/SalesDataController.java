package ua.com.likeshop.fb28.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.com.likeshop.fb28.entity.SalesData;
import ua.com.likeshop.fb28.repository.OrderRepository;
import ua.com.likeshop.fb28.repository.ProductRepisitory;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SalesDataController {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductRepisitory productRepisitory;

    @GetMapping("/salesData")
    public List<SalesData> salesData() {
        return getSalesData();
    }

    private List<SalesData> getSalesData() {
        List<SalesData> data = new ArrayList<>();
        for (Object[] o : orderRepository.selectSalesData()) {
            SalesData salesData = new SalesData(o);
            salesData.setProduct(productRepisitory.findOne(salesData.getId().longValue()));
            data.add(salesData);
        }
        return data;
    }
}
