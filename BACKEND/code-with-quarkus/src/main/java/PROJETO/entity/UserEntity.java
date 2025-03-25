package PROJETO.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // UUID gerado automaticamente
    public UUID id;

    @Column(name = "authorName")
    public String authorName;

    @Column(name = "email")
    public String email;

    @Column(name = "title")
    public String title;

    @Column(name = "description")
    public String description;

    // Getters and setters (se necessário)
}
