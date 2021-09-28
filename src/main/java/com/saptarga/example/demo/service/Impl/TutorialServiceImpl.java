package com.saptarga.example.demo.service.Impl;

import com.saptarga.example.demo.dto.request.RequestTutorialDTO;
import com.saptarga.example.demo.exception.ServiceException;
import com.saptarga.example.demo.model.Tutorial;
import com.saptarga.example.demo.repository.TutorialRepository;
import com.saptarga.example.demo.service.ITutorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
        return tutorialRepository.save(Tutorial.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .published(request.isPublished())
                .build());
    }

    @Override
    public Tutorial findById(Long id) throws ServiceException {
        return tutorialRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Long id) throws ServiceException {
        Tutorial tutorial = tutorialRepository.findById(id).orElse(null);
        if (Objects.isNull(tutorial)) {
            throw new ServiceException("Data tutorial not found");
        }

        tutorialRepository.delete(tutorial);
        return true;
    }

    @Override
    public Tutorial updateById(Long id, RequestTutorialDTO request) throws ServiceException {
        Tutorial tutorial = tutorialRepository.findById(id).orElse(null);
        if (Objects.isNull(tutorial)) {
            throw new ServiceException("Data tutorial not found");
        }
        tutorial.setTitle(request.getTitle());
        tutorial.setPublished(request.isPublished());
        tutorial.setDescription(request.getDescription());

        return tutorialRepository.save(tutorial);
    }
}
