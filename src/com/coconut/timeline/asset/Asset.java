package com.coconut.timeline.asset;

import dev.suback.marshmallow.object.MSSprite;

public class Asset {

	public static final int IS = 16;

	public static final MSSprite[] player = { new MSSprite("img/player.png").cutImage(0, 0, IS, IS),
			new MSSprite("img/player.png").cutImage(IS, 0, IS, IS),
			new MSSprite("img/player.png").cutImage(IS * 2, 0, IS, IS),
			new MSSprite("img/player.png").cutImage(IS * 3, 0, IS, IS), };

	public static final MSSprite[] mineTile = { new MSSprite("img/mine/tile.png").cutImage(0, 0, IS, IS),
			new MSSprite("img/mine/tile.png").cutImage(IS, 0, IS, IS),
			new MSSprite("img/mine/tile.png").cutImage(IS * 2, 0, IS, IS),
			new MSSprite("img/mine/tile.png").cutImage(IS * 3, 0, IS, IS), };
}
