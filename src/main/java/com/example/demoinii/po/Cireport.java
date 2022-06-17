package com.example.demoinii.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cireport {

    //检查项报告编号
    private int cirId;
    //检查项编号
    private int ciId;
    //检查项名称
    private String ciName;
    //所属预约编号
    private int orderId;
    /*进行的是一对多的关系*/
    private List<Cidetailedreport> cidetailedreports;
    private int docId;
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public int getCirId() {
        return cirId;
    }

    public void setCirId(int cirId) {
        this.cirId = cirId;
    }

    public int getCiId() {
        return ciId;
    }

    public void setCiId(int ciId) {
        this.ciId = ciId;
    }



    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    @Override
    public String toString() {
        return "Cireport{" +
                "cirId=" + cirId +
                ", ciId=" + ciId +
                ", ciName='" + ciName + '\'' +
                ", orderId=" + orderId +
                ", docId=" + docId +
                ", doctor=" + doctor +
                '}';
    }
}