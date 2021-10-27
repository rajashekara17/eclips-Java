package com.xworkz.petient;

import com.xworkz.operator.Medical;

public class MedicalStarter {

	public static void main(String[] args) {
		Medical operator=new Medical();
		operator.add("Avomin");
		operator.display();
		operator.add("XYZ");
		operator.add("XYZ");
		operator.add("XYZ");
		operator.add(null);
		operator.display();

	}

}
