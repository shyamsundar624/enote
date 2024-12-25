package com.shyam.enotes.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter

@Setter
@MappedSuperclass
public class BaseModel {

	private boolean isActive;
	private boolean isDeleted;

	private Integer createdOn;
	private Integer updatedOn;
	private Date createDate;
	private Date updatedDate;
}
