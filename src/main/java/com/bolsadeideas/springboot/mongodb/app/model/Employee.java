package com.bolsadeideas.springboot.mongodb.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@Document(collection = "employee")
public class Employee {
	@Id
	private String id;
	private @NonNull String firstName;
	private @NonNull String lasteName;
	private @NonNull String email;
}
