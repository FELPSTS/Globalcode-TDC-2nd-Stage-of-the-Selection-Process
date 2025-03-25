package PROJETO.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import org.glassfish.jaxb.core.v2.model.core.ID;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID id;

    @Column(name = "authorName", nullable = false)
    public String authorName;

    @Column(name = "email", nullable = false, unique = true)
    public String email;

    @Column(name = "title", nullable = false)
    public String title;

    @Column(name = "description", nullable = false)
    public String description;

    public UUID getUserId() {
        return id;
    }

    public UserEntity() {
    }

    public UserEntity(String authorName, String email, String title, String description) {
        this.authorName = authorName;
        this.email = email;
        this.title = title;
        this.description = description;
    }
}
