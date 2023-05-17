package com.vti.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.vti.entity.Account;

//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Predicate;
//import jakarta.persistence.criteria.Root;

public class AccountSpecification implements Specification<Account> {
	private String field;// trường muốn tìm kiếm
	private String operator;// các toán tử ví dụ như "LIKE"
	private Object value;// giá trị mà user sẽ nhập vào của trường muốn tìm kiếm
	
	public AccountSpecification(String field, String operator, Object value) {
		this.field = field; 
		this.operator = operator; 
		this.value = value; 
	}

	@Override
	public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
		//hàm toPredicate sẽ build điều kiện tìm kiếm và trả ra kết quả tìm kiếm
		if (operator.equalsIgnoreCase("LIKE")) {

			if (field.equalsIgnoreCase("department.name")) {
				return builder.like(root.get("department").get("name"), "%" + value.toString() + "%");
			} else {
				return builder.like(root.get(field), "%" + value.toString() + "%"); 
				// ví dụ: fullname (chính là field) like giá trị tìm kiếm (chính là value)
			}
		} else {
			return null;
		}
	}


}
