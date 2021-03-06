package com.afrAsia.entities.response;

import java.io.Serializable;

public class MessageHeader implements Serializable {

	private static final long serialVersionUID = 1L;

	private RequestError error;

	public RequestError getError() {
		return error;
	}

	public void setError(RequestError error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "MessageHeader [error=" + error + "]";
	}

}
