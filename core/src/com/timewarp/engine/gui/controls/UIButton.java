package com.timewarp.engine.gui.controls;


import com.timewarp.engine.entities.GameObject;
import com.timewarp.engine.entities.components.ui.ImageRenderer;
import com.timewarp.engine.entities.components.ui.Panel;
import com.timewarp.engine.entities.components.ui.Text;

public class UIButton extends GameObject {

    public ImageRenderer backgroundImage;

    public Text text;
    public Panel panel;

    @Override
    public void init() {
        super.init();

        this.text = this.addComponent(Text.class);
        this.backgroundImage = this.addComponent(ImageRenderer.class);
        this.panel = this.addComponent(Panel.class);
    }
}