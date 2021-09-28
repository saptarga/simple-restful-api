package com.saptarga.example.demo.dto.response.rajaongkir;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseRajaOngkirDTO {

    private ResponseQueryDTO query;
    private ResponseStatusDTO status;
    private ResponseProvinceDTO results;

}
