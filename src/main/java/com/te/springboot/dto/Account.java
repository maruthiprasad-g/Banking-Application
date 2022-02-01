package com.te.springboot.dto;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
@Data
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accId;
	@NotNull(message = "column should not be empty")
	private String acc_holdername;
	@NotNull(message = "column should not be empty")
	public enum gender {
		Male,Female,Others;
	}
	@NotNull(message = "column should not be empty")
	@Enumerated(value = EnumType.STRING)

	private gender gender;
	@NotNull(message = "column should not be empty")

	private String address;
	@NotNull(message = "column should not be empty")

	private String Nominee;
	@NotNull(message = "column should not be empty")

	private double current_amount;

	public enum status {
		active,inactive;
	}
	@NotNull(message = "column should not be empty")
	@Enumerated(value = EnumType.STRING)
	private status status;
	public Account(int accId, @NotNull(message = "column should not be empty") String acc_holdername,
			com.te.springboot.dto.Account.@NotNull(message = "column should not be empty") gender gender,
			@NotNull(message = "column should not be empty") String address,
			@NotNull(message = "column should not be empty") String nominee,
			@NotNull(message = "column should not be empty") double current_amount,
			com.te.springboot.dto.Account.@NotNull(message = "column should not be empty") status status) {
		super();
		this.accId = accId;
		this.acc_holdername = acc_holdername;
		this.gender = gender;
		this.address = address;
		Nominee = nominee;
		this.current_amount = current_amount;
		this.status = status;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
