package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Supplier;

@Projection(types = Supplier.class)

public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean isActive();
    String getPhoneNumber();
}
