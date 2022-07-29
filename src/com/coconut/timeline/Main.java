package com.coconut.timeline;

import com.coconut.timeline.state.Game;

import dev.suback.marshmallow.MSDisplay;
import dev.suback.marshmallow.state.MSState;

public class Main {

	public static MSDisplay display;
	public static Game game;

	public static void main(String[] args) {
		game = new Game();
		display = new MSDisplay("TimeLine", 1280, 720);

		MSState.setState(game);
	}

}
