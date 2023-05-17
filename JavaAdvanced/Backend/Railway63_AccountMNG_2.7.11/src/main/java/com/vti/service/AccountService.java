package com.vti.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.form.AccountForUpdate;
import com.vti.form.AccountFormForCreating;
import com.vti.form.DepartmentFormForCreating;
import com.vti.repository.IAccountRepository;
import com.vti.repository.IDepartmentRepository;
import com.vti.repository.IPositionRepository;
import com.vti.specification.AccountSpecification;

@Service
public class AccountService implements IAccountService {

	@Autowired
	private IAccountRepository accountRepository;
	
	@Autowired
	private IDepartmentRepository departmentRepository;

	@Autowired
	private IPositionRepository positionRepository;

	@Override
	public Page<Account> getAllAccounts(Pageable pageable, String search) {
		
		// tạo điều kiện where để tìm kiếm. where chỉ là tên riêng, có thể thay đổi tùy ý
		Specification<Account> where = null;
		
		// xây dựng điều kiện where
		if (!StringUtils.isEmpty(search)) {
			AccountSpecification nameSpecification = new AccountSpecification("fullname", "LIKE", search);
			AccountSpecification emailSpecification = new AccountSpecification("email", "LIKE", search);
			AccountSpecification departmentSpecification = new AccountSpecification("department.name", "LIKE", search);
			where = Specification.where(nameSpecification).or(emailSpecification).or(departmentSpecification);
		}

		return accountRepository.findAll(where,pageable);

	}


	
	@Override
	public void createAccount(AccountFormForCreating formForCreating) {
		Account account = new Account();
		Department department = departmentRepository.getById(formForCreating.getDepartmentId());
		Position position = positionRepository.getById(formForCreating.getPositionId());
		account.setEmail(formForCreating.getEmail());
        account.setUsername(formForCreating.getUsername());
        account.setFullname(formForCreating.getFullname());
        account.setDepartment(department);
        account.setPosition(position);

        accountRepository.save(account);
	}


	@Override
	public void updateAccount(Short id, AccountForUpdate formForUpdating) {
		Account account = accountRepository.getById(id);
		Department department = departmentRepository.getById(formForUpdating.getDepartmentId());
		Position position = positionRepository.getById(formForUpdating.getPositionId());
//        account.setEmail(account.getEmail());
		account.setFullname(formForUpdating.getFullname());
        account.setDepartment(department);
        account.setPosition(position);

        accountRepository.save(account);
		
	}


	@Override
	public Account getAccountByID(short id) {
        Account account = accountRepository.findById(id).get();
		return account;
	}


	@Override
	public void deleteAccountByID(short id) {
		accountRepository.deleteById(id);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// từ thông tin username => tạo ra được userdetail (để xác thực)
		
		//B1: từ username => Account có username tương ứng
		Account account = accountRepository.findByUsername(username);
		
		//B2: từ thông tin Account => UserDetail
        UserDetails userDetails = new User(account.getUsername(), account.getPassword(), 
        		AuthorityUtils.createAuthorityList("user"));
		
        return userDetails;
	}



	@Override
	public Account getAccountByUsername(String username) {
		// TODO Auto-generated method stub
		return accountRepository.findByUsername(username);
	}

	}



	


