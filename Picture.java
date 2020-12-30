
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        Rect a = new Rect(800, 80, 0, 520, "green");
        Rect b = new Rect(800, 520, 0, 0, "cyan");
        Arc c = new Arc(400, 30, 320, 0, 180, "red");
        Arc d = new Arc(380, 40, 330, 0, 180, "yellow");
        Arc e = new Arc(360, 50, 340, 0, 180, "green");
        Arc f = new Arc(340, 60, 350, 0, 180, "blue");
        Arc g = new Arc(320, 70, 360, 0, 180, "magenta");
        Arc h = new Arc(300, 80, 370, 0, 180, "cyan");
        Rect i = new Rect(60, 100, 600, 420, "brown");
        Triangle j = new Triangle(80, 200, 630, 340, "green");
        Triangle k = new Triangle(60, 150, 630, 300, "green");
        Triangle l = new Triangle(40, 100, 630, 270, "green");
        Circle m = new Circle(75, 650, 55, "yellow");
        

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        //try {
        //    pic.saveToFile(new File(filename));
        //    System.out.println("Picture saved to " + filename);
        //} catch (IOException e) {
        //    System.err.println(e);
        //    System.err.println("Could not save file.");
        //}
    }
}