package bil387project.business.concretes;

import bil387project.business.abstracts.UserService;
import bil387project.dataAccess.UserDao;
import bil387project.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public void deleteUser(int userID) {
        this.userDao.deleteById(userID);
    }

    @Override
    public User updateUser(User user) {
        return this.userDao.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return this.userDao.getUserByUserID(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return this.userDao.getUserByEmail(email);
    }

    @Override
    public User login(String email, String password) {
        if(!this.userDao.existsUserByEmail(email)){
            System.out.println("Hatalı Email !!");
            return new User(0);
        }
        else {
            User existUser = this.userDao.findUserByEmail(email);
            if(!existUser.getPassword().equals(password)){
                return new User(0);
            }
            else {
                return existUser;
            }
        }
    }
}
