package com.saptarga.example.demo.client;

import com.saptarga.example.demo.dto.response.rajaongkir.ResponseFinalRajaOngkirDTO;
import feign.FeignException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cl-raja-ongkir", url = "${rest.raja-ongkir.base-path:}")
public interface IRajaOngkirClient {

    @GetMapping(
            value = "/province",
            consumes = {"application/json"},
            headers = {"Accept: application/json", "Content-Type: application/json"}
    )
    ResponseFinalRajaOngkirDTO getProvince(@RequestParam("id") String id, @RequestHeader("key") String key) throws FeignException;
}
