/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogueliketest.screens;
import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

/**
 *
 * @author c0640785
 */
public class StartScreen implements Screen {

    public void displayOutput(AsciiPanel terminal) {
        terminal.write("rl tutorial", 1, 1);
        terminal.writeCenter("-- press [enter] to start --", 22);
    }

    public Screen respondToUserInput(KeyEvent key) {
        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
    }
}
