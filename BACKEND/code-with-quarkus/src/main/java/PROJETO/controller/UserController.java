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

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") UUID userId) {
        UserEntity user = userService.findById(userId);
        if (user == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Usuário não encontrado").build();
        }
        return Response.ok(user).build();
    }

    @POST
    @Transactional
    public Response createUser(UserEntity userEntity) {
        UserEntity createdUser = userService.createUser(userEntity);
        return Response.status(Response.Status.CREATED).entity(createdUser).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteUserById(@PathParam("id") UUID id) {
        userService.deleteById(id);
        return Response.noContent().build();
    }
}
