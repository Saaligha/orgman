package ac.za.cput.adp3.xyzcongolmerate.repository.user.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.repository.user.UserRepository;

import java.util.HashSet;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    private Set<User> userDB;
    private static UserRepository userRepository = null;

    private UserRepositoryImpl() {
        this.userDB = new HashSet<>();
    }

    public static UserRepository getUserRepository() {
        if (userRepository == null) userRepository = new UserRepositoryImpl();
        return userRepository;
    }


    @Override
    public User create(User user) {
        userDB.add(user);
        return user;
    }


    @Override
    public User read(String email) {
        return userDB.stream().filter(user -> user.getUserEmail()== email).findAny().orElse(null);

    }


    @Override
    public User update(User user) {
        User toDelete = read(user.getUserEmail());

        if(toDelete != null) {
            userDB.remove(toDelete);
            return create(user);
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public void delete(String email) {
        User toDelete = read(email);
        if (toDelete != null){
            userDB.remove(toDelete);
        }
    }

    @Override
    public Set<User> getAll() {
        return userDB;
    }
}
