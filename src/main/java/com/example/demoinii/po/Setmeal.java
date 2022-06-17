package com.example.demoinii.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Setmeal {
    private int smId;
    private String sname;
    private int type;
    private int price;
    private List<Setdetailed> setdetailed;


}
