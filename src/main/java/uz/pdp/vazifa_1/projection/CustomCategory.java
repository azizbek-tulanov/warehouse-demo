package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Category;

@Projection(types = Category.class)

public interface CustomCategory {
    Integer getId();
    String getName();
    boolean isActive();
}
