//Program to demonstrate Functional Interface

package com.tnsif.daynineteen.v1;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}