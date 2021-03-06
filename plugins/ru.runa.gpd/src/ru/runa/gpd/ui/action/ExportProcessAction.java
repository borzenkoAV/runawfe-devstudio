package ru.runa.gpd.ui.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

import ru.runa.gpd.ProcessCache;
import ru.runa.gpd.util.WorkspaceOperations;

public class ExportProcessAction extends BaseActionDelegate {
    @Override
    public void run(IAction action) {
        WorkspaceOperations.exportProcessDefinition(getStructuredSelection());
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        action.setEnabled(ProcessCache.getAllProcessDefinitions().size() > 0 && !isBotStructuredSelection());
    }
}
