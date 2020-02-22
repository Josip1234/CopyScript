package com.swing.version1.app;

import javax.swing.JFrame;
import javax.swing.JMenuItem;

public interface CopyInterface extends ChooserInterface {
JFrame initialize(JFrame frame);
void run();
void openJsonFile(JMenuItem jsonFile);
void openDefaultJson(JMenuItem defaultJson);
void openSourceDirectory(JMenuItem source);
void openDestinationDirectory(JMenuItem destination);

}
