package com.project.maple;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AjaxController {
	
	
	@RequestMapping(value = "/getImg", method = RequestMethod.GET)
	public ResponseEntity<String> getImg(HttpServletRequest request){
		String result = "";
		ResponseEntity<String> entity = new ResponseEntity<String>(result, HttpStatus.OK);
		return entity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	<select id="skinId" name="skinId" onchange="javascript:fnCngSkin();">
//	<option value="2000">크림 피부</option>
//	<option value="2018">뽀송 라벤더 피부</option>
//	<option value="2019">홍조 라벤더 피부</option>
//	<option value="2015">뽀송 꽃잎 피부</option>
//	<option value="2016">홍조 꽃잎 피부</option>
//	<option value="2004">스산 피부</option>
//	<option value="2010">노블레스 피부</option>
//	<option value="2001">태닝 피부</option>
//	<option value="2003">밀키 피부</option>
//	<option value="2009">창백 피부</option>
//	<option value="2013">데모닉 피부</option>
//	<option value="2002">헬시 피부</option>
//	<option value="2011">고져스 피부</option>
//	<option value="2012">엘프 피부</option>
//</select>
	
}
