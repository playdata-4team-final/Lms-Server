package com.example.lms.lecture.domain.response;

import com.example.lms.lecture.domain.entity.Lecture;
import com.example.lms.lecture.domain.entity.Semester;
import com.example.lms.lecture.domain.entity.Status;
import com.example.lms.lecture.dto.AllLectureDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class AllLectureRes {

    private Long id;
    private String lectureName;
    private Status status;
    private Integer maximumNumber;
    private Integer score;
    private String lectureComment;
    private LocalDateTime lectureDate;
    private Semester semester;
    private String majorName;
    private String professorName;

    public AllLectureRes(AllLectureDto lecture) {
        this.id = lecture.getId();
        this.lectureName = lecture.getLectureName();
        this.status = lecture.getStatus();
        this.maximumNumber = lecture.getMaximumNumber();
        this.score = lecture.getScore();
        this.lectureComment = lecture.getLectureComment();
        this.lectureDate = lecture.getLectureDate();
        this.semester = lecture.getSemester();
        this.majorName = lecture.getMajorName();
        this.professorName = lecture.getProfessorName();
    }

}
