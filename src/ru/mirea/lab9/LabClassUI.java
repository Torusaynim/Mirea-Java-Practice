package ru.mirea.lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {

    JButton button1 = new JButton("Сортировка");
    JButton button2 = new JButton("Поиск по ФИО");
    LabClassDriver obj = new LabClassDriver();
    JLabel lbl1 = new JLabel("");

    LabClassUI() throws EmptyStringException, StudentNotFoundException
    {
        super("Lab");
        setLayout(null);
        setSize(300, 120);
        button1.setBounds(0,10, 120,25);
        button2.setBounds(150,10, 120,25);
        lbl1.setBounds(25,50,250,20);
        add(button1);
        add(button2);
        add(lbl1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obj.insertSort();
                lbl1.setText("Отсортировано");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = JOptionPane.showInputDialog(null,"Введите ФИО");
                if (obj.findStudent(txt)==true)
                    lbl1.setText("Найден студент с id "+obj.getId(txt));
                else try {
                    if (txt.equals(""))
                        throw new EmptyStringException("Введена пустая строка");
                    throw new StudentNotFoundException("Не найден студент с такой фамилией");
                } catch (StudentNotFoundException | EmptyStringException ex) {
                    lbl1.setText(ex.getMessage());
                }
            }
        });
    }
}
