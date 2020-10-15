/**
 * Alexander Pham
 * October 16, 2019
 * A class that creates a rectangle, compares rectangles, gets the height and width, scales, gets area, and gets string representation
 */

public class Rect {
    /**
     * Represents height
     */
    private int height;
    /**
     * Represents width
     */
    private int width;

    /**
     * Constructor
     * Without parameters
     */
    public Rect(){
        height = 0;
        width = 0;
    }

    /**
     * Overloaded constructor for rectangle
     * @param x = height and width
     */
    public Rect( int x ){
        if ( x > 0 ) {
            height = x;
            width = x;
        }
    }

    /**
     * Overloaded constructor for rectangle
     * @param x = width
     * @param y = height
     */
    public Rect( int x , int y ){
        if ( x > 0 ){
            width = x;
        }
        else{
            width = 0;
        }
        if ( y > 0 ){
            height = y;
        }
        else{
            height = 0;
        }
    }

    /**
     * Overloaded constructor for rectangle
     * @param Rectangle an already made rectangle
     */
    public Rect ( Rect Rectangle ){
        width = Rectangle.getWidth();
        height = Rectangle.getHeight();
    }

    /**
     * Get width
     * @return width
     */
    public int getWidth(){
        return width;
    }

    /**
     * Get height
     * @return height
     */
    public int getHeight(){
        return height;
    }

    /**
     * Checks if two rectangles are equal
     * @param o
     * @return true if equals
     */
    @Override
    public boolean equals( Object o ){
        if ( o instanceof Rect ){
            Rect Rect2 = (Rect) o;
            return ( ((this.getWidth() == Rect2.getWidth()) && (this.getHeight() == Rect2.getHeight())) );
        }
        return false;
    }

    /**
     * Compare two rectangles
     * @param Rectangle
     * @return the difference of two rectangles
     */
    public int compareTo( Rect Rectangle ){
        int x = Rectangle.getWidth();
        int y = Rectangle.getHeight();
        int heightDifference = this.getHeight() - y;
        int widthDifference = this.getWidth() - x;
        if ( heightDifference == 0){
            if (widthDifference == 0){
                return 0;
            }
            return widthDifference;
        }
        return heightDifference;
    }

    /**
     * Changes height and width using a scale for both
     * @param scale
     */
    public void scale ( double scale ){
        width = this.getWidth();
        height = this.getHeight();
        if ( scale > 0 ){
            width *= scale;
            height *= scale;
        }
    }

    /**
     * Changes height and width using a scale for height and width
     * @param scaleWidth
     * @param scaleHeight
     */
    public void scale ( int scaleWidth , int scaleHeight ){
        height = this.getHeight();
        width = this.getWidth();
        if ( scaleWidth > 1 ){
            width *= scaleWidth;
        }
        if ( scaleHeight > 1 ){
            height *= scaleHeight;
        }
    }

    /**
     * Changes height and width using another rectangle for the scale
     * @param scale
     */
    public void scale ( Rect scale ){
        width = this.getWidth();
        height = this.getHeight();
        int scaleHeight = scale.getHeight();
        int scaleWidth = scale.getWidth();
        if ( scaleWidth > 1 ){
            width = width + scaleWidth;
        }
        if ( scaleHeight > 1 ){
            height = height + scaleHeight;
        }
    }

    /**
     * Calculate area
     * @return area
     */
    public int area(){
        int rectangleWidth = this.getWidth();
        int rectangleHeight = this.getHeight();
        int rectangleArea = rectangleHeight * rectangleWidth;
        return rectangleArea;
    }

    /**
     * String representation of rectangle
     * @return string
     */
    @Override
    public String toString() {
        String str = "";
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                str += "*";
                if (w < width) {
                    str += " ";
                }
            }
            str += "\n";
        }
        return str;
    }
}
