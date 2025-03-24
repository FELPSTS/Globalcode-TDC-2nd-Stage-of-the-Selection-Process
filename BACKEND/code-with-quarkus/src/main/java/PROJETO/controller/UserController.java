package PROJETO.controller;

import PROJETO.Service.UserService;
import PROJETO.entity.UserEntity;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.transaction.Transactional;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @POST
    @Transactional
    public Response createUser(UserEntity userEntity) {
        try {
            UserEntity createdUser = userService.createUser(userEntity);
            return Response.status(Response.Status.CREATED).entity(createdUser).build();
        } catch (Exception e) {
            // Em caso de erro, você pode capturar a exceção e retornar um erro 500 (Internal Server Error)
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao criar usuário: " + e.getMessage())
                    .build();
        }
    }
}