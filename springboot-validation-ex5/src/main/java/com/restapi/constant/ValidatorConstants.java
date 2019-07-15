package com.restapi.constant;

public class ValidatorConstants {
	public static final String EMAIL = "^[A-Za-z0-9._+-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,4}$";
	public static final String IP_ADDRESS = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	public static final String ENTITY_NAME = "^[\\w\\s$#@*&,.-]{4,36}$";
	public static final String ENTITY_DESCRIPTION = "^[\\w\\s$#@*&,.-]{0,250}$";
	public static final String GUID_IDENTIFIER = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
	public static final String DIGIT = "^[0-9]+$";
	public static final String OBID_IDENTIFIER = "^[0-9a-fA-F]{32}$";
}
