package com.springcore.configuration;

import org.springframework.context.annotation.Bean;

public class test {
	private Player player;
	
    public test(Player player) {
    	super();
    	this.player = player;
    }
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void  School() {
		player.School();
		System.out.println("School is good");
    }
	
	public void Student() {
		System.out.println("Student is good");
	}

}
 