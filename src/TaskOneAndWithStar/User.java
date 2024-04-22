package TaskOneAndWithStar;

import java.util.Objects;

public class User implements Cloneable {
    private int id = 0;
    private String login;
    private String password;
    private Status status;

    public User(int id, String login, String password, Status status) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status.setStatus(status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(status, user.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, status);
    }

    @Override
    public String toString() {
        return "TaskOneAndWithStar.User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    protected User cloneShallow() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    protected User cloneDeep() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.status = this.status.clone();
        return clone;
    }
}
