package com.xworkz.cm.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="data")
@NamedQuery(name = "find", query = "select entity from SignUpEntity entity")
public class SignUpEntity {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="userId")
	private String userId;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private long mobileNo;
	@Column(name="password")
	private String password;
	@Column(name="confirmPassword")
	private String confirmPassword;
    @Column(name="createdby")
    private String createdby;
    @Column(name="createddate")
	private LocalDateTime createddate;
    @Column(name="updatedby")
    private String updatedby;
    @Column(name="updateddate")
    private LocalDateTime updateddate;

	

}
