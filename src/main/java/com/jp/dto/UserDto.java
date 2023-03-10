package com.jp.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDto {

    @NotNull(message = "username should not be null")
    private String username;

    @NotNull(message = "password can not be null")
    @Min(8)
    private String password;

    @NotBlank
    private String nationality;

    @Email(message = "invalid email address")
    private String email;

    @NonNull
    @Digits(fraction = 0, integer = 11)
    private String phonenumber;

    private String gender;

    @Min(18)
    @Max(60)
    private int age;

}
