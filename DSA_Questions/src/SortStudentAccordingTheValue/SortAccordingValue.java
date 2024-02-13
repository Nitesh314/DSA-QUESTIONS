package SortStudentAccordingTheValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortAccordingValue {
	
	public static void main(String[] args) {
		
		Map<String, Student> hm=new HashMap<>();
		
		hm.put("Maharashtra",new Student(1,"Nitesh",650));
		hm.put("Uttar-Pradesh",new Student(3,"Ashish",850));
		hm.put("Utrakhand",new Student(4,"Ankit",450));
		hm.put("Karnatk",new Student(2,"Sumit",750));
		hm.put("Kerla",new Student(5,"Manoj",250));
		
//		for(Map.Entry<String,Student> en:hm.entrySet()) {
//			System.out.println(en.getKey()+" ---> "+en.getValue().getMarks());
//		}
//		
		
		List<Map.Entry<String,Student>> list=new ArrayList<>(hm.entrySet());
		
		Collections.sort(list,new Comparator<Map.Entry<String,Student>>() {

			@Override
			public int compare(Entry<String, Student> s1, Entry<String, Student> s2) {
				
				return  s1.getValue().getMarks()>s2.getValue().getMarks()?+1:-1;
				
			}

		});
		
		Map<String,Student> lm=new LinkedHashMap<>();
		
		for(Map.Entry<String,Student> en:list) {
			lm.put(en.getKey(),en.getValue());
		}
		
		for(Map.Entry<String,Student> en:lm.entrySet()) {
			System.out.println(en.getKey()+"--->"+en.getValue().getRoll()+"\n"+en.getValue().getName()+"\n"+en.getValue().getMarks()+"\n***********************\n");
			
		}
		
	}

}
