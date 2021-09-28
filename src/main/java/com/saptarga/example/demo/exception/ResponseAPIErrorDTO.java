package com.saptarga.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAPIErrorDTO implements Serializable {

    private static final long serialVersionUID = -3568494878981770758L;
    private Date timestamp;
    private String exception;
    private String path;
    private String error;
}
