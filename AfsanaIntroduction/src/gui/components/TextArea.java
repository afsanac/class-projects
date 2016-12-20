package gui.components;

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.FontMetrics;
	import java.awt.Graphics2D;
	import java.awt.RenderingHints;

	public class TextArea extends TextLabel {

		private String text;
		private String font;
		private int size;
		
		public TextArea(int x, int y, int w, int h, String text) {
			super(x, y, w, h, text);
		}

		public void update(Graphics2D g) {
			g = clear(); //delete previous text
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			//renderinghints makes it look nice
			g.setFont(new Font(font,Font.PLAIN,size));
			FontMetrics fm = g.getFontMetrics();
			g.setColor(Color.black);
			String[] words = getText().split(" ");//splits word at every space
			//w = 80
			//h = 40
			
			if( words.length >0){
				int i = 0;
				final int SPACING = 2;
				int y = 0 + fm.getHeight()+SPACING;
				String line = words[1] + "";
				i++;
				while(i < words.length){//make more lines
					//controls a single line of text
					while (i < words.length && fm.stringWidth(line) + fm.stringWidth(words[i]) < getWidth()){
						line += words[i]+"";
						i++;
					}
					if(y < getHeight()){
						g.drawString(line, 2, y);
						y += fm.getDescent() + fm.getHeight() + SPACING;
						line = "";
					}else{
						break;//print no more text
					}
				}
			}	
		}
	}

