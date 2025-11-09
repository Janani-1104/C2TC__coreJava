package com.tnsif.dayeigth.interfacepractice.types.marker;

public class student implements register{
	private int ID;
	private String name;
	private String course;
	private int fees;
	public student(int ID,String name,String course,int fees) {
		this.ID=ID;
		this.name=name;
		this.course=course;
		this.fees=fees;
		
	}
	public int getiD() {
		 return ID;
	 }
	public void setiD(int ID) {
		this.ID=ID;
	}
	public String getName() {
		 return name;
	 }
	public void setName(String name) {
		this.name=name;
	}
	public String getCourse() {
		 return course;
	 }
	public void setCourse(String course) {
		this.course=course;
	}
	public int getFees() {
		 return fees;
	 }
	public void setFees(int fees) {
		this.fees=fees;
	}
	//public void show() {
		//System.out.println(Student[id=" + ID + ", name=" + name + ", fees=" + fees + ", course=" + course + "]");
	//}
	//System.out.println(Student [id=" + ID + ", name=" + name + ", fees=" + fees + ", course=" + course + "]");
	//public String toString() {
		//return "Student [id=" + ID + ", name=" + name + ", fees=" + fees + ", course=" + course + "]";
	public void show() {
    System.out.println("Student [id=" + ID + ", name=" + name + ", fees=" + fees + ", course=" + course + "]");
}


}
