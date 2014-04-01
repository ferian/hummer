package com.ccdc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import sun.misc.Sort;

public class NameSort {

	/*public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Ahn , Hyo-sung ; Korea");
		list.add("Blas , Vinagre ; Spain");
		list.add("Cao , Zhenwei ; Australia");
		list.add("Chai , Li ; China");
		list.add("Chen , Michael Z. Q. ; HongKong, China ");
		list.add("Celikovsky , Sergej ;Czech Republic ");
		list.add("Chen , Zhiyong ; Australia");
		list.add("Chen , Weihai ; China");
		list.add("Debeljkovic , Dragutin Lj. ; Serbia");
		list.add("Dashkovskiy , Sergey ; Germany");
		list.add("Dong , Jiuxiang ; China");
		list.add("Di Benedetto , M.D. ; Italy");
		list.add("Dumitru , Baleanu ; Turkey");
		list.add("Duan , Zhisheng ; China");
		list.add("Fan , Huijin ; China");
		list.add("Fang , YongChun ; China");
		list.add("Gao , Liqun ; China");
		list.add("Gao , Xianwen ; China");
		list.add("Georgi , M.DIMIROVSKI ; Turkey");
		list.add("Gong , Dunwei ; China");
		list.add("Guan , Zhi-Hong ; China");
		list.add("Guo , Ge ; China");
		list.add("Gu , Keqi ; USA");
		list.add("Ho , Daniel ; China");
		list.add("Han , Yang ; China");
		list.add("Hou , zhongsheng ; China");
		list.add("Hong , Yiguang ; China");
		list.add("Huang , Min ; China");
		list.add("Hovakimyan , Naira ; USA");
		list.add("Hu , Sanqing ; China");
		list.add("Ito , Hiroshi ; Japan");
		list.add("Jiang , Bin ; China");
		list.add("Jiang , Zhong-Ping ; China");
		list.add("Karafyllis , Iasson ; Greece");
		list.add("Lee , T.C. ; Taiwan");
		list.add("Lanusse , Patrick ; France");
		list.add("Lin , Chong ; China");
		list.add("Lin , Zhiyun ; China");
		list.add("Liu , Shixin ; China");
		list.add("Liu , Xingwen ; China");
		list.add("Machado , J. Tenreiro ; Portugal");
		list.add("Ma , Hongbin ; China");
		list.add("Mao , Jianfeng ; Singapore");
		list.add("Man , Zhihong ; Australia");
		list.add("Marconi , Lorenzo ; Italy");
		list.add("Mao , Zhizhong ; China");
		list.add("Monje , Concha ; China");
		list.add("Martin , Philippe ; France");
		list.add("Pepe , Pierdomenico ; Italy");
		list.add("Niu , Yugang ; China");
		list.add("Pogromsky , A. Y. ; Netherlends");
		list.add("Petras , Ivo ; Slovakia");
		list.add("Qi , Ruiyun ; China");
		list.add("Porfiri , Maurizio ; USA");
		list.add("Shi , Yang ; Canada");
		list.add("Shi , Peng ; UK");
		list.add("Song , Zhihuan ; China");
		list.add("Song , Yongduan ; China");
		list.add("Su , Rong ; Singapore");
		list.add("Stefanovic , Margareta ; USA");
		list.add("Sun , Zhendong ; China");
		list.add("Sun , Ximing ; China");
		list.add("Tang , Jiafu ; China");
		list.add("Tan , Ying ; Australia");
		list.add("Tenreiro , Machado ; Portugal");
		list.add("Tang , Lixin ; China");
		list.add("Vinagre , Blas ; China");
		list.add("Tsinias , John ; Greece");
		list.add("Wang , Dingwei ; China");
		list.add("Wang , Cong ; China");
		list.add("Wang , Leyi ; USA");
		list.add("Wang , Jianhui ; China");
		list.add("Wang , Yanwu ; China");
		list.add("Wang , Wei ; China");
		list.add("Wu  Chengdong ; China");
		list.add("Wang , Youqing ; China");
		list.add("Wei , Xiukun ; China");
		list.add("Xie , Xuejun ; China");
		list.add("Xin , Xin ; Japan");
		list.add("Xu , Li ; Japan");
		list.add("Xu , Shengyuan ; China");
		list.add("Xu , Xinhe ; China");
		list.add("Yang , Chenguang ; China");
		list.add("Ye , Dan ; China");
		list.add("Yin , Gang George ; USA");
		list.add("Zhai , Guisheng ; Japan");
		list.add("Zhang , Guoshan ; China");
		list.add("Zhang , Huaguang ; China");
		list.add("Zhang , Jianhua; China");
		list.add("Zhang , Qingling ; China");
		list.add("Zhang , Weihai ; China");
		list.add("Zhang , Yingwei ; China");
		list.add("Zhang , Yongpeng ; USA");
		list.add("Zhao , Chunhui ; China");
		list.add("Zhao , Jun ; China");
		list.add("Zheng , Weixing ; Australia");
		list.add("Zhou , Jing ; Australia");

	Iterator iterator = list.iterator();
	
	while (iterator.hasNext()){
		System.out.println(iterator.next());
	}
		
		Collections.sort(list);

		System.out.println(list);
		System.out.println(list.size());

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();
		for (int i = 0, size = list.size(); i < size; i++) {
			if (i % 3 == 0) {
				sb1.append(list.get(i) +"\n");
				continue;
			}
			if (i % 3 == 1) {
				sb2.append(list.get(i) +"\n");
				continue;
			}
			if (i % 3 == 2) {
				if (i != size) {
					sb3.append(list.get(i)+"\n");

				}
				continue;
			}
			
		}
		System.out.println(sb1);
		System.out.println(" ");
		System.out.println(sb2);
		System.out.println(" ");
		System.out.println(sb3);
		System.out.println(" ");

	}*/
	
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
