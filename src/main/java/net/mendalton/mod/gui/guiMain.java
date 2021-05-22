package net.mendalton.mod.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;


public class guiMain extends LightweightGuiDescription {
    public guiMain(){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300, 200);

        WLabel label = new WLabel("Hooray! This Gui Should Work!!!");
        root.add(label, 0, 0, 4, 1);

        WLabel anotherLabel = new WLabel("Remote Configuration");
        root.add(anotherLabel, 0, 2, 4, 1);
        anotherLabel.setColor(0x190755).setDarkmodeColor(0x5036A6);

    }
}
