package View;

import gui_fields.GUI_Field;
import gui_main.GUI;

public class GuiGame {

    private GUI gui;
    private GUI_Field [] fields;

    public GuiGame (GUI gui){
        this.gui = gui;
        this.fields = gui.getFields();
    }




}
