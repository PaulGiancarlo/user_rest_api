package create.user.rest.pdiaz.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private final long id;
    private final String name;
    private final String password;
    private final String email;
    private final Date created;
    private final Date modified;
    private final Date lastLogin;
    private final String token;
    private final String isActive;
    private Phones phones;
    
    public User(long id, String name, String password, String email, Date created, Date modified, Date lastLogin,
    String token, String isActive, Phones phones) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.created = created;
        this.modified = modified;
        this.lastLogin = lastLogin;
        this.token = token;
        this.isActive = isActive;
        this.phones = phones;
    }

	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public Date getCreated() {
		return created;
	}
	public Date getModified() {
		return modified;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public String getToken() {
		return token;
	}
	public String getIsActive() {
		return isActive;
	}
	public Phones getPhones() {
		return phones;
	}
	public void setPhones(Phones phones) {
		this.phones = phones;
    }
    
	public long getId() {
		return id;
	}

    

}