package com.sudhir.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class MainCLient {

	public static void main(String[] args) throws NumberFormatException, IOException {
		byte a_value = 'a';
		int count=0;
		Map<Integer,Integer> map = new Hashtable<Integer, Integer>();
		List<String> list = new ArrayList<String>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while(t-->0) {
			list.add(bf.readLine());
		}
		
		for(String str:list) {
			byte[] bt;
				bt = str.getBytes("US-ASCII");
				for(byte b:bt) {
					count = count+b-a_value;
				}
				if(map.get(count) == null)
					map.put(count, 0);
				else
					map.put(count, (Integer)map.get(count)+1);
				
				count = 0;
		}
		count = 0;
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(count<entry.getValue())
				count = entry.getValue();
		}
		System.out.println(count+1);
	}

}
