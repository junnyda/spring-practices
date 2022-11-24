package com.bitacademy.container.config.soundsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bitacademy.container.config.sountsystem.CDPlayerConfig;
import com.bitacademy.container.soundsystem.CDPlayer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {CDPlayerConfig.class})
public class CdPlayerConfigTest {
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlateyNotNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() { 
		String sound = cdPlayer.play();
		assertEquals("Playing 붕붕 by 김하은", sound);
		
	}

}
