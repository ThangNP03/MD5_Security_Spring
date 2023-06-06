package ra.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.model.entity.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername (String username );
    boolean existsByUserName (String username);
    boolean existsByEmail (String email);
}
