package com.ganesh;

public class HelloWorld {

	int a=1;
    int b=2;
    int c=3;
    int d=4;
    public static void main(String[] args) {
        
        HelloWorld hw=new HelloWorld();
       int h=hw.highestMarks(4,3,2,1);
       System.out.println(h);
       int l=hw.lowestMarks(4,3,2,1);
       System.out.println(l);
double perc=50/3.5;
System.out.println(perc);
       
    }
    
    public Integer highestMarks(Integer a,Integer b,Integer c,Integer d)
	{
		Integer high=a;
		if(b>high) {
			high=b;
		}
		if(c>high) {
			high=c;
		}
		if(d>high) {
			high=d;
		}
		return high;
	}
    public Integer lowestMarks(Integer a,Integer b,Integer c,Integer d)
	{
		Integer low=a;
		if(b<low) {
			low=b;
		}
		if(c<low) {
			low=c;
		}
		if(d<low) {
			low=d;
		}
		return low;
	}
}


