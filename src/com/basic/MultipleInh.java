package com.basic;

public class MultipleInh implements Aman,Raman{

	@Override
	public String girlFriend() {
		return "same method girlFriend in Aman , Raman";
	}
	@Override
	public void girlFriendSister() {
		Raman.super.girlFriendSister();
		Aman.super.girlFriendSister();
	}
	
	public void girlFriendColour() {
		Aman.girlFriendColour();
		Raman.girlFriendColour();
	}
	
	public static void main(String[] args) {
		MultipleInh m = new MultipleInh();
		System.out.println(m.girlFriend());
		m.girlFriendSister();
		m.girlFriendColour();
	}

}
