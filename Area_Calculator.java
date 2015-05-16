import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Area_Calculator extends JFrame {
	  
	  private JTextField jtfradius;
	  private JTextField jtfthearea;
	  private JTextField jtfperimeter;
	
	  private JButton jbtCalculate;
	  private JButton jbtClear;
    
      private JTextField jtflength1;
      private JTextField jtfwidth1;
      private JTextField jtfthearea1;
      private JTextField jtfperimeter1;
	
      private JButton jbtCalculate1;
      private JButton jbtClear1;
    
      private JTextField jtfwidth2;
      private JTextField jtfthearea2;
      private JTextField jtfperimeter2;
	
      private JButton jbtCalculate2;
      private JButton jbtClear2;
	  
	  
	  
	  public static void main(String[] args) {
	    JFrame frame = new Area_Calculator();
	    frame.pack();
	    frame.setTitle("U10216003_GeoCalculate");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setVisible(true);
	  }

	  public Area_Calculator() {
	    // Create a new panel with GridLayout to hold labels and text boxes
	    JPanel p = new JPanel();
	    p.setLayout(new GridLayout(4, 2, 5, 0));
	    p.setBorder(new EmptyBorder(5, 5, 5, 5));
	    p.add(new JLabel("Radius"));
	    p.add(jtfradius = new JTextField(8));
	    p.add(new JLabel("The area is"));
	    p.add(jtfthearea = new JTextField(8));
	    p.add(new JLabel("The perimeter is"));
	    p.add(jtfperimeter = new JTextField(8));
	  
	    
	    // Add the panel and a button to the frame
	    setLayout(new GridLayout(6,1,2,2));
	    add(p);

	    // Add a button to a panel
	    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    p1.add(jbtCalculate = new JButton("Calculate"));
	   	p1.add(jbtClear = new JButton("Clear"));
	    add(p1);

	    jbtCalculate.setMnemonic('C');
	    jtfradius.setHorizontalAlignment(JTextField.RIGHT);
	    jtfthearea.setHorizontalAlignment(JTextField.RIGHT);
	    jtfperimeter.setHorizontalAlignment(JTextField.RIGHT);
	  

	    // Register listener
	    jbtCalculate.addActionListener(new ActionListener() {
	      @Override // Handle ActionEvent
	      public void actionPerformed(ActionEvent e) {
	      double radius = Double.parseDouble(jtfradius.getText());
	    
          Circle circle = new Circle(radius);
        
          jtfthearea.setText(String.format("%.3f",circle.getArea()));
          
          jtfperimeter.setText(String.format("%.3f",circle.getPerimeter()));
	      }
	    });
	  

	  jbtClear.addActionListener(new ActionListener() {
	      @Override // Handle ActionEvent
	      public void actionPerformed(ActionEvent e) {
	         jtfradius.setText("");
			  jtfthearea.setText("");
			  jtfperimeter.setText("");
	      }
	    });
	  

	  JPanel g = new JPanel();
	    g.setLayout(new GridLayout(4, 2, 5, 0));
	    g.setBorder(new EmptyBorder(6, 5, 5, 5));
	    g.add(new JLabel("Length"));
	    g.add(jtflength1 = new JTextField(8));
	    g.add(new JLabel("Width"));
	    g.add(jtfwidth1 = new JTextField(8));
	    g.add(new JLabel("The area is"));
	    g.add(jtfthearea1 = new JTextField(8));
	    g.add(new JLabel("The perimeter is"));
	    g.add(jtfperimeter1 = new JTextField(8));
	  
	    
	    
	    add(g);

	    // Add a button to a panel
	    JPanel g1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    g1.add(jbtCalculate1 = new JButton("Calculate"));
	   	g1.add(jbtClear1 = new JButton("Clear"));
	    add(g1);

	    jbtCalculate1.setMnemonic('C');
	    jtflength1.setHorizontalAlignment(JTextField.RIGHT);
	    jtfwidth1.setHorizontalAlignment(JTextField.RIGHT);
	    jtfthearea1.setHorizontalAlignment(JTextField.RIGHT);
	    jtfperimeter1.setHorizontalAlignment(JTextField.RIGHT);
	  

	    // Register listener
	    jbtCalculate1.addActionListener(new ActionListener() {
	      @Override // Handle ActionEvent
	      public void actionPerformed(ActionEvent e) {
	      double length = Double.parseDouble(jtflength1.getText());
	      double width = Double.parseDouble(jtfwidth1.getText());
          Rectangle rectangle = new Rectangle(length,width);
        
          jtfthearea1.setText(String.format("%.3f",rectangle.getArea()));
          
          jtfperimeter1.setText(String.format("%.3f",rectangle.getPerimeter()));
	      }
	    });
	  

	  jbtClear1.addActionListener(new ActionListener() {
	      @Override // Handle ActionEvent
	      public void actionPerformed(ActionEvent e) {
	          jtflength1.setText("");
	          jtfwidth1.setText("");
			  jtfthearea1.setText("");
			  jtfperimeter1.setText("");
	      }
	    });
	  

	  JPanel t = new JPanel();
	    t.setLayout(new GridLayout(4, 2, 5, 0));
	    t.setBorder(new EmptyBorder(5, 5, 5, 5));
	    t.add(new JLabel("Width"));
	    t.add(jtfwidth2 = new JTextField(8));
	    t.add(new JLabel("The area is"));
	    t.add(jtfthearea2 = new JTextField(8));
	    t.add(new JLabel("The perimeter is"));
	    t.add(jtfperimeter2 = new JTextField(8));
	  
	    
	    add(t);

	    // Add a button to a panel
	    JPanel t1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    t1.add(jbtCalculate2 = new JButton("Calculate"));
	   	t1.add(jbtClear2 = new JButton("Clear"));
	    add(t1);

	    jbtCalculate2.setMnemonic('C');
	    jtfwidth2.setHorizontalAlignment(JTextField.RIGHT);
	    jtfthearea2.setHorizontalAlignment(JTextField.RIGHT);
	    jtfperimeter2.setHorizontalAlignment(JTextField.RIGHT);
	  

	    // Register listener
	    jbtCalculate2.addActionListener(new ActionListener() {
	      @Override // Handle ActionEvent
	      public void actionPerformed(ActionEvent e) {
	      double width = Double.parseDouble(jtfwidth2.getText());
	    
          Square square = new Square(width);
        
          jtfthearea2.setText(String.format("%.3f",square.getArea()));
          
          jtfperimeter2.setText(String.format("%.3f",square.getPerimeter()));
	      }
	    });
	  

	  jbtClear2.addActionListener(new ActionListener() {
	      @Override // Handle ActionEvent
	      public void actionPerformed(ActionEvent e) {
	          jtfwidth2.setText("");
			  jtfthearea2.setText("");
			  jtfperimeter2.setText("");
	      }
	    });
	}
	  
}	  
	
