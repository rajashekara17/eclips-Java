package com.xworkz.operator;

public class Medical {
	private String[] container=new String[5];
	private int count;
	
	public Medical() {
		System.out.println("Invoke constructor here");
	}
	public void add(String medname)
	{
		if(medname!=null && this.count<this.container.length) {
			this.container[count]=medname;
			count++;
			System.out.println("Add medicine" +medname);
		}
		else
		{
			System.out.println("Medicine cannot be null or container is full");
		}
		
	}
	
	public void display()
	{
		System.out.println("dicpaly madicine names");
		for(int index=0; index<this.container.length;index++)
		{
		String	dis=this.container[index];
		System.out.println(dis);
		}
	}
}