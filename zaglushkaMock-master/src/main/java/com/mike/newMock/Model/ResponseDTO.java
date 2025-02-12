package com.mike.stubapp.model;

import lombok.*;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class ResponseDTO {
    private String rqUID;
    private String clientId;
    private String account;
    private String currency;
    private int balance;
    private int maxLimit;
}
