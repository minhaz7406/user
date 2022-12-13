package com.user.entity;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="firstName",length=145,nullable=false)
	private String firstName;
	@Column(name="lastName",length=145,nullable=false)
	private String lastName;
	@Column(name="userName",length=145,nullable=false)
	private String userName;
	@Column(name="email",length=145,nullable=false,unique=true)
	private String email;
	@Column(name="dOB",length=145,nullable=false)
	private long dOB;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getdOB() {
		return dOB;
	}
	public void setdOB(long dOB) {
		this.dOB = dOB;
	}

}
