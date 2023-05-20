package com.example.demo.controller.response;

import com.example.demo.entities.User;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserCreateResponse {

    private String name;
    private String lastName;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate birth;
    private int age;


    public static UserCreateResponse from(User user) {
        return new UserCreateResponse(
                user.getName(),
                user.getLastName(),
                user.getBirth(),
                user.getAge()
        );
    }
}
