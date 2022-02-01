package com.te.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springboot.dto.Account;
import com.te.springboot.service.AccountServiceImpl;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
public class AccountController {

	@Autowired
	private AccountServiceImpl service;
	@PostMapping(path ="/addAcc") 
	@ApiOperation(value = "Add Account", notes = "Add Account", tags = "Bank Application")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Add Acount Successfuly...."),
	@ApiResponse(code = 404, message = "Invalid Customer"),
	@ApiResponse(code = 403, message = "Access Denied....") })
	public ResponseEntity<?> addAccount(@RequestBody Account account) {
		try {
			service.addAccount(account);
			return new ResponseEntity<String> ("Account is Added",HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Account is Not Added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/addUpdate")
	@ApiOperation(value = "Update Account", notes = "Update Account", tags = "Bank Application")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Update Successful...."),
	@ApiResponse(code = 404, message = "Invalid Customer"),
	@ApiResponse(code = 403, message = "Access Denied....") })
	public ResponseEntity<?> updateAccount(@RequestBody Account account ) {
		try {
			service.UpdateAccount(account);
			return new ResponseEntity<>("Updated succsessfully!!",HttpStatus.OK);
		} catch (Exception e) {
		}return new ResponseEntity<>("Updated unsuccessfull!!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("/deleteAccount/{id}")
	@ApiOperation(value = "Delete Account", notes = "Delete Account", tags = "Bank Application")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Deleted Successfully...."),
	@ApiResponse(code = 404, message = "Invalid Customer"),
	@ApiResponse(code = 403, message = "Access Denied....") })
	public ResponseEntity<?> deleteAccount(@PathVariable("id") int id ) {
		try {
			service.deleteAccount(id);
			return new ResponseEntity<>("Data deleted!",HttpStatus.OK);
		} catch (Exception e) {
		}return new ResponseEntity<>("Deletion unsuccessfull", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/addAmount")
	@ApiOperation(value = "Deposit money", notes = "Deposit Money", tags = "Bank Application")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Deposit Successful...."),
	@ApiResponse(code = 404, message = "Invalid Customer"),
	@ApiResponse(code = 403, message = "Access Denied....") })
	public ResponseEntity<?> despositAmount(@RequestBody Account account ) {
		try {
			service.AddAmount(account);
			return new ResponseEntity<>("Amount Updated!!",HttpStatus.OK);
		} catch (Exception e) {
		}return new ResponseEntity<>("Amount is Not Updated!!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
