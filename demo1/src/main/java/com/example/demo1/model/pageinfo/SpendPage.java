package com.example.demo1.model.pageinfo;

import lombok.Data;

import java.util.Date;

@Data
public class SpendPage {
    private String name;
    private String hId;
    private String rId;
    private Date createTime;
    private String year;
    private Integer page=1;
}
