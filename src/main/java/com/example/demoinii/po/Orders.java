package com.example.demoinii.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int orderId;
    private Date orderDate;
    private String userId;
    private int hpId;
    private int smId;
    private int state;
    private Users user;
    private List<Orders> orders;
    private Hospital hospital;
    private List<Cireport> cireports;
    private List<Cidetailedreport> cidetailedreports;
    public Orders(int orderId, Date orderDate, String userId, int hpId, int smId, int state) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.userId = userId;
        this.hpId = hpId;
        this.smId = smId;
        this.state = state;
    }

}
