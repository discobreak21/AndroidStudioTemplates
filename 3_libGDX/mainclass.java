package com.basbaer.myflappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyFlappyBird extends ApplicationAdapter {
	SpriteBatch batch;


	@Override
	public void create () {
		batch = new SpriteBatch();


	}

	@Override
	public void render () {



	}

	@Override
	public void dispose () {
		batch.dispose();
		
	}
}
