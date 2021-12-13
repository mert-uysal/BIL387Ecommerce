package bil387project.dataAccess;

import bil387project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
    User getUserByUserID(Integer id);
    User getUserByEmail(String email);
    User findUserByEmail (String email);
    boolean existsUserByEmail (String email);
}
