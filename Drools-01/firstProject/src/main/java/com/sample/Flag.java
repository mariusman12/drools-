package com.sample;

public class Flag {
	private String name;
	private String color1;
	private String color2;
	private String color3;
	private String country;
	private String colorSearch;
	Flag(){
		this.name= "";
		this.color1="";
		this.color2="";
		this.color3="";
		this.country="";
		this.colorSearch="";
	}
	Flag(String numeA,String color1A,String color2A){
		this.name= numeA;
		this.color1=color1A;
		this.color2=color2A;
		this.color3="";
		this.country="";
		this.colorSearch="";
	}
	Flag(String numeA,String color1A,String color2A, String color3A){
		this.name= numeA;
		this.color1=color1A;
		this.color2=color2A;
		this.color3=color3A;
		this.country="";
		this.colorSearch="";
		
	}
	
	public String getColor1(){
		return color1;
	}
	public String getColor2(){
		return color2;
	}
	public String getColor3(){
		return color3;
	}
	
	public void setCountry(String country1){
		this.country = country1;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	
	public void setColorSearch(String colorSearch1){
		this.colorSearch = colorSearch1;
	}
	
	public String getColorSearch(){
		return this.colorSearch;
	}
	
}