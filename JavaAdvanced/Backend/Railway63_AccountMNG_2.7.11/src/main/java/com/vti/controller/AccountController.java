package com.vti.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vti.dto.AccountDto;
import com.vti.dto.DepartmentDto;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.form.AccountForUpdate;
import com.vti.form.AccountFormForCreating;
import com.vti.form.DepartmentForUpdate;
import com.vti.form.DepartmentFormForCreating;
import com.vti.service.IAccountService;

@RestController 
@RequestMapping(value = "api/v1/accounts")
@CrossOrigin("*")

//http://localhost:8080/api/v1/accounts

public class AccountController {

	@Autowired
	private IAccountService accountService;
	
		@GetMapping()
		public ResponseEntity<?> getAllAccounts(Pageable pageable, @RequestParam(required=false) String search) {
			// "search" là param để truyền data người dùng nhập vào, sau đó dùng param này
			// làm điều kiện tìm kiếm
			System.out.println("pageable: "+ pageable);
			System.out.println("search: "+ search);
			
			Page<Account> entities = accountService.getAllAccounts(pageable, search);
//			List<Account> listAccounts = accountService.getAllAccounts();

//			for (Account account : listAccounts) {
//				System.out.println(account);
//			}
			
			// trả api cho frontend
			
			// chuyển đổi dữ liệu
//			List<AccountDto> listAccountDtos = new ArrayList<AccountDto>();
//						
//			for (Account account : listAccounts) {
//				AccountDto accountDto = new AccountDto();
//				accountDto.setId(account.getId());
//				accountDto.setUsername(account.getUsername());
//				accountDto.setFullname(account.getFullname());
//				accountDto.setEmail(account.getEmail());
//				accountDto.setDepartment(account.getDepartment().getName());
//				accountDto.setPosition(account.getPosition().getName().toString());
//				accountDto.setCreateDate(account.getCreateDate());
//				
//				listAccountDtos.add(accountDto);
//			}
			
			// convert entities --> dtos
			// https://stackoverflow.com/questions/39036771/how-to-map-pageobjectentity-to-pageobjectdto-in-spring-data-rest
			Page<AccountDto> dtoPage = entities.map(new Function<Account, AccountDto>() {
				@Override
				public AccountDto apply(Account account) {
					AccountDto dto = new AccountDto(account.getId(), account.getEmail(), account.getUsername(),
							account.getFullname(), account.getDepartment().getName(),
							account.getPosition().getName().toString(), account.getCreateDate());
					return dto;
				}
			});
					

			return new ResponseEntity<>(dtoPage, HttpStatus.OK);
		}
	
		@PostMapping()
		public ResponseEntity<?> createAccount(@RequestBody AccountFormForCreating formForCreating){
	accountService.createAccount(formForCreating);
			return new ResponseEntity<>("Create Success", HttpStatus.OK);
		}
		
		// phương thức cập nhật account
		//http://localhost:8080/api/v1/accounts/{idAccountUpdate}
		@PutMapping(value = "/{idAccountUpdate}")
		public ResponseEntity<?> updateAccount(@PathVariable(name = "idAccountUpdate") Short id,
				@RequestBody AccountForUpdate formForUpdating){
//			System.out.println("ID: " + id);
//			System.out.println("form for updating: " + formForUpdating.getFullname());
			accountService.updateAccount(id, formForUpdating);
			
			return new ResponseEntity<>(null, HttpStatus.OK);

		}
		
		// method lấy account theo id
		//http://localhost:8080/api/v1/accounts/{idAccount}
		@GetMapping(value = "/{idAccount}")
		public ResponseEntity<?> getAccountByID(@PathVariable(name = "idAccount") short id) {	
			//truyền "idAccount" vào id

//			System.out.println(id);
					
			Account account = accountService.getAccountByID(id);
			
			// chuyển đổi kiểu dữ liệu

			AccountDto accountDto = new AccountDto();
			accountDto.setId(account.getId());
			accountDto.setEmail(account.getEmail());
			accountDto.setUsername(account.getUsername());
			accountDto.setFullname(account.getFullname());
			accountDto.setDepartment(account.getDepartment().getName());
			accountDto.setPosition(account.getPosition().getName().toString());
			accountDto.setCreateDate(account.getCreateDate());
			
			
			return new ResponseEntity<>(accountDto, HttpStatus.OK);
		}

// Delete account
		//http://localhost:8080/api/v1/accounts/{idAccount}
		@DeleteMapping(value = "/{idAccount}")
		public ResponseEntity<?> deleteAccountByID(@PathVariable(name = "idAccount") short id) {	
		accountService.deleteAccountByID(id);
		return new ResponseEntity<String>("Deleted", HttpStatus.OK);
		}
		
}
