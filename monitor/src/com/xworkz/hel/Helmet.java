package com.xworkz.hel;

public class Helmet {
	private String[] shop=new String[3];
	private int count;
	
	public Helmet(){
		System.out.println("No-org constructor invoke here");
	}
	
	public void add(String Brandname) {
		System.out.println("Add method invoke here");
		if(Brandname!=null && this.count<this.shop.length) {
			this.shop[count]=Brandname;
			count++;
			System.out.println("Helmet ivoke:".concat(Brandname));
		}
		else
		{
			System.out.println("Barnd name not be null or container is fulls");
		}
	}
 public void display()
 {		
	 System.out.println("Dispay Method Invoke Here");
	 for(int index=0;index<this.shop.length;index++) {
	 String shp=this.shop[index];
	 System.out.println(shp);
 }
}
}
