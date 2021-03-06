package org.tomaszkowalczyk94.pomodorotasksmanager.commandline.gui;

import com.googlecode.lanterna.gui2.dialogs.ActionListDialog;
import com.googlecode.lanterna.gui2.dialogs.ActionListDialogBuilder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class TaskActionListBuilder implements GuiElementsBuilder<ActionListDialog>  {

    Runnable onRemove;
    Runnable onStartTask;

    @Override
    public ActionListDialog build() {
        return new ActionListDialogBuilder()
                .setTitle("Actions")
                .addAction("Start", onStartTask)
                .addAction("Remove", onRemove)
                .build();
    }
}
