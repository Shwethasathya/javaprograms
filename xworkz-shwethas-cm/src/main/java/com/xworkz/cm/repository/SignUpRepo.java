package com.xworkz.cm.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.cm.entity.SignUpEntity;

public interface SignUpRepo {
	
	boolean save(SignUpEntity entity);

	default List<SignUpEntity> find(){
		return Collections.emptyList();
	}
	
	default List<SignUpEntity> signIn(String userId, String password){
		return Collections.emptyList();
	}

}
