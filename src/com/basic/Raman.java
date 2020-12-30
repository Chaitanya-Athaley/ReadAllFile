package com.basic;

public interface Raman {
	
	public String girlFriend();
	
	public default void girlFriendSister(){
		System.out.println("girlFriendSister of Raman");
	}
	
	public static void girlFriendColour(){
		System.out.println("girlFriend Color is Fair (Raman)");
	}
}
