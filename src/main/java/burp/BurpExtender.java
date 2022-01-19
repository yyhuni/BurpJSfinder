package burp;


import ui.MainUI;

import java.awt.*;

public class BurpExtender implements IBurpExtender,ITab {
    public static IBurpExtenderCallbacks callbacks;

    private final MainUI mainUI = new MainUI();

    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        BurpExtender.callbacks = callbacks;
        callbacks.setExtensionName("JSFinder");
        callbacks.printOutput("load success");
        //Add it to the burp label.
        callbacks.addSuiteTab(this);
    }

    @Override
    public String getTabCaption() {
        return "JSFinder";
    }

    @Override
    public Component getUiComponent() {
        return mainUI.$$$getRootComponent$$$();
    }
}
