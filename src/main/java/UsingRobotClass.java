import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UsingRobotClass {
public static void main(String[]args) throws AWTException {
    Robot robot = new Robot();
    String file = "";
    StringSelection selection = new StringSelection(file);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();



//clipboard.setContents(selection, selection);
//
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_V);
//robot.keyRelease(KeyEvent.VK_V);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
        }

}
