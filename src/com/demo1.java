package com;
/**
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣� 
 * @author techbuddy
 *
 */
public class demo1 {
  public static void main(String[] args) {
	int all1=2;//������һ���µ�����
	int all2=0;//������2���µ�����
	int all3=0;
	int yue=1;
	while(yue<12){
	    if(yue==1){
	    	all1=2;
	    	all2=0;
	    	all3=0;
	    }
	    if(yue==2){
	    	all1=2;
	    	all2=2;
	    	all3=0;
	    }else{
	    	all3=all2+all2*2;
	    	all2=all3;
	    	all1=all2*2;
	    }
	    yue++;
	    System.out.println("��"+yue+"����"+all3+"ֻ");
	}
}
}
