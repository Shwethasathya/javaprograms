package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public abstract class AbstractAuditDto implements Serializable {

	private String createdby;
	private LocalDateTime createddate;
	private String updatedby;
	private LocalDateTime updateddate;
}
