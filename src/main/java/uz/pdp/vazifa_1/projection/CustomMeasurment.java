package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Measurment;

@Projection(types = Measurment.class)

public interface CustomMeasurment {
    Integer getId();
    String getName();
    boolean isActive();
}
