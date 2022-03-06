package View;

import Controller.QLSVController;
import Model.QLSVModel;
import Model.ThiSinh;
import Model.TinhThanh;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class QLSVVIew extends JFrame implements Serializable{
    public ButtonGroup ButtonGroup_Male_Femal;
    public JButton Button_Cancel;
    public JButton Button_CancelSelect;
    public JButton Button_Delete;
    public JButton Button_Update;
    public JButton Button_Insert;
    public JButton Button_Save;
    public JButton Button_Select;
    public JComboBox<String> ComboBox_BirthPlace;
    public JComboBox<String> ComboBox_InputBirthPlace;
    public JLabel Label_BirthPlace;
    public JLabel Label_SexofHuman;
    public JLabel Label_InputBirthPlace;
    public JLabel Label_InputDate;
    public JLabel Label_InputID;
    public JLabel Label_InputName;
    public JLabel Label_InputScore1;
    public JLabel Label_InputScore2;
    public JLabel Label_InputScore3;
    public JLabel Label_OutputTotal;
    public JLabel Label_StudentID;
    public JPanel Panel_ButtonHandle;
    public JPanel Panel_ListStudent;
    public JPanel Panel_StudentFIllre;
    public JPanel Panel_StudentInfomation;
    public JMenuBar QLSV_Menubar;
    public JRadioButton RadioButton_InputSexFemale;
    public JRadioButton RadioButton_InputSexMale;
    public JScrollPane ScrollPane_ListStudentTable;
    public JTable Table_ListStudent;
    public JTextField TextField_InputDate;
    public JTextField TextField_InputID;
    public JTextField TextField_InputName;
    public JTextField TextField_InputScore1;
    public JTextField TextField_InputScore2;
    public JTextField TextField_InputScore3;
    public JTextField TextField_OutputTotal;
    public JTextField TextField_StudentID;
    public JMenuItem jMenuItemAboutMe;
    public JMenuItem jMenuItemExit;
    public JMenu menuEdit;
    public JMenuItem menuFIle_OpenFile;
    public JMenu menuFile;
    public JMenuItem menuFile_SaveFile;
    public JPopupMenu.Separator menuFile_Separator;

    public QLSVModel model;

    public QLSVVIew() {
        this.model = new QLSVModel();
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        ButtonGroup_Male_Femal = new ButtonGroup();
        Panel_ListStudent = new JPanel();
        ScrollPane_ListStudentTable = new JScrollPane();
        Table_ListStudent = new JTable();
        Panel_StudentFIllre = new JPanel();
        Label_BirthPlace = new JLabel();
        Label_StudentID = new JLabel();
        TextField_StudentID = new JTextField();
        Button_Select = new JButton();
        ComboBox_BirthPlace = new JComboBox<>();
        Panel_StudentInfomation = new JPanel();
        Label_InputID = new JLabel();
        Label_SexofHuman = new JLabel();
        Label_InputDate = new JLabel();
        Label_InputScore2 = new JLabel();
        Label_InputBirthPlace = new JLabel();
        TextField_InputDate = new JTextField();
        TextField_OutputTotal = new JTextField();
        TextField_InputName = new JTextField();
        ComboBox_InputBirthPlace = new JComboBox<>();
        Label_InputName = new JLabel();
        TextField_InputID = new JTextField();
        Label_OutputTotal = new JLabel();
        Label_InputScore1 = new JLabel();
        TextField_InputScore1 = new JTextField();
        TextField_InputScore2 = new JTextField();
        Label_InputScore3 = new JLabel();
        TextField_InputScore3 = new JTextField();
        RadioButton_InputSexMale = new JRadioButton();
        RadioButton_InputSexFemale = new JRadioButton();
        Panel_ButtonHandle = new JPanel();
        Button_Insert = new JButton();
        Button_Delete = new JButton();
        Button_Update = new JButton();
        Button_Save = new JButton();
        Button_Cancel = new JButton();
        Button_CancelSelect = new JButton();
        QLSV_Menubar = new JMenuBar();
        menuFile = new JMenu();
        menuFIle_OpenFile = new JMenuItem();
        menuFile_SaveFile = new JMenuItem();
        menuFile_Separator = new JPopupMenu.Separator();
        jMenuItemExit = new JMenuItem();
        menuEdit = new JMenu();
        jMenuItemAboutMe = new JMenuItem();

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Phần mềm quản lý Sinh Viên - Student management software");
        this.setFont(new Font("Segoe UI", 0, 14));
        ActionListener ActionEvent = new QLSVController(this);

        //===============================================================================================================//
        // Panel Student Filltre
        Panel_StudentFIllre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Filltre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        Panel_StudentFIllre.setPreferredSize(new java.awt.Dimension(784, 95));

        Label_StudentID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_StudentID.setText("StudentID:");

        Label_BirthPlace.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_BirthPlace.setText("BirthPlace:");
        ComboBox_BirthPlace.addItem("");
        ArrayList<TinhThanh> listTinhThanh = TinhThanh.getDSTinhThanh();
        for(TinhThanh item : listTinhThanh) {
            ComboBox_BirthPlace.setFont(new Font("Segoe UI", 0, 16));
            ComboBox_BirthPlace.addItem(item.getTenTinhThanh());
        }
        ComboBox_BirthPlace.addActionListener(ActionEvent);
        TextField_StudentID.addActionListener(ActionEvent);

        Button_Select.setText("Select");
        Button_Select.addActionListener(ActionEvent);

        Button_CancelSelect.setText("Cancel select");
        Button_CancelSelect.addActionListener(ActionEvent);

        //===============================================================================================================//
        // Panel List Student
        Panel_ListStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Student",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        Table_ListStudent.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                        "StudentID", "Fullname", "BirthPlace", "Birthday", "Sex", "Score 1", "Score 2", "Score 3", "Total"
                }
        ));

        Table_ListStudent.setToolTipText("");
        Table_ListStudent.setFont(new Font("Segoe UI", 0, 14));
        Table_ListStudent.setRowHeight(25);
        ScrollPane_ListStudentTable.setViewportView(Table_ListStudent);

        javax.swing.GroupLayout Panel_ListStudentLayout = new javax.swing.GroupLayout(Panel_ListStudent);
        Panel_ListStudent.setLayout(Panel_ListStudentLayout);
        Panel_ListStudentLayout.setHorizontalGroup(
                Panel_ListStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ScrollPane_ListStudentTable)
        );
        Panel_ListStudentLayout.setVerticalGroup(
                Panel_ListStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ScrollPane_ListStudentTable, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_StudentFIllreLayout = new javax.swing.GroupLayout(Panel_StudentFIllre);
        Panel_StudentFIllre.setLayout(Panel_StudentFIllreLayout);
        Panel_StudentFIllreLayout.setHorizontalGroup(
                Panel_StudentFIllreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_StudentFIllreLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Label_BirthPlace)
                                .addGap(15, 15, 15)
                                .addComponent(ComboBox_BirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Label_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextField_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(Button_CancelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );
        Panel_StudentFIllreLayout.setVerticalGroup(
                Panel_StudentFIllreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_StudentFIllreLayout.createSequentialGroup()
                                .addGroup(Panel_StudentFIllreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Panel_StudentFIllreLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(Label_BirthPlace))
                                        .addGroup(Panel_StudentFIllreLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(ComboBox_BirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_StudentFIllreLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(Panel_StudentFIllreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(TextField_StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Button_Select, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Button_CancelSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Label_StudentID))))
                                .addGap(26, 26, 26))
        );

        //===============================================================================================================//
        // Panel Student Information
        Panel_StudentInfomation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        Panel_StudentInfomation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Label_InputID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputID.setText("ID:");

        Label_SexofHuman.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_SexofHuman.setText("Sex:");

        Label_InputDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputDate.setText("Date:");


        Label_InputBirthPlace.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputBirthPlace.setText("BirthPlace:");
        ComboBox_InputBirthPlace.addItem("");
        for(TinhThanh item : listTinhThanh) {
            ComboBox_InputBirthPlace.setFont(new Font("Segoe UI", 0, 16));
            ComboBox_InputBirthPlace.addItem(item.getTenTinhThanh());
        }

        TextField_InputID.setFont(new Font("Segoe UI", 0, 16));
        TextField_InputName.setFont(new Font("Segoe UI", 0, 16));
        TextField_InputDate.setFont(new Font("Segoe UI", 0, 16));
        TextField_InputScore1.setFont(new Font("Segoe UI", 0, 16));
        TextField_InputScore2.setFont(new Font("Segoe UI", 0, 16));
        TextField_InputScore3.setFont(new Font("Segoe UI", 0, 16));

        Label_InputName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputName.setText("Name:");

        Label_OutputTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_OutputTotal.setText("Total:");

        Label_InputScore1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputScore1.setText("Score 1:");

        TextField_OutputTotal.setEditable(false);
        TextField_OutputTotal.setBackground(Color.WHITE);

        Label_InputScore2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputScore2.setText("Score 2:");

        Label_InputScore3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Label_InputScore3.setText("Score 3:");

        ButtonGroup_Male_Femal.add(RadioButton_InputSexMale);
        RadioButton_InputSexMale.setText("Male");
        RadioButton_InputSexMale.setFont(new Font("Segoe UI", 0, 16));
        RadioButton_InputSexMale.setActionCommand("Male");
        RadioButton_InputSexMale.setSelected(true);


        ButtonGroup_Male_Femal.add(RadioButton_InputSexFemale);
        RadioButton_InputSexFemale.setText("Female");
        RadioButton_InputSexFemale.setFont(new Font("Segoe UI", 0, 16));
        RadioButton_InputSexFemale.setActionCommand("Female");


        javax.swing.GroupLayout Panel_StudentInfomationLayout = new javax.swing.GroupLayout(Panel_StudentInfomation);
        Panel_StudentInfomation.setLayout(Panel_StudentInfomationLayout);
        Panel_StudentInfomationLayout.setHorizontalGroup(
                Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                .addComponent(Label_InputID)
                                                .addGap(378, 378, 378)
                                                .addComponent(Label_InputScore1)
                                                .addGap(37, 37, 37)
                                                .addComponent(TextField_InputScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                .addComponent(Label_InputDate)
                                                .addGap(69, 69, 69)
                                                .addComponent(TextField_InputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, 70)
                                                .addComponent(Label_OutputTotal)
                                                .addGap(57, 57, 57)
                                                .addComponent(TextField_OutputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                .addComponent(Label_SexofHuman)
                                                .addGap(119, 119, 119)
                                                .addComponent(RadioButton_InputSexMale)
                                                .addGap(21, 21, 21)
                                                .addComponent(RadioButton_InputSexFemale))
                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Label_InputName)
                                                                        .addComponent(Label_InputBirthPlace))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                                                .addComponent(TextField_InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(70, 70, 70)
                                                                                .addComponent(Label_InputScore2))
                                                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                                                .addComponent(ComboBox_InputBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(73, 73, 73)
                                                                                .addComponent(Label_InputScore3))))
                                                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                                                .addComponent(TextField_InputID, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(137, 137, 137)))
                                                .addGap(34, 34, 34)
                                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextField_InputScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextField_InputScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2))
        );
        Panel_StudentInfomationLayout.setVerticalGroup(
                Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel_StudentInfomationLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_InputID)
                                        .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Label_InputScore1)
                                                .addComponent(TextField_InputID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(TextField_InputScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_InputName)
                                        .addComponent(TextField_InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_InputScore2)
                                        .addComponent(TextField_InputScore2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Label_InputBirthPlace)
                                                .addComponent(ComboBox_InputBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Label_InputScore3)
                                                .addComponent(TextField_InputScore3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_InputDate)
                                        .addComponent(TextField_InputDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_OutputTotal)
                                        .addComponent(TextField_OutputTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(Panel_StudentInfomationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_SexofHuman)
                                        .addComponent(RadioButton_InputSexMale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RadioButton_InputSexFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        // Group Button Handle
        Panel_ButtonHandle.setLayout(new java.awt.GridLayout(1, 5, 40, 0));

        Button_Insert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Button_Insert.setText("Insert");

        Panel_ButtonHandle.add(Button_Insert);

        Button_Delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Button_Delete.setText("Delete");
        Panel_ButtonHandle.add(Button_Delete);

        Button_Update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Button_Update.setText("Update");
        Panel_ButtonHandle.add(Button_Update);

        Button_Save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Button_Save.setText("Save");
        Panel_ButtonHandle.add(Button_Save);

        Button_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Button_Cancel.setText("Cancel");
        Panel_ButtonHandle.add(Button_Cancel);

        Button_Insert.addActionListener(ActionEvent);
        Button_Update.addActionListener(ActionEvent);
        Button_Delete.addActionListener(ActionEvent);
        Button_Save.addActionListener(ActionEvent);
        Button_Cancel.addActionListener(ActionEvent);

        // Menu
        menuFile.setText("File");
        menuFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menuFIle_OpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuFIle_OpenFile.setIcon(new javax.swing.ImageIcon("icon\\Folder-icon.png")); // NOI18N
        menuFIle_OpenFile.setText("Open File");
        menuFIle_OpenFile.addActionListener(ActionEvent);
        menuFile.add(menuFIle_OpenFile);

        menuFile_SaveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuFile_SaveFile.setIcon(new javax.swing.ImageIcon("icon\\open-file-icon.png")); // NOI18N
        menuFile_SaveFile.setText("Save File");
        menuFile_SaveFile.addActionListener(ActionEvent);
        menuFile.add(menuFile_SaveFile);
        menuFile.add(menuFile_Separator);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemExit.setIcon(new javax.swing.ImageIcon("icon\\close-icon.png")); // NOI18N
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(ActionEvent);
        menuFile.add(jMenuItemExit);

        QLSV_Menubar.add(menuFile);

        menuEdit.setText("Edit");
        menuEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItemAboutMe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemAboutMe.setIcon(new javax.swing.ImageIcon("icon\\brown-man-icon.png")); // NOI18N
        jMenuItemAboutMe.setText("About me...");
        jMenuItemAboutMe.addActionListener(ActionEvent);

        menuEdit.add(jMenuItemAboutMe);

        QLSV_Menubar.add(menuEdit);

        setJMenuBar(QLSV_Menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Panel_StudentInfomation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Panel_StudentFIllre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Panel_ListStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(Panel_ButtonHandle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Panel_StudentFIllre, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel_ListStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel_StudentInfomation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Panel_ButtonHandle, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    public void ClearForm() {
        this.TextField_InputID.setText("");
        this.TextField_InputName.setText("");
        this.TextField_InputDate.setText("");
        this.TextField_InputScore1.setText("");
        this.TextField_InputScore2.setText("");
        this.TextField_InputScore3.setText("");
        this.ComboBox_InputBirthPlace.setSelectedIndex(-1);
        this.RadioButton_InputSexMale.setSelected(true);
    }

    public ThiSinh getThiSinhSelected(int indexRow, DefaultTableModel model_table) {
        int maThiSinh = Integer.parseInt((String) model_table.getValueAt(indexRow, 0));
        String tenThiSinh = String.valueOf(model_table.getValueAt(indexRow, 1));
        TinhThanh tinhThanh = TinhThanh.getTinhThanhByName(String.valueOf(model_table.getValueAt(indexRow, 2)));
        String ngaySinhString = String.valueOf(model_table.getValueAt(indexRow, 3));
        Date ngaySinh = new Date(ngaySinhString);
        boolean gioiTinh = String.valueOf(model_table.getValueAt(indexRow, 4)).equals("Male");
        double diemMon1 = Double.parseDouble(String.valueOf(model_table.getValueAt(indexRow, 5)));
        double diemMon2 = Double.parseDouble(String.valueOf(model_table.getValueAt(indexRow, 6)));
        double diemMon3 = Double.parseDouble(String.valueOf(model_table.getValueAt(indexRow, 7)));

        return new ThiSinh(maThiSinh, tenThiSinh, tinhThanh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
    }

    public void addStudentIntoTable(ThiSinh thiSinh, DefaultTableModel model_table) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        model_table.addRow(new Object[]{
                String.valueOf(thiSinh.getMaThiSinh()),
                thiSinh.getTenThiSinh(),
                thiSinh.getQueQuan().getTenTinhThanh(),
                dateFormat.format(thiSinh.getNgaySinh()),
                thiSinh.getGioiTinh() ? "Male" : "Female",
                thiSinh.getDiemMon1(),
                thiSinh.getDiemMon2(),
                thiSinh.getDiemMon3(),
                thiSinh.getTotalScore()
        });
    }

    public void printInfomation() {
        try {
            DefaultTableModel model_table = (DefaultTableModel) Table_ListStudent.getModel();
            int indexRow = Table_ListStudent.getSelectedRow();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            ThiSinh ts = getThiSinhSelected(indexRow, model_table);

            this.TextField_InputID.setText(String.valueOf(ts.getMaThiSinh()));
            this.TextField_InputName.setText(String.valueOf(ts.getTenThiSinh()));
            this.TextField_InputDate.setText(dateFormat.format(ts.getNgaySinh()));
            this.TextField_InputScore1.setText(String.valueOf(ts.getDiemMon1()));
            this.TextField_InputScore2.setText(String.valueOf(ts.getDiemMon2()));
            this.TextField_InputScore3.setText(String.valueOf(ts.getDiemMon3()));
            this.ComboBox_InputBirthPlace.setSelectedItem(ts.getQueQuan().getTenTinhThanh());

            if(ts.getGioiTinh()) {
                this.RadioButton_InputSexMale.setSelected(true);
            } else {
                this.RadioButton_InputSexFemale.setSelected(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void handleInsert() {
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            DefaultTableModel model_table = (DefaultTableModel) Table_ListStudent.getModel();

            int maThiSinh = Integer.parseInt(this.TextField_InputID.getText());
            String tenThiSinh = this.TextField_InputName.getText();
            int maQueQuan = this.ComboBox_InputBirthPlace.getSelectedIndex();
            Date ngaySinh = new Date(this.TextField_InputDate.getText());
            Boolean gioiTinh = String.valueOf(this.ButtonGroup_Male_Femal.getSelection().getActionCommand()).equals("Male");
            double diemMon1 = Double.parseDouble(this.TextField_InputScore1.getText());
            double diemMon2 = Double.parseDouble(this.TextField_InputScore2.getText());
            double diemMon3 = Double.parseDouble(this.TextField_InputScore3.getText());
            TinhThanh tinhThanh = TinhThanh.getTinhThanhById(maQueQuan - 1);

            ThiSinh thiSinh = new ThiSinh(maThiSinh, tenThiSinh, tinhThanh, ngaySinh,
                    gioiTinh, diemMon1, diemMon2, diemMon3);

            model_table.addRow(new Object[]{
                    String.valueOf(thiSinh.getMaThiSinh()),
                    thiSinh.getTenThiSinh(),
                    thiSinh.getQueQuan().getTenTinhThanh(),
                    dateFormat.format(thiSinh.getNgaySinh()),
                    thiSinh.getGioiTinh() ? "Male" : "Female",
                    thiSinh.getDiemMon1(),
                    thiSinh.getDiemMon2(),
                    thiSinh.getDiemMon3(),
                    thiSinh.getTotalScore()
            });

            this.model.insert(thiSinh);
            this.ClearForm();
            this.model.printDSSV(); // testing

            JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công !",
                    "Save Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void handleDelete() {
        try {
            DefaultTableModel model_table = (DefaultTableModel) Table_ListStudent.getModel();
            int i_row = Table_ListStudent.getSelectedRow();
            ThiSinh thiSinh = getThiSinhSelected(i_row, model_table);

            int Option = JOptionPane.showConfirmDialog(this, "Bạn có thực sự muốn xoá thí sinh này ?",
                    "Confirm Delele Value", JOptionPane.YES_NO_CANCEL_OPTION);

            if(Option == JOptionPane.YES_OPTION) {
                this.model.delete(thiSinh);
                System.out.println(thiSinh.toString());
                this.model.printDSSV(); // testing
                model_table.removeRow(i_row);
                JOptionPane.showMessageDialog(this, "Xoá liệu thành công !",
                        "Delete Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một trường để xoá!",
                    "Delete Fail", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void handleSave() {
        try {
            int maThiSinh = Integer.parseInt(this.TextField_InputID.getText());
            String tenThiSinh = this.TextField_InputName.getText();
            int maQueQuan = this.ComboBox_InputBirthPlace.getSelectedIndex();
            Date ngaySinh = new Date(this.TextField_InputDate.getText());
            Boolean gioiTinh = String.valueOf(this.ButtonGroup_Male_Femal.getSelection().getActionCommand()).equals("Male");
            double diemMon1 = Double.parseDouble(this.TextField_InputScore1.getText());
            double diemMon2 = Double.parseDouble(this.TextField_InputScore2.getText());
            double diemMon3 = Double.parseDouble(this.TextField_InputScore3.getText());
            TinhThanh tinhThanh = TinhThanh.getTinhThanhById(maQueQuan - 1);

            ThiSinh thiSinh = new ThiSinh(maThiSinh, tenThiSinh, tinhThanh, ngaySinh,
                    gioiTinh, diemMon1, diemMon2, diemMon3);

            // Khi ấn nút save có 2 trường hợp xảy ra
            // Nếu dữ liệu chưa có => Tạo mới dữ liệu
            // Nếu dữ liệu đã có => Cập nhật dữ liệu
            this.checkingUpdateTable(thiSinh); // xử lí sự kiện udpate

            JOptionPane.showMessageDialog(this, "Lưu dữ liệu thành công !",
                    "Save Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void checkingUpdateTable(ThiSinh thiSinh) {
        try {
            // nếu đối tượng không tồn tại thì thực hiện cập nhật thí sinh đó
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            DefaultTableModel model_table = (DefaultTableModel) Table_ListStudent.getModel();

            if(!this.model.checkExist(thiSinh)) {
                this.model.insert(thiSinh);
                this.addStudentIntoTable(thiSinh, model_table);
                this.model.printDSSV(); // testing
            } else {
                int row = model_table.getRowCount();
                for(int i=0;i<row;i++) {
                    String id = String.valueOf(model_table.getValueAt(i, 0));
                    // Nếu id của dòng đó mà trùng với id của thí sinh thì cập nhật thí sinh tại dòng đó
                    // cập nhật lại thông tin trên màn hình và trong arrayList
                    if(id.equals(String.valueOf(thiSinh.getMaThiSinh()))) {
                        this.model.update(i, thiSinh);
                        model_table.setValueAt(String.valueOf(thiSinh.getMaThiSinh()), i , 0);
                        model_table.setValueAt(thiSinh.getTenThiSinh(), i , 1);
                        model_table.setValueAt(thiSinh.getQueQuan().getTenTinhThanh(), i , 2);
                        model_table.setValueAt(dateFormat.format(thiSinh.getNgaySinh()), i , 3);
                        model_table.setValueAt(thiSinh.getGioiTinh() ? "Male" : "Female", i , 4);
                        model_table.setValueAt(thiSinh.getDiemMon1(), i , 5);
                        model_table.setValueAt(thiSinh.getDiemMon2(), i , 6);
                        model_table.setValueAt(thiSinh.getDiemMon3(), i , 7);
                        model_table.setValueAt(thiSinh.getTotalScore(), i , 8);
                    }
                }

                this.model.printDSSV(); // testing
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void handleSelect() {
        try {
            // gọi hàm huỷ tìm kiếm trước để refresh lại table
            this.handleRefreshData();

            DefaultTableModel model_table = (DefaultTableModel) Table_ListStudent.getModel();
            int row = model_table.getRowCount();

            int QueQuan = this.ComboBox_BirthPlace.getSelectedIndex();
            String maThiSinh = this.TextField_StudentID.getText();

            Set<Integer> idCuaThiSinhCanXoa = new TreeSet<Integer>();

            // handle ô quê quán
            if(QueQuan > 0) {
                TinhThanh tinhThanhDaChon = TinhThanh.getTinhThanhById(QueQuan - 1);
                for(int i=0;i<row;i++) {
                    String tenTinhThanh = String.valueOf(model_table.getValueAt(i, 2));
                    String id = String.valueOf(model_table.getValueAt(i, 0));
                    if(!tenTinhThanh.equals(tinhThanhDaChon.getTenTinhThanh())) {
                        idCuaThiSinhCanXoa.add(Integer.valueOf(id));
                    }
                }
            }

            // handle ô ID Student
            if(maThiSinh.length() > 0) {
                for(int i=0;i<row;i++) {
                    String maThiSinhinTable = String.valueOf(model_table.getValueAt(i, 0));
                    String id = String.valueOf(model_table.getValueAt(i, 0));
                    if(!maThiSinhinTable.equals(maThiSinh)) {
                        idCuaThiSinhCanXoa.add(Integer.valueOf(id));
                    }
                }
            }

            // Handle List xoá
            for(Integer idCanXoa : idCuaThiSinhCanXoa) {
                row = model_table.getRowCount();
                for(int i=0;i<row;i++) {
                    String idTrongTable = String.valueOf(model_table.getValueAt(i, 0));
                    if(idTrongTable.equals(String.valueOf(idCanXoa))) {
                        try {
                            model_table.removeRow(i);
                        } catch (Exception ex) {
                            ex.printStackTrace();;
                        }
                        break;
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    public void handleRefreshData() {
        try {
            DefaultTableModel model_table = (DefaultTableModel) Table_ListStudent.getModel();

            // remove row table existed
            while(true) {
                DefaultTableModel model_table1 = (DefaultTableModel) Table_ListStudent.getModel();
                int row1 = model_table.getRowCount();
                if(row1 == 0) break;
                else {
                    try {
                        model_table1.removeRow(0);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

            // refresh table again
            for(ThiSinh thiSinh : this.model.getDSThiSinh()) {
                this.addStudentIntoTable(thiSinh, model_table);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void SaveFile(String path)  {
        try {
            this.model.setFileName(path);
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(ThiSinh ts : this.model.getDSThiSinh()) {
                oos.writeObject(ts);
            }
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    public void OpenFile(String file)  {
        ArrayList<ThiSinh> dsThiSinh = new ArrayList<ThiSinh>();
        ThiSinh temp = null;

        try {
            this.model.setFileName(file);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                while((temp = (ThiSinh) ois.readObject()) != null) {
                    dsThiSinh.add(temp);
                }
            }catch (Exception ex) {
                ex.printStackTrace();
            }
            this.handleRefreshData();
            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        this.model.setDSThiSinh(dsThiSinh);
    }

    public void hanldeOpenFile() {
        try {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                try {
                    OpenFile(file.getAbsolutePath());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                this.handleRefreshData();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void hanldeSaveFile() {
        if(this.model.getFileName().length()>0) {
            // Nếu FIle đã tồn tại thì ghi lại dữ liệu xuống
            SaveFile(this.model.getFileName());
        } else {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showSaveDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                System.out.println(file);
                SaveFile(file.getAbsolutePath());
            }
        }
    }

    public void handleExit() {
        int Option = JOptionPane.showConfirmDialog(this, "Thoát chương trình ?",
                "Exit Program", JOptionPane.YES_NO_OPTION);

        if(Option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void hanldeAbout() {
        JOptionPane.showMessageDialog(this, "Mã nguồn thuộc về EdgarIgnite16",
                "Edgar's Program - About me...", JOptionPane.INFORMATION_MESSAGE);
    }
}
