package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Supplier;
import uz.pdp.vazifa_1.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier",collectionResourceRel = "list", excerptProjection =
        CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
