package com.basbaer.myflappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyFlappyBird extends ApplicationAdapter {
	SpriteBatch batch;
	Texture background;

	@Override
	public void create () {
		batch = new SpriteBatch();

		//get the image for the background
		background = new Texture("bg.png");

	}

	@Override
	public void render () {

		//telling the render method, that we start to display sprites
		batch.begin();

		//display the background
		//parameters: image, x-coordinate, y-coordinate, width, height
		batch.draw(background, 0,0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		//tell the method, that we are done with the sprites
		batch.end();

	}

	@Override
	public void dispose () {
		batch.dispose();
		background.dispose();
	}
}