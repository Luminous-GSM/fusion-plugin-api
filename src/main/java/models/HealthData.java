package models;

public class HealthData {
    private String status;

    public HealthData() {
    }

    public HealthData(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
