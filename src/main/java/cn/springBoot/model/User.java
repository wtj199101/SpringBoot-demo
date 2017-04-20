package cn.springBoot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name="MY_USER_T")
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1883838431615170196L;
    @Id
    private String id;

    private String username;
    private String password;
    private String phone;
    private String email;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
                + ", email=" + email + "]";
    }


    
    
}
