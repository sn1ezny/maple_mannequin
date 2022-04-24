package com.handling.img;

import com.handling.function.EncodeHandler;
import com.project.data.MannequinDTO;

public class ApiHandler {
	
	final static int MAPLE_VERSION = 362;
	final static String REGION = "KMS";
	
	public StringBuilder getMannequinImgSrc(MannequinDTO mannequinDTO) {
		StringBuilder sb = new StringBuilder();
		sb.append("https://maplestory.io/api/Character/");
		sb.append(EncodeHandler.encodeURIComponent(getSkinData(mannequinDTO.getSkin()).toString()));
		sb.append(EncodeHandler.encodeURIComponent(getItemDataList(mannequinDTO).toString()));
		sb.append("/");
		sb.append(mannequinDTO.getPos());
		sb.append("/0?showears=false&showLefEars=false&showHighLefEars=undefined&resize=1&name=&flipX=false&bgColor=0,0,0,0");
		return sb;
	}
	
	private StringBuilder getSkinData(int skinCode) {
		StringBuilder sb = new StringBuilder();
		sb.append(getItemData(skinCode));
		sb.append(getItemData(skinCode+10000));
		return sb;
	}
	
	public StringBuilder getItemDataList(MannequinDTO mannequinDTO) {
		StringBuilder ItemData = new StringBuilder();
		ItemData.append(getItemData(mannequinDTO.getHair()));
		ItemData.append(getItemData(mannequinDTO.getFace()));
		ItemData.append(getItemData(mannequinDTO.getOverall()));
		ItemData.append(getItemData(mannequinDTO.getHat()));
		ItemData.append(getItemData(mannequinDTO.getCape()));
		ItemData.append(getItemData(mannequinDTO.getCash()));
		ItemData.append(getItemData(mannequinDTO.getGlove()));
		ItemData.append(getItemData(mannequinDTO.getShoes()));
		ItemData.append(getItemData(mannequinDTO.getEarring()));
		ItemData.append(getItemData(mannequinDTO.getFacea()));
		ItemData.append(getItemData(mannequinDTO.getEyea()));
		ItemData.append(getItemData(mannequinDTO.getTop()));
		ItemData.append(getItemData(mannequinDTO.getBottom()));
		ItemData.append(getItemData(mannequinDTO.getSkin()));
		ItemData.setLength(ItemData.length() - 1);
		return ItemData;
	}
	
	private StringBuilder getItemData(int itemCode) {
		StringBuilder sb = new StringBuilder();
		if (itemCode != 0) {
			sb.append("{\"itemId\":");
			sb.append(itemCode);
			sb.append(",\"version\":\"");
			sb.append(MAPLE_VERSION);
			sb.append("\",\"region\":\"");
			sb.append(REGION);
			sb.append("\"},");
		}
		return sb;
	}
	
	public String getEquipJson() {
		return "https://maplestory.io/api/" + REGION + "/" + MAPLE_VERSION + "/item/category/equip";
	}
	
}
