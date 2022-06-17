package com.example.demoinii.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class overallResult {
    private int orId;
    private String title;
    private String content;
    private int orderId;
}
