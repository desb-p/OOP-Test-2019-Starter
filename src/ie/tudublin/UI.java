package ie.tudublin;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	
	
	ArrayList<Colour> colours = new ArrayList<Colour>();
	ArrayList<Resistor>resistors = new ArrayList<Resistor>();

	Resistor r;
	Colour c;


	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	
	public void setup() 
	{
		loadColours();
		printColours();

	}
	
	public void draw()
	{		
		//Colour c.render();
		//Resistor r.render();

		background(170);

		




	}

	//Method that populates the ArrayList from rows in colours.csv file
	public void loadColours()
	{

		Table table = loadTable("colours.csv","header");
		for(TableRow row:table.rows())
		{
			Colour c = new Colour(row);
			colours.add(c);
		}
	}
	//Method
	public void printColours()
	{
		for(Colour c: colours)
		{
			System.out.println(colours);
		}
	}

	//Method
	public Colour FindColour(int val)
	{
		for(Colour c:colours)
		{
			if(val == c.v)
			{
				return c;
			}
		}
		return null;
	}
	
	// method that populates the arrayList from resistors.cv 
	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");
		for(TableRow row: table.rows())
		{
			int j = 0;
			int v = row.getInt(j);

			Resistor r = new Resistor(v);
			resistors.add(r);
			
			j++;
		}
	}


	


			

}



