package com.xworkz.pizza.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;

	public AbstractAuditDTO() {
		System.out.println("calling default constructor");
	}

	public AbstractAuditDTO(String createdy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		this.createdBy = createdy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "AbstractAuditDTO [createdy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	public String getCreatedy() {
		return createdBy;
	}

	public void setCreatedy(String createdy) {
		this.createdBy = createdy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
