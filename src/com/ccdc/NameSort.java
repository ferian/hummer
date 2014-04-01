package com.ccdc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NameSort {

	public List<String> String2ListAndSort(String source){
		if (source != null && !"".equals(source)) {
			List<String> list = new ArrayList<String>();
			String [] sor = source.split("\n");
			
			System.out.println(sor.length);
			
			for (String str : sor){
				if(str != null && !"".equals(str))
					list.add(str);
			}
			//排序
			Collections.sort(list);
			return list;
		}
		return null;
	}
	
	public List<String> String2List(String source){
		if (source != null && !"".equals(source)) {
			List<String> list = new ArrayList<String>();
			String [] sor = source.split("\n");
			
			System.out.println(sor.length);
			
			for (String str : sor){
				if(str != null && !"".equals(str))
					list.add(str);
			}
			//排序
//			Collections.sort(list);
			return list;
		}
		return null;
	}
	
	//Word 
	public StringBuffer Word(List<String> list){
		StringBuffer sb = new StringBuffer();
		for (int i = 0, size = list.size(); i < size; i++) {
			if (i % 3 == 0) {
				sb.append("<tr> \n");
				sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
				sb.append(list.get(i));
				sb.append("</td>\n");
				continue;
			}
			if (i % 3 == 1) {
				sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
				sb.append(list.get(i));
				sb.append("</td>\n");
				continue;
			}
			if (i % 3 == 2) {
				sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
				if (i != size) {
					sb.append(list.get(i));

				}
			
				sb.append("</td>\n");
				sb.append("  </tr>\n");
				continue;
			}
			
		}
		return sb;
	}
	
	//HTML  变成2列
	public StringBuffer HTML2Col(List list){
		StringBuffer sb = new StringBuffer();
		for (int i = 0, size = list.size(); i < size; i++) {
			if (i % 2 == 0) {
				sb.append("<tr> \n");
				sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
				sb.append(list.get(i));
				sb.append("</td>\n");
				continue;
			}
			if (i % 2 == 1) {
				sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
				if (i != size) {
					sb.append(list.get(i));

				}
			
				sb.append("</td>\n");
				sb.append("  </tr>\n");
				continue;
			}
			
		}
		return sb;
	}
	
	//HTML 变成3列
		public StringBuffer HTML3Col(List list){
			StringBuffer sb = new StringBuffer();
			for (int i = 0, size = list.size(); i < size; i++) {
				if (i % 3 == 0) {
					sb.append("<tr> \n");
					sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
					sb.append(list.get(i));
					sb.append("</td>\n");
					continue;
				}
				if (i % 3 == 1) {
					sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
					if (i != size) {
						sb.append(list.get(i));
					}
					sb.append("</td>\n");
					continue;
				}
				if (i % 3 == 2) {
					sb.append("    <td>&nbsp;&nbsp;&nbsp;&nbsp;");
					if (i != size) {
						sb.append(list.get(i));

					}
					sb.append("</td>\n");
					sb.append("  </tr>\n");
					continue;
				}
				
			}
			return sb;
		}
	/**
	 * source:
	 * aa ab ac
	 * ba bb bc
	 * result:
	 * aa ab
	 * ac
	 * ba bb
	 * bc
	 * 
	 * @return
	 */
	public StringBuffer[] WordOne(List<String> list) {
		
		List<String> tempList = new ArrayList<String>();
		Map<String, String> tempMap = new IdentityHashMap<String, String>();
		Iterator<String> iterator = list.iterator();
		
		List<Person> personList = new ArrayList<Person>();
		Person person = null;
		int id = 1;
		while(iterator.hasNext()){
			String str = iterator.next();
			person = new Person();
			person.setName(str);
			person.setId(id++);
			personList.add(person);
			
			System.out.println(str);
			tempList.add(str.toLowerCase());
			tempMap.put(str.toLowerCase(), str);
		}
		
		Collections.sort(personList);
		StringBuffer [] result = new StringBuffer[2];
		for(int i = 0; i<result.length; i++){
			result[i] = new StringBuffer();
		}
		String prevItem = null;
		int odd_even=0;
		for (int i = 0, size = personList.size(); i < size; i++) {
			Person per = personList.get(i);
			String name = per.getName();
			if (odd_even % 2 == 0) {
				result[0].append(name + "\n");
				prevItem =name;
				odd_even++;
				continue;
			}
			if (odd_even % 2 == 1 && prevItem != null && prevItem.substring(0,1).toLowerCase().equals(name.substring(0,1).toLowerCase())) {
				result[1].append(name + "\n");
				prevItem = name;
				odd_even++;
				continue;
			}
			else {
				result[1].append( "\n");
				result[0].append(name + "\n");
				prevItem = name;
				odd_even+=2;
				continue;
			}
			
		}
		return result;
	}
	
	
public String blank2Tab(List<String> list){
	if(list== null || list.size()<=0)return null;
	StringBuffer sb = new StringBuffer();
	for(int i = 0; i< list.size(); i++){
		sb.append(list.get(i).replace("   ", "\t") + "\n");
		
	}
	return sb.toString();
}
	
	//第一个字母大写，其他小写
	private String FirstUPOthersLow(String str){
		if(str != null && !str.equals("")){
			return str.substring(0,1).toUpperCase() + str.substring(1, str.length()).toLowerCase();
		}
		return null;
	}
	

}
