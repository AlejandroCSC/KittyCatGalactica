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

public class VolumeMuteAction extends AbstractInputAction{ 
	private Sound music;
	private MyGame myGame;
	
	public VolumeMuteAction(Sound s, MyGame g)
	{
        music = s;
		myGame = g;
	} 
	
	public void performAction(float time, Event e)
	{   
        boolean isPlaying = music.getIsPlaying();
        if(isPlaying == true){
            music.pause();
        }else if(isPlaying == false){
            music.resume();
        }

        //music.togglePause();
	} 
} 