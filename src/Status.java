import java.util.Objects;

public class Status implements Cloneable{
    private String status;

    public Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status1 = (Status) o;
        return Objects.equals(status, status1.status) || status.equalsIgnoreCase(status1.status);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(status);
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                '}';
    }

    @Override
    protected Status clone() throws CloneNotSupportedException {
        return (Status) super.clone();
    }
}
