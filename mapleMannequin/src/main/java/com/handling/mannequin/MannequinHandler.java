package com.handling.mannequin;

import java.util.LinkedHashMap;

import com.project.data.MannequinDTO;

public class MannequinHandler {
	
	int defaultSkin = 2000;
	String defaultPos = "stand1";
	LinkedHashMap<String, Integer> allItemMap = new LinkedHashMap<String, Integer>();
	
	public Mannequin() {
		//마네킹 이름, 성별 추가
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
		allItemMap.put("EyeA", null);
		allItemMap.put("Top", null);
		allItemMap.put("Bottom", null);
	}
	
	public String getMannequin() {
		return getImgSrc(getSkinString(defaultSkin),getAllItem(),defaultPos);
	}
	
	public void setMannequin(MannequinDTO mannequinDTO) {
		if (mannequinDTO.getSkin()!=0) {
			setDefaultSkin(mannequinDTO.getSkin());
		}
		allItemMap.put("Hair", mannequinDTO.getHair());
		allItemMap.put("Face", mannequinDTO.getFace());
		allItemMap.put("Overall", mannequinDTO.getOverall());
		allItemMap.put("Hat", mannequinDTO.getHat());
		allItemMap.put("Cape", mannequinDTO.getCape());
		allItemMap.put("Cash", mannequinDTO.getCash());
		allItemMap.put("Glove", mannequinDTO.getGlove());
		allItemMap.put("Shoes", mannequinDTO.getShoes());
		allItemMap.put("Earring", mannequinDTO.getEarring());
		allItemMap.put("FaceA", mannequinDTO.getFacea());
		allItemMap.put("EyeA", mannequinDTO.getEyea());
		allItemMap.put("Top", mannequinDTO.getTop());
		allItemMap.put("Bottom", mannequinDTO.getBottom());
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
}
