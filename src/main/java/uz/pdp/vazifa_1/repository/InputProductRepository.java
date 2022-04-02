package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.InputProduct;
import uz.pdp.vazifa_1.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "list",
        excerptProjection =
                CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
