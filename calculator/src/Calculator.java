import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.print.attribute.standard.MediaSize.ISO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton threeButton,twoButton,oneButton,zeroButton;
	JButton dotButton,equalButton,clearButton; 
	JButton addButton,divButton,mulButton,subButton ;
	
	boolean isOperatorClicked=false;
	String oldvalue;
    int[] bits=new int[4];
    float  result;
	
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		
		jf =new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(400,500);
		jf.setLocation(400,200);
		
		//label
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 40, 330, 60);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(displayLabel);
		
		//buttons
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,70,50);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 25));
		
		//for button getting press
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(120,130,70,50);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 25));		
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(210,130,70,50);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 25));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30,190,70,50);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 25));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(120,190,70,50);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 25));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(210,190,70,50);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 25));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(30,250,70,50);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 25));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(120,250,70,50);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(210,250,70,50);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 25));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(30,310,70,50);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 25));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(120,310,70,50);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 25));
        dotButton.addActionListener(this);
		jf.add(dotButton);
		
		
		equalButton = new JButton("=");
		equalButton.setBounds(210,310,70,50);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 25));
        equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton = new JButton("/");
		divButton.setBounds(300,130,70,50);
		divButton.setFont(new Font("Arial", Font.PLAIN, 25));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton = new JButton("*");
		mulButton.setBounds(300,190,70,50);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 25));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		subButton = new JButton("-");
		subButton.setBounds(300,250,70,50);
		subButton.setFont(new Font("Arial", Font.PLAIN, 25));
        subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton = new JButton("+");
		addButton.setBounds(300,310,70,50);
		addButton.setFont(new Font("Arial", Font.PLAIN, 25));
        addButton.addActionListener(this);
		jf.add(addButton);
		
		clearButton =new JButton("clear");
		clearButton.setBounds(210,370,160,50);
		clearButton.setFont(new Font("Arial", Font .PLAIN,25));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	 
	public static void main(String a[]) {
		Calculator clc=new Calculator();
		
		
		
	}
	
	//defining button action

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//number buttons 
		if (e.getSource() == sevenButton) {
			//String labelText = displayLabel.getText();
			if (isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");	
	       }
		}
		else if (e.getSource()== eightButton){
			if (isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");	
	       }
	    }
		else if (e.getSource()== nineButton){
			if (isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");	
	       }
		}
		else if (e.getSource()== fourButton) {
			if (isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");	
	       }
		}
		else if (e.getSource()== fiveButton) {
			if (isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");	
	       }
		}
		else if (e.getSource()== sixButton) {
			if (isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");	
	       }
		}
		else if (e.getSource()== threeButton) {
			if (isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");	
	       }
		}
		else if (e.getSource()== twoButton) {
			if (isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");	
	       }
		}
		else if (e.getSource()== oneButton) {
			if (isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");	
	       }
		}
		else if (e.getSource()== zeroButton) {
			if (isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");	
	       }
		}
		
		
		//clear and dot buttons 
		else if (e.getSource()== dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		else if(e.getSource()== clearButton) {
			displayLabel.setText(" ");
		}
		
		
		//operator buttons 
		else if (e.getSource()== addButton) {
			isOperatorClicked=true;
			oldvalue= displayLabel.getText();
			bits[0]=1;
			
		}
		else if (e.getSource()== mulButton) {
			isOperatorClicked=true;
			oldvalue = displayLabel.getText();
			bits[1]=1;
		}
		else if (e.getSource()== subButton) {
			isOperatorClicked=true;
			oldvalue = displayLabel.getText();
			bits[2]=1;
			}
		else if (e.getSource()== divButton) {
			isOperatorClicked=true;
		    oldvalue = displayLabel.getText();
		    bits[3]=1;
		}

		else if(e.getSource()== equalButton) {
			
			
			String newvalue = displayLabel.getText();
			float oldvalueF = Float.parseFloat(oldvalue);
			float newvalueF = Float.parseFloat(newvalue);
			
			if (bits[0]==1){
				result = newvalueF + oldvalueF ;
				displayLabel.setText(result+"");	
				Arrays.fill(bits, 0);
			}
			
			else if(bits[1]==1) {
				result =oldvalueF * newvalueF ;
				displayLabel.setText(result+"");	
				Arrays.fill(bits, 0);
			}
			else if(bits[2]==1) {
				result =oldvalueF - newvalueF ;
				displayLabel.setText(result+"");	
				Arrays.fill(bits, 0);
			}
			else if(bits[3]==1) {
				if (oldvalueF > newvalueF) {
					result =oldvalueF / newvalueF;
					displayLabel.setText(result+"");	
					Arrays.fill(bits, 0);
				}
				else {
					displayLabel.setText("error");	
					Arrays.fill(bits, 0);
				}
			}
				
				
			
			
			
			}
		}
			
	
		
}
