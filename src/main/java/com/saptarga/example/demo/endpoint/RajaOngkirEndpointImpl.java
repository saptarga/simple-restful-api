package com.saptarga.example.demo.endpoint;

import com.saptarga.example.demo.client.IRajaOngkirClient;
import com.saptarga.example.demo.dto.response.rajaongkir.ResponseFinalRajaOngkirDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/api/rajaongkir")
@Slf4j
public class RajaOngkirEndpointImpl {

    private final IRajaOngkirClient rajaOngkirClient;

    @Value("${rest.raja-ongkir.key:}")
    private String key;

    @Cacheable("province")
    @GetMapping("/province/{id}")
    public ResponseEntity<ResponseFinalRajaOngkirDTO> getDetailProvince(@PathVariable("id") String id) throws Exception {
        ResponseFinalRajaOngkirDTO responseFinalRajaOngkirDTO = null;
        responseFinalRajaOngkirDTO = rajaOngkirClient.getProvince(id, key);
        return ResponseEntity.ok(responseFinalRajaOngkirDTO);
    }
}
