package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.User;
import uz.pdp.vazifa_1.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)

public interface CustomUser {
     Integer getId();
     String getFirstName();
     String getLastName();
     String getPhoneNumber();
    String getPassword();
     String getCode();
     boolean isActive();
     Set<Warehouse> getWarehouses();
}
