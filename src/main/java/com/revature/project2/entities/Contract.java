package com.revature.project2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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

	@Column(name = "status_id")
	private int statusId;

	@Column(name = "target_id")
	private int targetId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "user_id", name = "target_id", insertable = false, updatable = false)
	private Player player;

	public Player getTarget() {
		return player;
	}

	public void setTarget(Player target) {
		this.player = target;
	}

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(int contractId, String description, int contractedTo, int statusId, int targetId, Player target) {
		super();
		this.contractId = contractId;
		this.description = description;
		this.contractedTo = contractedTo;
		this.statusId = statusId;
		this.targetId = targetId;
		this.player = target;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
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

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

}
