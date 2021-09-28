package com.saptarga.example.demo.service;

import com.saptarga.example.demo.dto.request.RequestTutorialDTO;
import com.saptarga.example.demo.exception.ServiceException;
import com.saptarga.example.demo.model.Tutorial;

import java.util.List;

public interface ITutorialService {

    List<Tutorial> findAll() throws ServiceException;

    Tutorial createTutorial(RequestTutorialDTO requestTutorialDTO) throws ServiceException;

    Tutorial findById(Long id) throws Exception;

    boolean deleteById(Long id) throws Exception;

    Tutorial updateById(Long id, RequestTutorialDTO requestTutorialDTO) throws Exception;
}
