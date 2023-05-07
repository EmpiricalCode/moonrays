package Windows;

import java.awt.*;

import Windows.Panels.RenderPanel;
import Windows.Structures.Window;

public class RenderWindow extends Window {

    private RenderPanel renderPanel;
    
    // Main constructor
    public RenderWindow(int quality) {

        // Setting up the window
        super("Render Window", new FlowLayout(FlowLayout.LEFT, 0, 0), 528, 551);

        setResizable(false);

        // Creating render panel
        this.renderPanel = new RenderPanel(quality);
        add(this.renderPanel);

        // Rendering
        while (true) {
            this.renderPanel.draw(null);
        }
    }
}