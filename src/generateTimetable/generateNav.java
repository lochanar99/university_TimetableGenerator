package generateTimetable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class generateNav extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generateNav frame = new generateNav();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public generateNav() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 575);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 51, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel image = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/class1.png"));
		image.setIcon(img);
		image.setBounds(75, 65, 394, 375);
		contentPane.add(image);
		
		JButton btnAddWorkingDays = new JButton("Generate Lecturer Timetable");
		btnAddWorkingDays.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				generateLecturer addWDH = new generateLecturer();
				dispose();
				addWDH.setVisible(true);
			}
		});
		btnAddWorkingDays.setForeground(Color.WHITE);
		btnAddWorkingDays.setBackground(new Color(102, 51, 255));
		btnAddWorkingDays.setBounds(767, 162, 200, 89);
		contentPane.add(btnAddWorkingDays);
		
		JButton btnGenerateStudentTimetable = new JButton("Generate Student Timetable");
		
		btnGenerateStudentTimetable.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e1) {
				
				generateStudent addTS = new generateStudent();
				dispose();
				addTS.setVisible(true);
				
			}
			
		});
		
		btnGenerateStudentTimetable.setForeground(Color.WHITE);
		btnGenerateStudentTimetable.setBackground(new Color(102, 51, 255));
		btnGenerateStudentTimetable.setBounds(519, 162, 200, 89);
		contentPane.add(btnGenerateStudentTimetable);
		
		JButton btnViewAndEdit = new JButton("Generate Hall Timetable");
		btnViewAndEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				generateHall addTS = new generateHall();
				dispose();
				addTS.setVisible(true);
				
			}
		});
		btnViewAndEdit.setForeground(Color.WHITE);
		btnViewAndEdit.setBackground(new Color(102, 51, 255));
		btnViewAndEdit.setBounds(648, 295, 200, 89);
		contentPane.add(btnViewAndEdit);
		
		

		JLabel image2 = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/foot.png"));
		image2.setIcon(img2);
		image2.setBounds(0, 439, 1037, 119);
		contentPane.add(image2);

		JLabel lblGenerateTimetable = new JLabel("Generate Timetable");
		lblGenerateTimetable.setForeground(new Color(0, 0, 128));
		lblGenerateTimetable.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblGenerateTimetable.setBounds(364, 29, 280, 59);
		contentPane.add(lblGenerateTimetable);

}
}