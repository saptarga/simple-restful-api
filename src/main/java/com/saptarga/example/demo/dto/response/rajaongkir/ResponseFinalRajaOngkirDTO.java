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
public class ResponseFinalRajaOngkirDTO implements Serializable {
    private static final long serialVersionUID = 792995041002661509L;

    private ResponseRajaOngkirDTO rajaongkir;
}
