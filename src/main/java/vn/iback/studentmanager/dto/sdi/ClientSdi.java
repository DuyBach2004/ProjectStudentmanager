package vn.iback.studentmanager.dto.sdi;

import lombok.Data;

@Data
public class ClientSdi {
    private String name;
    private String username;
    private String email;

    public ClientSdi(String name, String username, String email) {
        this.name = name;
        this.username = username;
        this.email = email;
    }

    public ClientSdi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
