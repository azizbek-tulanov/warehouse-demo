package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.*;

@Projection(types = Product.class)

public interface CustomProduct {
    Integer getId();
     String getName();
     boolean isActive();

     Category getCategory();

     Attachment getPhoto();
      Measurment getMeasurment();
}
