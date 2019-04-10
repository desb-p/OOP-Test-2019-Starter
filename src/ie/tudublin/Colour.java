package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    //RGB colours
    public int r;
    public int g;
    public int b;

    private String colour;

    public float range;

    public Colour(TableRow row)
    {
        
        this.r = row.getInt("r");
        this.b = row.getInt("b");
        this.g = row.getInt("g");
        this.colour = row.getString("colour");

        this.range = row.getFloat("v");
    }

    public String toString()
    {
        return colour + "\t" + r + "\t" + g+ "\t" + b+ "\t" + range;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return colour;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) 
    {
        this.colour = color;
    }


}
