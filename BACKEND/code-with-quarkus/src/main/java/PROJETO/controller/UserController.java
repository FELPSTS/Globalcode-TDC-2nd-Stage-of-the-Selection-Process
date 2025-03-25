package PROJETO.controller;

import PROJETO.Service.UserService;
import PROJETO.entity.UserEntity;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.transaction.Transactional;
import java.util.UUID;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GET
    public Response findAll(@QueryParam("page") @DefaultValue("0") Integer page,
                            @QueryParam("pagesize") @DefaultValue("10") Integer pagesize) {
        var users = userService.findAll(page, pagesize);
        return Response.ok(users).build();
    }

    @POST
    @Transactional
    public UserEntity createUser(UserEntity userEntity) {
        userEntity.persist();  // Persistir o usuário no banco
        return userEntity;
    }

    // Endpoint para buscar um usuário por ID
    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") UUID userId) {
        return Response.ok(userService.findById(userId)).build();
    }
}
