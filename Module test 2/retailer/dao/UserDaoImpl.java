package com.capgrmini.retailer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgrmini.retailer.dto.UserInfo;
import com.capgrmini.retailer.exception.UserException;

@Repository
public class UserDaoImpl {
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	
	public UserInfo login(UserInfo bean) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from UserInfo where email=:email";
		TypedQuery<UserInfo> query = entityManager.createQuery(jpql,UserInfo.class);
		query.setParameter("email", bean.getEmail());
		try {
			UserInfo info = query.getSingleResult();
		
			
			if(info.getPassword().equals(bean.getPassword())){
				return bean;
				
			}else {
				throw new UserException("Password Invalid");
			}
		} catch (Exception e) {
			throw new UserException("Email Invalid");
		}

	}


	public boolean signup(UserInfo bean) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(bean);
			entityTransaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("Email Already Exists");
		}

	}




	public boolean changePassword(int id,String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
			UserInfo info =  entityManager.find(UserInfo.class, id);
			if (info!=null){
			info.setPassword(password);
			entityTransaction.commit();
			return true;
			
		} else {
			throw new UserException("User Doesnot Exists");
		}
	}
	

}
