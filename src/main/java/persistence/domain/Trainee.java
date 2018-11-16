package main.java.persistence.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Trainee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long trainerID;
	private String firstName;
	private String lastName;
	
	public Trainee() {
		
	}
	public Trainee (long id, String fName, String lName) {
		super();
		this.trainerID = id;
		this.firstName=fName;
		this.lastName=lName;
	}

	public Long getTrainerID() {
		return trainerID;
	}

	public void setTrainerID(Long trainerID) {
		this.trainerID = trainerID;
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
	
}
