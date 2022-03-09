package com.grubhub.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private long id;
    private String firstName;
    private String lastName;
}
