
/**
 * Write a description of class Cloud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cloud
{
    private int cloudx;
    private int cloudy;
    private int count;
    private int size;
    
    public Cloud(int x, int y, int count, int size)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int tempx = x;
        int tempy = y;
        String color; 
        if (((int)(Math.random() * (8)) == 1)) {
            color = "light grey";
        } else {
            color = "white";
        }
        while (i != count){
            new Circle(size, tempx, y, color);
            i = i + 1;
            tempx = tempx + size/2;
        }
        tempx = x + size/2;
        tempy = y + size/2;
        while (j != count - 2){
            new Circle(size, tempx, tempy, color);
            j = j + 1;
            tempx = tempx + size/2;
        }
        tempx = x + size/2;
        tempy = y - size/2;
        while (k != count - 2){
            new Circle(size, tempx, tempy, color);
            k = k + 1;
            tempx = tempx + size/2;
        }

    }
}
