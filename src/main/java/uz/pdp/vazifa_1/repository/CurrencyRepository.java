package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Currency;
import uz.pdp.vazifa_1.projection.CustomCurrency;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list", excerptProjection =
        CustomCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
