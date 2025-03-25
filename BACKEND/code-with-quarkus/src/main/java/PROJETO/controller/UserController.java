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

    // Método para buscar todos os usuários
    @GET
    public Response findAll(@QueryParam("page") @DefaultValue("0") Integer page,
                            @QueryParam("pagesize") @DefaultValue("10") Integer pagesize) {
        try {
            var users = userService.findAll(page, pagesize);
            return Response.ok(users).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao buscar usuários: " + e.getMessage())
                    .build();
        }
    }

    // Método para criar um novo usuário
    @POST
    @Transactional
    public Response createUser(UserEntity userEntity) {
        try {
            UserEntity createdUser = userService.createUser(userEntity);
            return Response.status(Response.Status.CREATED).entity(createdUser).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity("Erro ao criar usuário: " + e.getMessage())
                    .build();
        }
    }


    // Método para buscar um usuário por ID
    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") UUID userId) {
        try {
            return Response.ok(userService.findById(userId)).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Usuário não encontrado: " + e.getMessage())
                    .build();
        }
    }
}
