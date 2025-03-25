package PROJETO.Service;

import PROJETO.entity.UserEntity;
import PROJETO.exception.UserNotFoundExeception;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    public UserEntity createUser(UserEntity userEntity) {
        userEntity.persist();
        return userEntity;
    }

    public List<UserEntity> findAll(Integer page, Integer pageSize) {
        return UserEntity.findAll()
                .page(page, pageSize)
                .list();
    }

    public UserEntity findById(UUID userId) {
        return (UserEntity) UserEntity.findByIdOptional(userId)
                .orElseThrow(UserNotFoundExeception::new);
    }
}
