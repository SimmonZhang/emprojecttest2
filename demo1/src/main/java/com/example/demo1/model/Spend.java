package com.example.demo1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Spend {
    private String spendId;

    private String spendUserId;

    private String spendUserName;

    private String spendHouseid;

    private String spendRoomid;

    private String spendModel;

    private String spendYear;

    private BigDecimal spendNum;

    private String spendNote;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date spendTime;


}