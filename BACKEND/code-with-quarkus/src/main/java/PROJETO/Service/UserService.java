package PROJETO.Service;

import PROJETO.entity.UserEntity;
import PROJETO.exception.UserNotFoundExeception;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class UserService {

    // Método para criar um usuário
    public UserEntity createUser(UserEntity userEntity) {
        userEntity.persist();
        return userEntity;
    }

    // Método para buscar todos os usuários com paginação
    public List<UserEntity> findAll(Integer page, Integer pageSize) {
        return UserEntity.findAll()
                .page(page, pageSize)
                .list();
    }

    public UserEntity findById(UUID userid) {
        return (UserEntity) UserEntity.findByIdOptional(userid)
                .orElseThrow(UserNotFoundExeception::new);
    }

}
