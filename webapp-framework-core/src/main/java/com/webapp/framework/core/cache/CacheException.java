package com.webapp.framework.core.cache;

public class CacheException extends Exception {
	private static final long serialVersionUID = -8227517615797871257L;

	public CacheException() {
	}

	public CacheException(String message, Throwable cause) {
		super(message, cause);
	}

	public CacheException(String message) {
		super(message);
	}

	public CacheException(Throwable cause) {
		super(cause);
	}
}