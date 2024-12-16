package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

    public static void main(String[] args) {
        // Main Frame
        JFrame frame = new JFrame();
        frame.setTitle("Enrollment Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1250, 800);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);

        // Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(50, 50, 50));
        leftPanel.setBounds(0, 0, 250, 800);
        leftPanel.setLayout(null);

        JLabel sub = new JLabel("Course Enrollment System");
        sub.setBounds(30, 20, 250, 30);
        sub.setForeground(Color.WHITE);
        sub.setFont(new Font("Arial", Font.BOLD, 15));

        JButton enrollButton = new JButton("Enrollment");
        enrollButton.setBounds(30, 175, 200, 40);
        enrollButton.setFocusable(false);
        enrollButton.setForeground(Color.WHITE);
        enrollButton.setBackground(Color.GRAY);

        JButton viewCoursesButton = new JButton("View Available Courses");
        viewCoursesButton.setBounds(30, 275, 200, 40);
        viewCoursesButton.setFocusable(false);
        viewCoursesButton.setForeground(Color.WHITE);
        viewCoursesButton.setBackground(Color.GRAY);

        JButton addCourseButton = new JButton("Add a Course");
        addCourseButton.setBounds(30, 375, 200, 40);
        addCourseButton.setFocusable(false);
        addCourseButton.setForeground(Color.WHITE);
        addCourseButton.setBackground(Color.GRAY);

        JButton viewStudentsButton = new JButton("View Students Enrolled");
        viewStudentsButton.setBounds(30, 475, 200, 40);
        viewStudentsButton.setFocusable(false);
        viewStudentsButton.setForeground(Color.WHITE);
        viewStudentsButton.setBackground(Color.GRAY);

        leftPanel.add(sub);
        leftPanel.add(enrollButton);
        leftPanel.add(viewCoursesButton);
        leftPanel.add(addCourseButton);
        leftPanel.add(viewStudentsButton);

        // Right Panel pre
        JPanel rightPanel = new JPanel();
        rightPanel.setBounds(250, 0, 1000, 800);
        rightPanel.setBackground(Color.BLACK);
        rightPanel.setLayout(new CardLayout()); // Set CardLayout for dynamic switching

        // Panel ng Enrollment
        JPanel enrollmentPanel = new JPanel();
        enrollmentPanel.setBackground(Color.DARK_GRAY);
        enrollmentPanel.setLayout(null);

        JLabel enrollTitle = new JLabel("Enrollment Form");
        enrollTitle.setBounds(100, 50, 250, 30);
        enrollTitle.setForeground(Color.WHITE);
        enrollTitle.setFont(new Font("Arial", Font.BOLD, 20));
        enrollmentPanel.add(enrollTitle);
        
        //  SaFirst Name
        JLabel fnameLabel = new JLabel("First Name:");
        fnameLabel.setBounds(50, 80, 100, 30);
        fnameLabel.setForeground(Color.WHITE);
        enrollmentPanel.add(fnameLabel);

        JTextField fnameField = new JTextField();
        fnameField.setBounds(160, 80, 200, 30);
        enrollmentPanel.add(fnameField);

        // Last Name
        JLabel lnameLabel = new JLabel("Last Name:");
        lnameLabel.setBounds(50, 130, 100, 30);
        lnameLabel.setForeground(Color.WHITE);
        enrollmentPanel.add(lnameLabel);

        JTextField lnameField = new JTextField();
        lnameField.setBounds(160, 130, 200, 30);
        enrollmentPanel.add(lnameField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 180, 100, 30);
        emailLabel.setForeground(Color.WHITE);
        enrollmentPanel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(160, 180, 200, 30);
        enrollmentPanel.add(emailField);

        // Contact Number
        JLabel contactLabel = new JLabel("Contact Number:");
        contactLabel.setBounds(50, 230, 120, 30);
        contactLabel.setForeground(Color.WHITE);
        enrollmentPanel.add(contactLabel);

        JTextField contactField = new JTextField();
        contactField.setBounds(160, 230, 200, 30);
        enrollmentPanel.add(contactField);

        // Enrollment Date (Set default date)
        JLabel dateLabel = new JLabel("Enrollment Date:");
        dateLabel.setBounds(50, 280, 120, 30);
        dateLabel.setForeground(Color.WHITE);
        enrollmentPanel.add(dateLabel);

        JTextField dateField = new JTextField("2024-12-02");
        dateField.setBounds(160, 280, 200, 30);
        dateField.setEditable(false); // Default date, not editable
        enrollmentPanel.add(dateField);

        // Course Enrolled
        JLabel courseLabel = new JLabel("Course Enrolled:");
        courseLabel.setBounds(50, 330, 120, 30);
        courseLabel.setForeground(Color.WHITE);
        enrollmentPanel.add(courseLabel);

        JTextField courseField = new JTextField();
        courseField.setBounds(160, 330, 200, 30);
        enrollmentPanel.add(courseField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(160, 380, 100, 40);
        submitButton.setFocusable(false);
        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(Color.GRAY);
        enrollmentPanel.add(submitButton);

        // Submit Button Action Listener
        submitButton.addActionListener(e -> {
            String fname = fnameField.getText();
            String lname = lnameField.getText();
            String email = emailField.getText();
            String contact = contactField.getText();
            String enrollmentDate = dateField.getText();
            String course = courseField.getText();

            if (fname.isEmpty() || lname.isEmpty() || email.isEmpty() || contact.isEmpty() || course.isEmpty()) {
                JOptionPane.showMessageDialog(enrollmentPanel, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(enrollmentPanel, 
                    "Enrollment Successful!\n" +
                    "Name: " + fname + " " + lname + "\n" +
                    "Email: " + email + "\n" +
                    "Contact: " + contact + "\n" +
                    "Enrollment Date: " + enrollmentDate + "\n" +
                    "Course Enrolled: " + course, 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // Clear the fields after submission
                fnameField.setText("");
                lnameField.setText("");
                emailField.setText("");
                contactField.setText("");
                courseField.setText("");
            }
        });

        // Panel for Viewing Courses
        JPanel coursesPanel = new JPanel();
        coursesPanel.setBackground(Color.LIGHT_GRAY);
        coursesPanel.setLayout(null);

        JLabel coursesTitle = new JLabel("Available Courses");
        coursesTitle.setBounds(100, 50, 250, 30);
        coursesTitle.setFont(new Font("Arial", Font.BOLD, 20));
        coursesPanel.add(coursesTitle);

        // Panel for Adding a Course
        JPanel addCoursePanel = new JPanel();
        addCoursePanel.setBackground(Color.DARK_GRAY);
        addCoursePanel.setLayout(null);

        JLabel addCourseTitle = new JLabel("Add a New Course");
        addCourseTitle.setBounds(100, 50, 250, 30);
        addCourseTitle.setForeground(Color.WHITE);
        addCourseTitle.setFont(new Font("Arial", Font.BOLD, 20));
        addCoursePanel.add(addCourseTitle);

        // Panel for Viewing Students
        JPanel studentsPanel = new JPanel();
        studentsPanel.setBackground(Color.GRAY);
        studentsPanel.setLayout(null);

        JLabel studentsTitle = new JLabel("Students Enrolled");
        studentsTitle.setBounds(100, 50, 250, 30);
        studentsTitle.setFont(new Font("Arial", Font.BOLD, 20));
        studentsPanel.add(studentsTitle);

        // Add all panels to the rightPanel (CardLayout)
        rightPanel.add(enrollmentPanel, "Enrollment");
        rightPanel.add(coursesPanel, "Courses");
        rightPanel.add(addCoursePanel, "AddCourse");
        rightPanel.add(studentsPanel, "Students");

        // Add Action Listeners for Buttons
        enrollButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) rightPanel.getLayout();
            cl.show(rightPanel, "Enrollment");
        });

        viewCoursesButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) rightPanel.getLayout();
            cl.show(rightPanel, "Courses");
        });

        addCourseButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) rightPanel.getLayout();
            cl.show(rightPanel, "AddCourse");
        });

        viewStudentsButton.addActionListener(e -> {
            CardLayout cl = (CardLayout) rightPanel.getLayout();
            cl.show(rightPanel, "Students");
        });

        // Add panels to the frame
        frame.add(leftPanel);
        frame.add(rightPanel);
        frame.setVisible(true);
    }
}
