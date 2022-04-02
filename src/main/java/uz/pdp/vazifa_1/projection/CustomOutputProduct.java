package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Output;
import uz.pdp.vazifa_1.entity.OutputProduct;
import uz.pdp.vazifa_1.entity.Product;

import java.sql.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
     Integer getId();
     Product getProduct();
     Double getAmount();
     Double getPrice();
     Date getExpiredate();
     Output getOutput();
}
