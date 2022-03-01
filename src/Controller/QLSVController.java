package Controller;

import View.QLSVVIew;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QLSVController implements ActionListener {
    public QLSVVIew qlsvView;

    public QLSVController(QLSVVIew qlsvView) {
        this.qlsvView = qlsvView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Insert" -> {
                this.qlsvView.handleInsert();
            }

            case "Update" -> {
                this.qlsvView.printInfomation();
            }

            case "Delete" -> {
                this.qlsvView.handleDelete();
            }

            case "Save" -> {
                this.qlsvView.handleSave();
            }

            case "Cancel" -> {
                this.qlsvView.ClearForm();
            }

            case "Select" -> {
                this.qlsvView.handleSelect();
            }

            case "Cancel select" -> {
                this.qlsvView.handleRefreshData();
            }

            case "Open File" -> {
                this.qlsvView.hanldeOpenFile();
            }

            case "Save File" -> {
                this.qlsvView.hanldeSaveFile();
            }

            case "Exit" -> {
                this.qlsvView.handleExit();
            }

            case "About me..." -> {
                this.qlsvView.hanldeAbout();
            }
        }
    }
}
