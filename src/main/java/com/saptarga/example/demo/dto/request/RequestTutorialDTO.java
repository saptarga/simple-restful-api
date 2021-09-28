package com.saptarga.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

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
