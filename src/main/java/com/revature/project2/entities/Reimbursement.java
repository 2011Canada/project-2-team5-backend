package com.revature.project2.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ers_reimbursement")
public class Reimbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_Id")
	private int reimbursementId;
	@Column(name = "reimb_amount")
	private double reimbursementAmount;
	@Column(name = "reimb_submitted")
	private Timestamp reimbursementSubmitted;
	@Column(name = "reimb_resolved")
	private Timestamp reimbursementResolved;
	@Column(name = "reimb_description")
	private String reimbursementDescription;
	@Column(name = "reimb_receipt")
	private String reimbursementReceipt;
	@Column(name = "reimb_author")
	private int reimbursementAnthorId;
	@Column(name = "reimb_resolver", nullable = true)
	private int reimbursementResolverId;
	@Column(name = "reimb_status_Id")
	private int reimbursementStatusId;
	@Column(name = "reimb_type_Id")
	private int reimbursementTypeId;

	public Reimbursement() {

	}

	public Reimbursement(int reimbursementId, double reimbursementAmount, Timestamp reimbursementSubmitted,
			Timestamp reimbursementResolved, String reimbursementDescription, String reimbursementReceipt,
			int reimbursementAnthorId, int reimbursementResolverId, int reimbursementStatusId,
			int reimbursementTypeId) {
		this.reimbursementId = reimbursementId;
		this.reimbursementAmount = reimbursementAmount;
		this.reimbursementSubmitted = reimbursementSubmitted;
		this.reimbursementResolved = reimbursementResolved;
		this.reimbursementDescription = reimbursementDescription;
		this.reimbursementReceipt = reimbursementReceipt;
		this.reimbursementAnthorId = reimbursementAnthorId;
		this.reimbursementResolverId = reimbursementResolverId;
		this.reimbursementStatusId = reimbursementStatusId;
		this.reimbursementTypeId = reimbursementTypeId;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public double getReimbursementAmount() {
		return reimbursementAmount;
	}

	public void setReimbursementAmount(double reimbursementAmount) {
		this.reimbursementAmount = reimbursementAmount;
	}

	public Timestamp getReimbursementSubmitted() {
		return reimbursementSubmitted;
	}

	public void setReimbursementSubmitted(Timestamp reimbursementSubmitted) {
		this.reimbursementSubmitted = reimbursementSubmitted;
	}

	public Timestamp getReimbursementResolved() {
		return reimbursementResolved;
	}

	public void setReimbursementResolved(Timestamp reimbursementResolved) {
		this.reimbursementResolved = reimbursementResolved;
	}

	public String getReimbursementDescription() {
		return reimbursementDescription;
	}

	public void setReimbursementDescription(String reimbursementDescription) {
		this.reimbursementDescription = reimbursementDescription;
	}

	public String getReimbursementReceipt() {
		return reimbursementReceipt;
	}

	public void setReimbursementReceipt(String reimbursementReceipt) {
		this.reimbursementReceipt = reimbursementReceipt;
	}

	public int getReimbursementAnthorId() {
		return reimbursementAnthorId;
	}

	public void setReimbursementAnthorId(int reimbursementAnthorId) {
		this.reimbursementAnthorId = reimbursementAnthorId;
	}

	public int getReimbursementResolverId() {
		return reimbursementResolverId;
	}

	public void setReimbursementResolverId(int reimbursementResolverId) {
		this.reimbursementResolverId = reimbursementResolverId;
	}

	public int getReimbursementStatusId() {
		return reimbursementStatusId;
	}

	public void setReimbursementStatusId(int reimbursementStatusId) {
		this.reimbursementStatusId = reimbursementStatusId;
	}

	public int getReimbursementTypeId() {
		return reimbursementTypeId;
	}

	public void setReimbursementTypeId(int reimbursementTypeId) {
		this.reimbursementTypeId = reimbursementTypeId;
	}

}
