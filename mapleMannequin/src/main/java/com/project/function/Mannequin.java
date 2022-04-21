package com.project.function;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

public class Mannequin {
	
	final static int MAPLE_VERSION = 362;
	final static String REGION = "KMS";
	int defaultSkin = 2000;
	String defaultPos = "stand1";
	LinkedHashMap<String, Integer> allItemMap = new LinkedHashMap<String, Integer>();
	
	public Mannequin() {
		allItemMap.put("Hair", null);
		allItemMap.put("Face", null);
		allItemMap.put("Overall", null);
		allItemMap.put("Hat", null);
		allItemMap.put("Cape", null);
		allItemMap.put("Cash", null);
		allItemMap.put("Glove", null);
		allItemMap.put("Shoes", null);
		allItemMap.put("Earring", null);
		allItemMap.put("FaceA", null);
		allItemMap.put("EarA", null);
		allItemMap.put("Top", null);
		allItemMap.put("Bottom", null);
	}
	
	
	public String getMannequin() {
		return getImgSrc(getSkinString(defaultSkin),getAllItem(),defaultPos);
	}
	
	public String getAllItem() {
		String result = "";
		for (String key : allItemMap.keySet()) {
			Integer itemCode = allItemMap.get(key);
			if (itemCode == null ? false : true) {
				result+=getItemString(itemCode);
			}
//		    System.out.println("방법1) key : " + key +" / value : " + allItemSet.get(key));
		}
		return encodeURIComponent(result);
	}
	
	public String getImgSrc(String skin, String item, String pos) {
		return "https://maplestory.io/api/Character/" + skin + item + "/" + pos + "/0?showears=false&showLefEars=false&showHighLefEars=undefined&resize=1&name=&flipX=false&bgColor=0,0,0,0";
	}
	
	public String getSkinString(int skinCode) {
		String result = "";
		result = encodeURIComponent(
				"{\"itemId\":" + skinCode + ",\"version\":\"" + MAPLE_VERSION + "\",\"region\":\"" + REGION + "\"},"
				+ "{\"itemId\":" + (skinCode+10000) + ",\"version\":\"" + MAPLE_VERSION + "\",\"region\":\"" + REGION + "\"}");
		return result;
	}
	
	public String getItemString(int itemCode) {
		return ",{\"itemId\":" + itemCode + ",\"version\":\"" + MAPLE_VERSION + "\",\"region\":\"" + REGION + "\"}";
	}
	
	public int getDefaultSkin() {
		return defaultSkin;
	}
	
	public void setDefaultSkin(int defaultSkin) {
		this.defaultSkin = defaultSkin;
	}
	
	public String getDefaultPos() {
		return defaultPos;
	}
	
	public void setDefaultPos(String defaultPos) {
		this.defaultPos = defaultPos;
	}
	
	public LinkedHashMap<String, Integer> getAllItemSet() {
		return allItemMap;
	}

	public static String encodeURIComponent(String s) {
		String result = null;
		try {
			result = URLEncoder.encode(s, "UTF-8")
							   .replaceAll("\\+", "%20")
							   .replaceAll("\\%21", "!")
							   .replaceAll("\\%27", "'")
						  	   .replaceAll("\\%28", "(")
						  	   .replaceAll("\\%29", ")")
						  	   .replaceAll("\\%7E", "~");
		}
		
		catch (UnsupportedEncodingException e) {
			result = s;
		}
		return result;
	}
	
}