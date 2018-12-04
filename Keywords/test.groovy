import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;

import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil


public class test {
	protected static Screen _screen = new Screen();

	static long timeout = 30;

	@Keyword
	public static void dragDrop(String source, String destination) {
		try {
			_screen.dragDrop(source, destination);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}

	public static void dragDrop(String source, String destination, int x, int y) {
		Pattern pattern = new Pattern(destination);
		try {
			_screen.dragDrop(source, pattern.targetOffset(x, y));
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}

	public static void dragDrop(String source, int x, int y, String destination) {
		Pattern pattern = new Pattern(source);
		try {
			_screen.dragDrop(pattern.targetOffset(x, y), destination);
		} catch (FindFailed e) {
			e.printStackTrace();
		}
	}
}
