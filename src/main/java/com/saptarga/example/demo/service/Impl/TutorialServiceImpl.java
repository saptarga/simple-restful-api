package com.saptarga.example.demo.service.Impl;

import com.saptarga.example.demo.dto.request.RequestTutorialDTO;
import com.saptarga.example.demo.exception.ServiceException;
import com.saptarga.example.demo.model.Tutorial;
import com.saptarga.example.demo.repository.TutorialRepository;
import com.saptarga.example.demo.service.ITutorialService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TutorialServiceImpl implements ITutorialService {

    private final TutorialRepository tutorialRepository;

    @Override
    public List<Tutorial> findAll() throws ServiceException {
        return tutorialRepository.findAll();
    }

    @Override
    public Tutorial createTutorial(RequestTutorialDTO request) throws ServiceException {
        log.info("Create New Tutorial With Request: {}", request.toString());
        return tutorialRepository.save(Tutorial.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .published(request.isPublished())
                .build());
    }

    @Override
    public Tutorial findById(Long id) throws Exception {
        log.info("Find Tutorial With Id: {}", id.toString());
        return tutorialRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Long id) throws Exception {
        log.warn("Delete Tutorial With Id: {}", id.toString());

        Tutorial tutorial = tutorialRepository.findById(id).orElse(null);
        if (Objects.isNull(tutorial)) {
            log.error("Data Not Found With Id: {}", id.toString());
            throw new ServiceException("Data tutorial not found");
        }

        tutorialRepository.delete(tutorial);
        return true;
    }

    @Override
    public Tutorial updateById(Long id, RequestTutorialDTO request) throws Exception {
        log.info("Update Tutorial With Id {} And Request {}", id.toString(), request.toString());

        Tutorial tutorial = tutorialRepository.findById(id).orElse(null);
        if (Objects.isNull(tutorial)) {
            log.error("Data Not Found With Id: {}", id.toString());
            throw new ServiceException("Data tutorial not found");
        }
        tutorial.setTitle(request.getTitle());
        tutorial.setPublished(request.isPublished());
        tutorial.setDescription(request.getDescription());

        return tutorialRepository.save(tutorial);
    }
}
