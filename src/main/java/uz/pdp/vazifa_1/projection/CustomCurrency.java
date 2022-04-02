package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Currency;

@Projection(types = Currency.class)

public interface CustomCurrency {
    Integer getId();
    String getName();
    boolean isActive();
}
