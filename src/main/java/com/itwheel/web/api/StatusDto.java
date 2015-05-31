package com.itwheel.web.api;

import org.apache.commons.lang3.StringUtils;

import com.itwheel.web.Constants;


public class StatusDto<T> {
	//TODO 私有构造 不可修改code
	private String code;

	private String message;

	private T data;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static StatusDto<String> buildSuccessStatusDto() {
		return buildSuccessStatusDto("Success");
	}
	
	public static <E> StatusDto<E> buildDataSuccessStatusDto() {
		return buildDataSuccessStatusDto("Success");
	}
	
	
	
	
	
	public static <E> StatusDto<E> buildDataSuccessStatusDto(String message) {
		StatusDto<E> dto = new StatusDto<E>();
		dto.code = Constants.RESP_STATUS_CODE_SUCCESS;
		dto.message = message;
		return dto;
	}
	

	public static  StatusDto<String> buildSuccessStatusDto(String message) {
		StatusDto<String> dto = new StatusDto<String>();
		dto.code = Constants.RESP_STATUS_CODE_SUCCESS;
		dto.message = message;
		return dto;
	}

	public static StatusDto<String> buildFailureStatusDto() {
		return buildFailureStatusDto("Failure");
	}

	public static StatusDto<String> buildFailureStatusDto(String message) {
		StatusDto<String> dto = new StatusDto<String>();
		dto.code = Constants.RESP_STATUS_CODE_FAIL;
		dto.message = message;
		return dto;
	}
	
	
	public static <E> StatusDto<E> buildDataFailureStatusDto() {
		return buildDataFailureStatusDto("Failure");
	}
	
	
	public static <E> StatusDto<E> buildDataFailureStatusDto(String message) {
		StatusDto<E> dto = new StatusDto<E>();
		dto.code = Constants.RESP_STATUS_CODE_FAIL;
		dto.message = message;
		return dto;
	}
	
	

	public static StatusDto<String>  buildRefreshStatusDto(String message) {
		StatusDto<String> dto = new StatusDto<String>();
		dto.code = Constants.RESP_STATUS_CODE_REFRESH;
		dto.message = message;
		return dto;
	}
	
	public boolean isSuccess (){
		return StringUtils.equals(this.code, Constants.RESP_STATUS_CODE_SUCCESS);
	}

}