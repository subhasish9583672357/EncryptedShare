package com.sbr;

import javax.swing.filechooser.FileSystemView;
import javax.swing.table.AbstractTableModel;
import java.io.File;

public class FileTableModel extends AbstractTableModel {
    private File[] files;
    private FileSystemView fileSystemView=FileSystemView.getFileSystemView();
    private String[] columns= {"Icon","File","Path/name","Size","Last Modified","R","W","E","D","F"};
    
    public FileTableModel() {
        this(new File[0]);
    }
    public FileTableModel(File[] files) {
        this.files=files;
    }
    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        File file=files[row];
        switch(column) {
            case 0:
                return fileSystemView.getSystemIcon(file);
            case 1:
                return fileSystemView.getSystemDisplay
        return null;
    }
}
