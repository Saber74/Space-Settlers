package com.mygdx.game.desktop;
import com.mygdx.game.game.Main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Tester Boi";
		config.foregroundFPS = 60;
		config.width = 1920;
		config.height = 1080;
//		config.width = 232;
//		config.height = 248;
		new LwjglApplication(new Main(), config);
	}
}