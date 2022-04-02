package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.OutputProduct;
import uz.pdp.vazifa_1.projection.CustomOutputProduct;

@RepositoryRestResource(path = "users",collectionResourceRel = "list", excerptProjection =
        CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
