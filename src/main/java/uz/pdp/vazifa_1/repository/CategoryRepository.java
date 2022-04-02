package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.Category;
import uz.pdp.vazifa_1.projection.CustomCategory;

@RepositoryRestResource(path = "category",collectionResourceRel = "list", excerptProjection =
        CustomCategory.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
