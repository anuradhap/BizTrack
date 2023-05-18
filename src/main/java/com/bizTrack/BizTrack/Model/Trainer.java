package com.bizTrack.BizTrack.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainerId;
    //@NotBlank(message = "First name is required")
    private String firstName;
    private String lastName;
    private Long mobileNumber;
    private String emailId;
    private String password;
}
