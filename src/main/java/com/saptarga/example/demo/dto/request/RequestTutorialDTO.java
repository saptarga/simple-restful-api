package com.saptarga.example.demo.dto.request;

import lombok.*;

import java.io.Serializable;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestTutorialDTO implements Serializable {
    private static final long serialVersionUID = -1331908889861254766L;

    private String title;
    private String description;
    private boolean published;
}
