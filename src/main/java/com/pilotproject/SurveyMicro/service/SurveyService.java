package com.pilotproject.SurveyMicro.service;

import com.pilotproject.SurveyMicro.model.Survey;
import com.pilotproject.SurveyMicro.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {
    @Autowired
    private SurveyRepo s;

    public Survey createsurvey(Survey survey) {
       return  s.save(survey);
    }

    public List<Survey> getAllSurveys() {
        return (List<Survey>) s.findAll();
    }
    public Survey getSurveyById(Long surveyId) {
        Optional<Survey> surveyOptional = s.findById(surveyId);
        return surveyOptional.orElseThrow(() -> new RuntimeException("Survey not found with id: " + surveyId));
    }
}
