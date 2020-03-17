package Project;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import sun.audio.*;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music 
{
	public static void playSong(String songName)  
	{
	    try
	    {
	    	FileInputStream song = new FileInputStream(songName);
	    	Clip clip = AudioSystem.getClip();
	    	AudioInputStream inputStream = AudioSystem.getAudioInputStream(song);
	    	clip.open(inputStream);
	    	FloatControl gainControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
	    	gainControl.setValue(+6.0f);
	    	clip.start();
	    	Thread.sleep(clip.getMicrosecondLength() / 1000);
	    	/**
	    	AudioStream BGM = new AudioStream(song);
	    	AudioData MD = BGM.getData();
	    	AudioPlayer MGP = AudioPlayer.player;
	    	ContinuousAudioDataStream loop = null;
	    	loop = new ContinuousAudioDataStream(MD);
	    	MGP.start(loop);
	    	**/
	    }
	    catch (FileNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch (InterruptedException e)
	    {
	    	e.printStackTrace();
	    }
	    catch (UnsupportedAudioFileException e)
	    {
	    	e.printStackTrace();
	    }
	    catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
	    catch (LineUnavailableException e)
	    {
	    	e.printStackTrace();
	    }
	}

	//plays buzzer if player tries to click on button that is not a valid option
	public static void playBuzzer()
	{
		try
	    {
	    	FileInputStream song = new FileInputStream("incorrect.mp3");
	    	Player player = new Player(song);
	    	player.play();
	    }
	    catch (FileNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch (JavaLayerException e)
	    {
	    	e.printStackTrace();
	    }
	}

	public static void soundTheHorns()
	{
		try
	    {
	    	FileInputStream song = new FileInputStream("airhorn.mp3");
	    	Player player = new Player(song);
	    	player.play();
	    }
	    catch (FileNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    catch (JavaLayerException e)
	    {
	    	e.printStackTrace();
	    }
	}
}




