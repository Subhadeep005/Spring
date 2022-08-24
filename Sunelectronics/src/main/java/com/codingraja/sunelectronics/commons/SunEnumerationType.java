package com.codingraja.sunelectronics.commons;

/**
 * In order for the Sun Administration to display enumerated values with
 * meaningful labels, enumerations should implement this interface.
 */
public interface SunEnumerationType {
	public String getType();

	public String getFriendlyType();
}
