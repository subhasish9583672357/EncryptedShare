package com.sbr;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;

public class ServerUI extends JFrame {
    private JPanel gui;
    private FileSystemView fileSystemView;
    private Desktop desktop;
    private JTable table;
    private ListSelectionListener listSelectionListener;

    public ServerUI() {
        this.setTitle("Send Files");
        this.setBounds(30,30,1200,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public Container getGui() {
        if(gui==null) {
            gui=new JPanel(new BorderLayout(3,3));
            gui.setBorder(new EmptyBorder(5,5,5,5));
            fileSystemView= FileSystemView.getFileSystemView();
            desktop=Desktop.getDesktop();
            JPanel detailView=new JPanel(new BorderLayout(3,3));
            table=new JTable();
            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            table.setAutoCreateRowSorter(true);
            table.setShowVerticalLines(false);
            listSelectionListener=new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int r=table.getSelectionModel().getLeadSelectionIndex();
                    //this.setFileDetails(((FileTableModel)table.getModel()).
                }
            };
        }
        return null;
    }
}
