package com;

public class demo {
	public static  void main(String[] args) {
		int kongping=5;
		int gai=5;
		int allping=5;
		while(kongping>=2||gai>=4){
			allping+=kongping/2+gai/4;
			System.out.println("һ�����Ժ�"+allping+"ƿ");
			int kongping1=kongping/2+kongping%2+gai/4;
			System.out.println("��ƿ"+kongping1);
			int gai1=gai/4+gai%4+kongping/2;
			System.out.println("ƿ��"+gai1);
			kongping=kongping1;
			gai=gai1;
		}
		System.out.println("һ������"+allping);
          System.out.println(23&2); 
	}
	
}
