package com.coconut.timeline.object;

import com.coconut.timeline.asset.Asset;
import com.coconut.timeline.state.Game;

import dev.suback.marshmallow.object.MSObject;

public class Player extends MSObject {

	public Player(int x, int y) {
		super(x, y, Game.MS, Game.MS);
		sprite = Asset.player[0];
	}

}
