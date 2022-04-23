package com.handling.img;

public class ApiHandler {
	
	final static int MAPLE_VERSION = 362;
	final static String REGION = "KMS";
	
	public String getCharImg(String skin, String item, String pos) {
		//skin = getSkinData, item = getItemDataList
		return "https://maplestory.io/api/Character/" + skin + item + "/" + pos + "/0?showears=false&showLefEars=false&showHighLefEars=undefined&resize=1&name=&flipX=false&bgColor=0,0,0,0";
	}
	
	private String getSkinData(int skinCode) {
		return "{\"itemId\":" + skinCode + ",\"version\":\"" + MAPLE_VERSION + "\",\"region\":\"" + REGION + "\"}, "
				+ "{\"itemId\":" + (skinCode+10000) + ",\"version\":\"" + MAPLE_VERSION + "\",\"region\":\"" + REGION + "\"}";
	}
	
	private String getItemData(int itemCode) {
		return ",{\"itemId\":" + itemCode + ",\"version\":\"" + MAPLE_VERSION + "\",\"region\":\"" + REGION + "\"}";
	}
	
	public String getItemDataList() {
		String result = "";
		for (String key : allItemMap.keySet()) { // 장착 중인 아이템 리스트 가져와야 함
			Integer itemCode = allItemMap.get(key);
			if (itemCode == null ? false : true) {
				result+=getItemData(itemCode);
			}
		}
		return encodeURIComponent(result);
	}
	
	
	public String getEquipJson() {
		return "https://maplestory.io/api/" + REGION + "/" + MAPLE_VERSION + "/item/category/equip";
	}
	
}
