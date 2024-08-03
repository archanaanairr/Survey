package com.pilotproject.SurveyMicro.controller;


import com.pilotproject.SurveyMicro.model.Survey;
import com.pilotproject.SurveyMicro.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/surveys")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @PostMapping("/create ")
    public Survey craeteSurvey(@RequestBody Survey survey) {

        return surveyService.createsurvey(survey);
    }
    @GetMapping("/getall")
    public List<Survey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @GetMapping("/bysurvey/{survey_id}")
    public Survey getSurveyById(@PathVariable("survey_id") Long surveyId) {
        return surveyService.getSurveyById(surveyId);
    }

}
