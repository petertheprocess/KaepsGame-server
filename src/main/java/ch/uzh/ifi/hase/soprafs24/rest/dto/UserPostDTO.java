package ch.uzh.ifi.hase.soprafs24.rest.dto;

public class UserPostDTO {

  private String username;
  private String password;
  private String token;
  private String id;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
    return id;
  };

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
}
