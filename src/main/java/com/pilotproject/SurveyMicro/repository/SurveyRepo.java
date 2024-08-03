package com.pilotproject.SurveyMicro.repository;

import com.pilotproject.SurveyMicro.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepo extends JpaRepository<Survey,Long> {

    Survey findBySurveyid(Long surveyId);
}
