package com.capgemini.forestmanagementsystem.services;

import java.util.List;

import com.cagemini.forestmanagementsystem.dao.ContractDAO;
import com.capgemini.forestmanagementsystem.factory.ContractFactory;
import com.capgemini.forestmanagementsystem.bean.Contract;

public class ContractServicesImpl implements ContractServices {

	ContractDAO dao = ContractFactory.instanceOfContaractDAOImpl();

	@Override
	public boolean addContract(Contract bean) {
		// TODO Auto-generated method stub
		return dao.addContract(bean);
	}

	@Override
	public boolean deleteContact(int contract_no) {
		// TODO Auto-generated method stub
		return dao.deleteContact(contract_no);
	}

	@Override
	public List<Contract> contractDetail() {
		// TODO Auto-generated method stub
		return dao.contractDetail();
	}

	@Override
	public Contract search(int contract_no) {
		// TODO Auto-generated method stub
		return dao.search(contract_no);
	}

}
