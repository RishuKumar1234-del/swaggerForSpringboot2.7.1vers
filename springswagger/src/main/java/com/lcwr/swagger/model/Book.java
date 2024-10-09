package com.lcwr.swagger.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
@ApiModel(description = "this table hold all information about the books")
public class Book {

	@Id
	@ApiModelProperty(notes = "this is book id column.this should be unique and not null")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private Double price;

}
