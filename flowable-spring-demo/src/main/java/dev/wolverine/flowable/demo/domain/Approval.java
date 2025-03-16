package dev.wolverine.flowable.demo.domain;

public class Approval {
    
    private String id;
    private boolean status;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
