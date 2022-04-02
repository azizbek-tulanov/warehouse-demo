package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Product;
import uz.pdp.vazifa_1.projection.CustomProduct;

@RepositoryRestResource(path = "product",collectionResourceRel = "list", excerptProjection =
        CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
