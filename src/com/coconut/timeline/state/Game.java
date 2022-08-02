package com.coconut.timeline.state;

import java.awt.Color;

import com.coconut.timeline.Main;

import dev.suback.marshmallow.MSDisplay;
import dev.suback.marshmallow.MSMain;
import dev.suback.marshmallow.object.shape.MSRender;
import dev.suback.marshmallow.state.MSState;

public class Game implements MSState {

	public static final int MS = 70;

	@Override
	public void init() {

	}

	@Override
	public void render() {
		MSRender.setColor(Color.black);
		MSRender.renderUIRect(MSDisplay.width / 2, MSDisplay.height / 2, MSDisplay.width, MSDisplay.height);

	}

	@Override
	public void update() {
		Main.display.setTitle("Timeline - " + MSMain.fps);
	}

}
