package org.tomaszkowalczyk94.pomodorotasksmanager.commandline.gui;

import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
class MainElementsRegistry {
    Terminal terminal;
    Screen screen;
    WindowBasedTextGUI textGui;
    Window window;
    Panel mainPanel;
}
