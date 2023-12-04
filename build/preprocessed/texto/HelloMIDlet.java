/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.io.*;
import javax.microedition.io.*;
import javax.microedition.io.file.*;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.pda.FileBrowser;

/**
 * @author victor
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    private String ruta;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command itemCommand;
    private Command backCommand;
    private Command okCommand;
    private Command backCommand1;
    private Command itemCommand1;
    private Form form;
    private StringItem stringItem;
    private ImageItem imageItem;
    private FileBrowser fileBrowser;
    private TextBox textBox;
    private Form form1;
    private StringItem stringItem1;
    private Image image1;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
if (displayable == fileBrowser) {//GEN-BEGIN:|7-commandAction|1|26-preAction
            if (command == FileBrowser.SELECT_FILE_COMMAND) {//GEN-END:|7-commandAction|1|26-preAction
                // write pre-action user code here
switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|2|26-postAction
                // write post-action user code here
}//GEN-BEGIN:|7-commandAction|3|19-preAction
} else if (displayable == form) {
    if (command == exitCommand) {//GEN-END:|7-commandAction|3|19-preAction
        // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|4|19-postAction
        // write post-action user code here
} else if (command == itemCommand) {//GEN-LINE:|7-commandAction|5|23-preAction
        // write pre-action user code here
switchDisplayable(null, getFileBrowser());//GEN-LINE:|7-commandAction|6|23-postAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|7|41-preAction
} else if (displayable == form1) {
    if (command == backCommand1) {//GEN-END:|7-commandAction|7|41-preAction
        stringItem1.setText("");
        switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|8|41-postAction
        // write post-action user code here
} else if (command == itemCommand1) {//GEN-LINE:|7-commandAction|9|44-preAction
        // write pre-action user code here
switchDisplayable(null, getTextBox());//GEN-LINE:|7-commandAction|10|44-postAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|31-preAction
} else if (displayable == textBox) {
    if (command == backCommand) {//GEN-END:|7-commandAction|11|31-preAction
        textBox = null;
        switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|12|31-postAction
        // write post-action user code here
} else if (command == okCommand) {//GEN-LINE:|7-commandAction|13|35-preAction
        ruta = fileBrowser.getSelectedFileURL();
            try {
                FileConnection fc = (FileConnection) Connector.open(ruta);

                if (!fc.exists()) {
                    throw new IOException("El archivo no existe");
                }
                OutputStream fis = fc.openOutputStream();
                byte[] b;
                b=textBox.getString().getBytes();
                fis.write(b);                
                fis.close();
                fc.close();                                                
                Display.getDisplay(this).setCurrent(textBox);
            } catch (IOException e) {
                stringItem.setText(e.getMessage());
            }
//GEN-LINE:|7-commandAction|14|35-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
        }//GEN-END:|7-commandAction|15|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|16|
//</editor-fold>//GEN-END:|7-commandAction|16|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
form = new Form("Welcome", new Item[]{getStringItem(), getImageItem()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getItemCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initialized instance of itemCommand component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {
//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
itemCommand = new Command("Abrir archivo", Command.ITEM, 0);//GEN-LINE:|22-getter|1|22-postInit
            // write post-init user code here
}//GEN-BEGIN:|22-getter|2|
        return itemCommand;
    }
//</editor-fold>//GEN-END:|22-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of backCommand component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {
//GEN-END:|30-getter|0|30-preInit

            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return backCommand;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fileBrowser ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of fileBrowser component.
     *
     * @return the initialized component instance
     */
    public FileBrowser getFileBrowser() {
        if (fileBrowser == null) {
//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
fileBrowser = new FileBrowser(getDisplay());//GEN-BEGIN:|24-getter|1|24-postInit
            fileBrowser.setTitle("fileBrowser");
            fileBrowser.setCommandListener(this);
            fileBrowser.addCommand(FileBrowser.SELECT_FILE_COMMAND);//GEN-END:|24-getter|1|24-postInit
            // write post-init user code here
}//GEN-BEGIN:|24-getter|2|
        return fileBrowser;
    }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of textBox component.
     *
     * @return the initialized component instance
     */
    public TextBox getTextBox() {
        if (textBox == null) {
//GEN-END:|27-getter|0|27-preInit
            


            textBox = new TextBox("textBox", null, 100, TextField.ANY);//GEN-BEGIN:|27-getter|1|27-postInit
            textBox.addCommand(getBackCommand());
            textBox.addCommand(getOkCommand());
            textBox.setCommandListener(this);//GEN-END:|27-getter|1|27-postInit
            textBox.setString(stringItem1.getText());
        }//GEN-BEGIN:|27-getter|2|
        return textBox;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|33-getter|0|33-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {
//GEN-END:|33-getter|0|33-preInit
 // write pre-init user code here
stringItem = new StringItem("", null);//GEN-LINE:|33-getter|1|33-postInit
 // write post-init user code here
}//GEN-BEGIN:|33-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|33-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|34-getter|0|34-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {
//GEN-END:|34-getter|0|34-preInit
 // write pre-init user code here
okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|34-getter|1|34-postInit
 // write post-init user code here
}//GEN-BEGIN:|34-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|34-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: imageItem ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initialized instance of imageItem component.
     *
     * @return the initialized component instance
     */
    public ImageItem getImageItem() {
        if (imageItem == null) {
//GEN-END:|36-getter|0|36-preInit
 // write pre-init user code here
imageItem = new ImageItem("", getImage1(), ImageItem.LAYOUT_DEFAULT, "<Missing Image>");//GEN-LINE:|36-getter|1|36-postInit
 // write post-init user code here
}//GEN-BEGIN:|36-getter|2|
        return imageItem;
    }
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initialized instance of image1 component.
     *
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {
//GEN-END:|37-getter|0|37-preInit
 // write pre-init user code here
try {//GEN-BEGIN:|37-getter|1|37-@java.io.IOException
                image1 = Image.createImage("/images.jpg");
            } catch (java.io.IOException e) {//GEN-END:|37-getter|1|37-@java.io.IOException
            }//GEN-LINE:|37-getter|2|37-postInit
 // write post-init user code here
}//GEN-BEGIN:|37-getter|3|
        return image1;
    }
//</editor-fold>//GEN-END:|37-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|40-getter|0|40-preInit
    /**
     * Returns an initialized instance of backCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {
//GEN-END:|40-getter|0|40-preInit
 // write pre-init user code here
backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|40-getter|1|40-postInit
 // write post-init user code here
}//GEN-BEGIN:|40-getter|2|
        return backCommand1;
    }
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initialized instance of itemCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {
//GEN-END:|43-getter|0|43-preInit
 // write pre-init user code here
itemCommand1 = new Command("Editar", Command.ITEM, 0);//GEN-LINE:|43-getter|1|43-postInit
 // write post-init user code here
}//GEN-BEGIN:|43-getter|2|
        return itemCommand1;
    }
//</editor-fold>//GEN-END:|43-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initialized instance of form1 component.
     *
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {
//GEN-END:|38-getter|0|38-preInit
 // write pre-init user code here
form1 = new Form("form1", new Item[]{getStringItem1()});//GEN-BEGIN:|38-getter|1|38-postInit
            form1.addCommand(getBackCommand1());
            form1.addCommand(getItemCommand1());
            form1.setCommandListener(this);//GEN-END:|38-getter|1|38-postInit
 ruta = fileBrowser.getSelectedFileURL();
            try {
                FileConnection fc = (FileConnection) Connector.open(ruta);

                if (!fc.exists()) {
                    throw new IOException("El archivo no existe");
                }
                InputStream fis = fc.openInputStream();
                byte[] b = new byte[1024];
                int length = fis.read(b, 0, 1024);
                
               
                fis.close();
                fc.close();
                if (length > 0) {
                    stringItem1.setText(new String(b, 0, length));
                }
                Display.getDisplay(this).setCurrent(form1);
            } catch (IOException e) {
                stringItem.setText(e.getMessage());
            }
        }//GEN-BEGIN:|38-getter|2|
        return form1;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem1 ">//GEN-BEGIN:|39-getter|0|39-preInit
    /**
     * Returns an initialized instance of stringItem1 component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem1() {
        if (stringItem1 == null) {
//GEN-END:|39-getter|0|39-preInit
 // write pre-init user code here
stringItem1 = new StringItem("", null);//GEN-LINE:|39-getter|1|39-postInit
 // write post-init user code here
}//GEN-BEGIN:|39-getter|2|
        return stringItem1;
    }
//</editor-fold>//GEN-END:|39-getter|2|

    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
