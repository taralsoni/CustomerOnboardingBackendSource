package com.afrAsia.entities.transactions;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MOB_APPL_ADDITIONAL_DTLS_HIST database table.
 * 
 */
@Embeddable
public class HistTableCompositePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	
	@Column(name="RECORD_ID", insertable=false, updatable=false)
	private long recordId;

	@Column(name="APPLICANT_ID", insertable=false, updatable=false)
	private long applicantId;

	public HistTableCompositePK() {
	}
	public long getRecordId() {
		return this.recordId;
	}
	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}
	public long getApplicantId() {
		return this.applicantId;
	}
	public void setApplicantId(long applicantId) {
		this.applicantId = applicantId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HistTableCompositePK)) {
			return false;
		}
		HistTableCompositePK castOther = (HistTableCompositePK)other;
		return 
			(this.recordId == castOther.recordId)
			&& (this.applicantId == castOther.applicantId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.recordId ^ (this.recordId >>> 32)));
		hash = hash * prime + ((int) (this.applicantId ^ (this.applicantId >>> 32)));
		
		return hash;
	}
}