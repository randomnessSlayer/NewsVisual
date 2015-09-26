package com.example.newsvisual;

import java.net.URL;


public class BasicTester {
	
	public static void main(String[] args){
		
		try {
			RSSFeed rssf = new RSSFeed(new URL("http://rss.cnn.com/rss/cnn_topstories.rss"));
			
			XMLParser xmlr = new XMLParser(rssf.getDoc(), "orange");
			
			WebReader wr = new WebReader(xmlr.retrieveLinks());
			
			for(String string : wr.getOutputs()){
				System.out.println(string);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
