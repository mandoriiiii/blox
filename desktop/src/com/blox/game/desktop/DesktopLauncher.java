package com.blox.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.blox.game.blox;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		// WVGA (800x480)
		config.width = 800;
		config.height = 480;
		
		new LwjglApplication(new blox(), config);
	}
}
