package com.team.lms.example.admin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private Long lectureId;
    private String email;


}