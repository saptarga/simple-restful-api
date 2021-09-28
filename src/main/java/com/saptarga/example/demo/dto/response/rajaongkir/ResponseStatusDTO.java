package com.saptarga.example.demo.dto.response.rajaongkir;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseStatusDTO implements Serializable {

    private static final long serialVersionUID = -2356948943410330536L;

    private Integer code;
    private String description;
}
