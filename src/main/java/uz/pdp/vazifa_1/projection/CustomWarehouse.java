package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Warehouse;

@Projection(types = Warehouse.class)

public interface CustomWarehouse {
     Integer getId();
     String getName();
     boolean isActive();
}
