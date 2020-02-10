package com.maint.core.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserRoleTable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private Long userId;
	private Long userRoleId;

//	@ManyToOne
//	private User user;



}
