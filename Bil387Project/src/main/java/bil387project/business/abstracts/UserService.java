package bil387project.business.abstracts;

import bil387project.entities.User;

public interface UserService {
    User addUser(User user);
    void deleteUser(int userID);
    User updateUser(User user);
    User getUserById(Integer id);
    User getUserByEmail(String email);
    User login(String email, String password);
}
