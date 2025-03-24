package PROJETO.Service;

import PROJETO.entity.UserEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity) {
        UserEntity.persist(userEntity); // Assuming persist method is correctly implemented
        return userEntity; // Returning UserEntity instead of UserService
    }
}
