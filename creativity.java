/*<applet code="creativity.class"width=700 height=700>
</applet>*/

import java.awt.*;
import java.applet.*;
public class creativity extends Applet implements Runnable
{
	Image creativityPics[]=new Image[39];
	Image Img;
	Thread th;
	int x;
	int y=50;

	public void init()
	{
		String creativitySrc[]={"frame_00_delay-0.06s.jpg","frame_01_delay-0.06s.jpg","frame_02_delay-0.06s.jpg","frame_03_delay-0.06s.jpg","frame_04_delay-0.06s.jpg","frame_05_delay-0.06s.jpg","frame_06_delay-0.06s.jpg","frame_07_delay-0.06s.jpg","frame_08_delay-0.06s.jpg","frame_09_delay-0.06s.jpg","frame_10_delay-0.06s.jpg","frame_11_delay-0.06s.jpg","frame_12_delay-0.06s.jpg","frame_13_delay-0.06s.jpg","frame_14_delay-0.06s.jpg","frame_15_delay-0.06s.jpg","frame_16_delay-0.06s.jpg","frame_17_delay-0.06s.jpg","frame_18_delay-0.06s.jpg","frame_19_delay-0.06s.jpg","frame_20_delay-0.06s.jpg","frame_21_delay-0.06s.jpg","frame_22_delay-0.06s.jpg","frame_23_delay-0.06s.jpg","frame_24_delay-0.06s.jpg","frame_25_delay-0.06s.jpg","frame_26_delay-0.06s.jpg","frame_27_delay-0.06s.jpg","frame_28_delay-0.06s.jpg","frame_29_delay-0.06s.jpg","frame_30_delay-0.06s.jpg","frame_31_delay-0.06s.jpg","frame_32_delay-0.06s.jpg","frame_33_delay-0.06s.jpg","frame_34_delay-0.06s.jpg","frame_35_delay-0.06s.jpg","frame_36_delay-0.06s.jpg","frame_37_delay-0.06s.jpg","frame_38_delay-0.06s.jpg","frame_39_delay-0.06s.jpg"};

		for (int i=0;i<creativityPics.length;i++)
		{
			creativityPics[i]=getImage(getCodeBase(),"Images/"+creativitySrc[i]);
		}
		setSize(700,700);
	}
	public void start ()
	{
		if(th==null){
			th=new Thread(this);
			th.start();
		}
	}
	public void stop()
	{
		th=null;
	}
	public void run()
	{
		setBackground(Color.white);
		creativityRun(0,size().width/2);
		//Img=creativity  Pics[2];
		repaint();
		//pause();

	}
	void creativityRun(int start,int end)
	{
		for(int i=start;i<end;)
		{
			x=i;
			if(Img==creativityPics[0])
               Img=creativityPics[1];
            else if(Img==creativityPics[1])
              Img=creativityPics[2];
            else if(Img==creativityPics[2])
              Img=creativityPics[3];
            else if(Img==creativityPics[3])
              Img=creativityPics[4];
            else if(Img==creativityPics[4])
              Img=creativityPics[5];
            else if(Img==creativityPics[5])
              Img=creativityPics[6];
            else if(Img==creativityPics[6])
              Img=creativityPics[7];
            else if(Img==creativityPics[7])
              Img=creativityPics[8];
            else if(Img==creativityPics[8])
              Img=creativityPics[9];
            else if(Img==creativityPics[9])
              Img=creativityPics[10];
            else if(Img==creativityPics[10])
              Img=creativityPics[11];
            else if(Img==creativityPics[11])
              Img=creativityPics[12];
            else if(Img==creativityPics[12])
              Img=creativityPics[13];
            else if(Img==creativityPics[13])
              Img=creativityPics[14];
            else if(Img==creativityPics[14])
              Img=creativityPics[15];
            else if(Img==creativityPics[15])
              Img=creativityPics[16];
           else if(Img==creativityPics[16])
              Img=creativityPics[17];
           else if(Img==creativityPics[17])
              Img=creativityPics[18];
           else if(Img==creativityPics[18])
              Img=creativityPics[19];
           else if(Img==creativityPics[19])
              Img=creativityPics[20];
                else if(Img==creativityPics[20])
              Img=creativityPics[21];
              else if(Img==creativityPics[21])
              Img=creativityPics[22];
              else if(Img==creativityPics[22])
              Img=creativityPics[23];
              else if(Img==creativityPics[23])
              Img=creativityPics[24];
              else if(Img==creativityPics[24])
              Img=creativityPics[25];
              else if(Img==creativityPics[25])
              Img=creativityPics[26];
              else if(Img==creativityPics[26])
              Img=creativityPics[27];
           else if(Img==creativityPics[27])
              Img=creativityPics[28];
              else if(Img==creativityPics[28])
              Img=creativityPics[30];
              else if(Img==creativityPics[31])
              Img=creativityPics[32];
              else if(Img==creativityPics[32])
              Img=creativityPics[33];
              else if(Img==creativityPics[33])
              Img=creativityPics[34];
              else if(Img==creativityPics[34])
              Img=creativityPics[35];
              else if(Img==creativityPics[35])
              Img=creativityPics[36];
              else if(Img==creativityPics[36])
              Img=creativityPics[37];
              else if(Img==creativityPics[37])
              Img=creativityPics[38];
              else if(Img==creativityPics[38])
              Img=creativityPics[39];
           else
              Img=creativityPics[0];


	        repaint();
	        pause(80);
		}
	}


	 void pause(int time)
	 {
		 try
		  {
			 Thread.sleep(time);
		  } catch(InterruptedException e){}
     }
	 public void paint (Graphics screen)
	 {
		 if(Img !=null)
		 {

		    screen.drawImage(Img,x,y,this);
		}
	 }
}

