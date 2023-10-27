package com.team.lms.lecture.domain.request;

import com.team.lms.lecture.domain.entity.Lecture;
import com.team.lms.lecture.domain.entity.Status;
import com.team.lms.major.entity.Major;
import com.team.lms.professor.entity.Professor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProfessorLectureRequest {

    private UUID professorId;
    private Long majorId;


    public Lecture toEntity(){
        return Lecture
                .builder()
                .professor(Professor.builder().id(professorId).build())
                .major(Major.builder().id(majorId).build())
                .status(Status.HOLDING)
                .build();
    }

}
