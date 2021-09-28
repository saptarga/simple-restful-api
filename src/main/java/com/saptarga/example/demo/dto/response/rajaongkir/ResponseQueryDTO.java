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
public class ResponseQueryDTO implements Serializable {
    private static final long serialVersionUID = -8547192378655034341L;

    private String id;

}
