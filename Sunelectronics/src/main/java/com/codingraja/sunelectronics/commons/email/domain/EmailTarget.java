package com.codingraja.sunelectronics.commons.email.domain;

import java.io.Serializable;

public class EmailTarget implements Serializable {

	private static final long serialVersionUID = 1L;

	private String[] bccAddresses;
	private String[] ccAddresses;
	private String emailAddress;

	public String[] getBccAddresses() {
		return bccAddresses;
	}

	public void setBccAddresses(String[] bccAddresses) {
		this.bccAddresses = bccAddresses;
	}

	public String[] getCcAddresses() {
		return ccAddresses;
	}

	public void setCcAddresses(String[] ccAddresses) {
		this.ccAddresses = ccAddresses;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
