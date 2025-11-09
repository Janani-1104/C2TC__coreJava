package com.tnsif.dayfour.thirdpackage;
import com.tnsif.dayfour.firstpackage.*;
import com.tnsif.dayfour.secondpackage.*;

public class accessdemo {

	public static void main(String[] args) {
		calc c=new calc();
		advance a=new advance();
				System.out.println("Addition: " + c.add(10,5));
				c.showPrivate();
				a.display();
		}
}
		

