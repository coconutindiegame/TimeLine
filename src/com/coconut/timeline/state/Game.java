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

	public double turnTimer = 0, turnSpeed = 0.02;

	// 턴 돌때마다 실행되는 함수
	public void updateTurn() {
		
	}

	@Override
	public void update() {
		Main.display.setTitle("Timeline - " + MSMain.fps);

		//턴 타이머 올리고 1넘어가면 0으로 초기화, 함수 실행
		turnTimer += turnSpeed;
		if (turnTimer >= 1) {
			turnTimer = 0;
			updateTurn();
		}
	}

}
