package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.InputProduct;
import uz.pdp.vazifa_1.entity.Output;
import uz.pdp.vazifa_1.entity.Product;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
     Integer getId();
     Product getProduct();
     Double getAmount();
     Double getPrice();
     Date getExpiredate();
     Output getInput();
}
