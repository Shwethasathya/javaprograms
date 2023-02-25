package com.xworkz.forest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="forestinfo")
@NoArgsConstructor
@AllArgsConstructor
public class ForestEntity {
	
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "name")
		private String name;
		@Column(name = "state")
		private String state;
		@Column(name = "type")
		private String type;
		@Column(name = "area")
		private Double area;

}
