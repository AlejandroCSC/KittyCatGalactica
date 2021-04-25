package myGameEngine;
import GameServer.*;
import KittyCatGalactica.*;
import ray.input.action.AbstractInputAction;
import ray.rage.scene.*;
import ray.rage.game.*;
import ray.rml.*;
import net.java.games.input.Event;
import ray.audio.*;
import com.jogamp.openal.ALFactory;

public class VolumeUpAction extends AbstractInputAction{ 
	private Sound music;
	private MyGame myGame;
	
	public VolumeUpAction(Sound s, MyGame g)
	{
        music = s;
		myGame = g;
	} 
	
	public void performAction(float time, Event e)
	{   
        int v = music.getVolume();
        if (v >= 0 && v < 10){
            v++;
            music.setVolume(v);
        }
	} 
} 