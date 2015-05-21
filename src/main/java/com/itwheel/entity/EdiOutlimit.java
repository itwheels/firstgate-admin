package com.itwheel.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EDI_OUTLIMIT database table.
 * 
 */
@Entity
@Table(name="EDI_OUTLIMIT")
@NamedQuery(name="EdiOutlimit.findAll", query="SELECT e FROM EdiOutlimit e")
public class EdiOutlimit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EDI_OUTLIMIT_ID_GENERATOR", sequenceName="SEQ_EDI_OUTLIMIT_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDI_OUTLIMIT_ID_GENERATOR")
	private long id;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="STORE_CODE")
	private String storeCode;

	@Column(name="TYPE")
	private String type;

	public EdiOutlimit() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}