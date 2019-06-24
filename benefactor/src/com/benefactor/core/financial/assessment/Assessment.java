package com.benefactor.core.financial.assessment;

import java.sql.Date;

public class Assessment implements IAssessment {

	private int outcome;
	private Date timestamp;
	private String assessedBy;
	private String notes;
	
	@Override
	public int getOutcome() {
		// TODO Auto-generated method stub
		return this.outcome;
	}
	protected void setOutcome(int _assessmentOutcome){
		this.outcome = _assessmentOutcome;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	protected void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getAssessedBy() {
		return assessedBy;
	}
	protected void setAssessedBy(String assessedBy) {
		this.assessedBy = assessedBy;
	}
	public String getNotes() {
		return notes;
	}
	protected void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Assessment [outcome=" + outcome + ", timestamp=" + timestamp + ", assessedBy=" + assessedBy + ", notes="
				+ notes + "]";
	}
	
	
	

}
