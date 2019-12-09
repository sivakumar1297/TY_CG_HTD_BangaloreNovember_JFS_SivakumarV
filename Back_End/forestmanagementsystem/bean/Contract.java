package com.capgemini.forestmanagementsystem.bean;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

@Data
public class Contract implements Serializable {
	private int contract_no;
	private int customer_id;
	private int product_id;
	private int haulier_id;
	private String delivery_date;
	private String delivery_day;
	private int quality;

	@Override
	public String toString() {
		return "\ncontract_no=" + contract_no + ", customer_id=" + customer_id + ", product_id=" + product_id
				+ ", haulier_id=" + haulier_id + ", delivery_date=" + delivery_date + ", delivery_day=" + delivery_day
				+ ", quality=" + quality;
	}

}

