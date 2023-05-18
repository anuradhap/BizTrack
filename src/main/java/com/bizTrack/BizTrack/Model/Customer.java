package com.bizTrack.BizTrack.Model;

import com.sun.istack.NotNull;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
   //@NotBlank(message = "First name is required")
    private String firstName;
    private String lastName;
    private String Address;
    private String emailId;
    private String password;
    private String phoneNumber;
}
