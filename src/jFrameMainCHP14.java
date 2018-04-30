import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class jFrameMainCHP14 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jFrameMainCHP14 frame = new jFrameMainCHP14();
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
	public jFrameMainCHP14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sorting Excercise Practice for CHP 14");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 11, 766, 62);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(448, 104, 306, 307);
		contentPane.add(scrollPane);
		
		JTextArea textResults = new JTextArea();
		textResults.setText("Results");
		scrollPane.setViewportView(textResults);
		
		JButton btnSorting = new JButton("Sort");
		btnSorting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Practice with arrays
				int [] list = { 16,30,24,7,62,45,5,55};
				Sorting.sortBubble(list);
				//Display Results
				for( int i=0; i<list.length;i++)
					textResults.append(list[i] + ", ");
					textResults.append(" /n");
					
				Sorting.sortSelection(list);
				
			}
		});
		btnSorting.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSorting.setBounds(10, 73, 136, 36);
		contentPane.add(btnSorting);
	}
}
