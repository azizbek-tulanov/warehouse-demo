package uz.pdp.vazifa_1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.vazifa_1.entity.Client;
import uz.pdp.vazifa_1.entity.Currency;
import uz.pdp.vazifa_1.entity.Output;
import uz.pdp.vazifa_1.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Output.class)

public interface CustomOutput {
      Integer getId();
      Timestamp getDate();
      Warehouse getWarehouse();
      Currency getCurrency();
      String getFactureNumber();
      String getCode();
      Client getClient();

}
