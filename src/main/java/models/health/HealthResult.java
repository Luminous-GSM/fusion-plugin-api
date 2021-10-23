package models.health;

public class HealthResult {
    private String status;

    public HealthResult() {
    }

    public HealthResult(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
