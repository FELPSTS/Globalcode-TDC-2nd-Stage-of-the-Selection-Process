package PROJETO.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // Utilize AUTO para UUID
    public UUID id;

    @Column(name = "authorName")
    public String authorName;

    @Column(name = "email")
    public String email;
}