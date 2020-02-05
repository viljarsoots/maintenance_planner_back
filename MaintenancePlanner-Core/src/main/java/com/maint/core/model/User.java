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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;
	private String lastName;
	private String email;
	private String startDate;
	private Long userRoleId;

	@OneToMany
	@JoinColumn(name = "userId")
	private Set<UserRoleTable> userRoles;

//	@lombok.Setter(value= AccessLevel.NONE)
//
//	private List<UserRoleTable> userRoleTableList = new ArrayList<UserRoleTable>();
//
//public void addUserRoleTable(UserRoleTable userRole){
//	userRoleTableList.add(userRole);
//	userRole.getUserId().add(this);
//}

}
