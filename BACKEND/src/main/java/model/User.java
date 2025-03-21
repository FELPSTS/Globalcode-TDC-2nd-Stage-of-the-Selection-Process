package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class User extends PanacheEntity {
    public String authorName;
    public String email;
}
