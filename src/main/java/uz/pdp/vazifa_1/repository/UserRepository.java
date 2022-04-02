package uz.pdp.vazifa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.vazifa_1.entity.User;
import uz.pdp.vazifa_1.projection.CustomUser;

@RepositoryRestResource(path = "users",collectionResourceRel = "list", excerptProjection =
        CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
