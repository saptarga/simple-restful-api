package com.saptarga.example.demo.dto.response.rajaongkir;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseProvinceDTO implements Serializable {
    private static final long serialVersionUID = -3981993861691937772L;

    @JsonProperty("province_id")
    private String provinceId;

    private String province;
}
