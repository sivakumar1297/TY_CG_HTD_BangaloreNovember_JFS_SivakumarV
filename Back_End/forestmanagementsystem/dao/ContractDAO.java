package com.cagemini.forestmanagementsystem.dao;

import java.util.List;

import com.capgemini.forestmanagementsystem.bean.Contract;

public interface ContractDAO {
	public boolean addContract(Contract bean);

	public boolean deleteContact(int contract_no);

	public List<Contract> contractDetail();

	public Contract search(int contract_no);

}
