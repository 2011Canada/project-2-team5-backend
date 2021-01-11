package com.revature.project2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "contract")
public class Contract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contract_id")
	private int contractId;

	@Column(name = "description")
	private String description;

	@Column(name = "contracted_to")
	private int contractedTo;

	@Column(name = "target_id")
	private int targetId;

	@Column(name = "status_id")
	private int statusId;

	public Contract(int contractId, String description, int contractedTo, int targetId, int statusId) {
		super();
		this.contractId = contractId;
		this.description = description;
		this.contractedTo = contractedTo;
		this.targetId = targetId;
		this.statusId = statusId;
	}

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getContractId() {
		return contractId;
	}

	public void setContractId(int contractId) {
		this.contractId = contractId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getContractedTo() {
		return contractedTo;
	}

	public void setContractedTo(int contractedTo) {
		this.contractedTo = contractedTo;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contractId;
		result = prime * result + contractedTo;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + statusId;
		result = prime * result + targetId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contract other = (Contract) obj;
		if (contractId != other.contractId)
			return false;
		if (contractedTo != other.contractedTo)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (statusId != other.statusId)
			return false;
		if (targetId != other.targetId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", description=" + description + ", contractedTo=" + contractedTo
				+ ", targetId=" + targetId + ", statusId=" + statusId + "]";
	}

}
