package com.maint.core.model;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AccessLevel;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String firstName;
	private String lastName;
	private String email;
//	private String password;
	private String startDate;
	private Long userRoleId;






}
