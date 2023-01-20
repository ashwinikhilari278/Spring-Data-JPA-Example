package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "accesscard")
public class AccessCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AccessCardId;
    private Date issuedData;
   // @JsonIgnore
    @OneToOne(mappedBy = "card")
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public AccessCard() {
    }

    public AccessCard(int accessCardId, Date issuedData) {
        AccessCardId = accessCardId;
        this.issuedData = issuedData;
    }

    public long getAccessCardId() {
        return AccessCardId;
    }

    public void setAccessCardId(long accessCardId) {
        AccessCardId = accessCardId;
    }

    public Date getIssuedData() {
        return issuedData;
    }

    public void setIssuedData(Date issuedData) {
        this.issuedData = issuedData;
    }

    @Override
    public String toString() {
        return "AccessCard{" +
                "AccessCardId=" + AccessCardId +
                ", issuedData=" + issuedData +

                '}';
    }
}
