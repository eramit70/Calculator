// WAp to Demonstrate Calculator Using Buttons

import java.awt.*;
import java.awt.event.*;

class CalFrame extends Frame implements ActionListener {

  Button key[] = new Button[10];

  Button opPlus = new Button("+");
  Button opEqule = new Button("=");
  Button opSub   = new Button("-");
  Button opMulti = new Button("*");
  Button  opMod  = new Button("%");
  Button opClr   = new Button("C");
  Button opDiv   = new Button("/");
  Button opAc   = new Button("AC");



  TextField text = new TextField("0");
  double op1, op2 ;
  char oprator ;

  int flag=0;

  CalFrame(){

    super("Calculator");  // calling Base Class Calculator

    Panel button = new Panel(new GridLayout(4,5,20,20));
    //Panel button2 = new Panel(new GridLayout())
    button.setBackground(Color.black);
    setLayout(new BorderLayout(50,50));   // Gap Betbeen Textfield and button
    //Shift our pannel

    add(text,BorderLayout.NORTH);
    add(button,BorderLayout.CENTER);

    for(int i=0; i<10; i++){
      key[i] = new Button(""+i);  // Display button like - 1,2,3,4.....
      button.add(key[i]);     // set number on button 
      key[i].addActionListener(this);  // Doing Event Handlling like( bo number kuchh kre)
                            // why Using "this" Jis class me implements hota "this" us class ko call Krta hai 
    }
    button.add(opClr);
    button.add(opAc);

    button.add(opSub);
    button.add(opMulti);
    button.add(opDiv);
    button.add(opMod);
    button.add(opPlus);
    button.add(opEqule);
    

    opAc.addActionListener(this);
    opPlus.addActionListener(this);
    opSub.addActionListener(this);
    opMulti.addActionListener(this);
    opDiv.addActionListener(this);
    opMod.addActionListener(this);
    opEqule.addActionListener(this);
    opClr.addActionListener(this);



    setBackground(Color.blue); // all the Bachground blue only Background
    button.setBackground(Color.red); // button BG color Red
    text.setBackground(Color.DARK_GRAY);  // textfield bc color Dark gray
    text.setEditable(false);      // textfield ko add nai kiya ja sakta ab
    setSize(400,400);
    setVisible(true);
    

    
  }
  /* */
  public void actionPerformed(ActionEvent ae){
    
    String str = ae.getActionCommand();

    String displayString ;

    if(str.equals("+")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = '+';
      flag = 0;
      return;

    }
  else  if(str.equals("-")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = '-';
      flag = 0;
      return;

    }else if(str.equals("*")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = '*';
      flag = 0;
      return;

    }else if(str.equals("/")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = '/';
      flag = 0;
      return;

    }  else if(str.equals("%")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = '%';
      flag = 0;
      return;

    }else if(str.equals("C")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = 'C';
      flag = 0;
      return;
      
    }else if(str.equals("AC")){

      displayString = text.getText();
      op1 = Double.parseDouble(displayString);
      oprator = 'A';
      flag = 0;
      return;

    }else if(str.equals("=")){

      displayString = text.getText();
      op2 = Double.parseDouble(displayString);
      flag = 0;


      switch(oprator){

        case '+':
          double a;

            a = op1+op2 ;
              text.setText(""+a);
              return;
       case '-':
              
       double b;

       b= op1-op2 ;
         text.setText(""+b);
         return;
       case '*':
       double c;

       c = op1*op2 ;
         text.setText(""+c);
         return;

       case '%':
       double d;

       d = op1%op2 ;
         text.setText(""+d);
         return;

      case '/':

      double e;

      e = op1/op2 ;
        text.setText(""+e);
        return;

       case 'C':
       String z,zt;
       zt = text.getText();
          z=zt.substring(0, zt.length()-1);     
        text.setText(z);
        return;
          
      case 'A':
         op1=0;
         op2=0;
         String g="0" ;
         text.setText(g);
         return;
      }

    }
    
    else if(flag==0){
      text.setText("");
      flag =1;

    }
    displayString = text.getText();
    text.setText(displayString+str);
  }
}

public class Calculator {
  public static void main(String[] args) {
   
    CalFrame amit =new CalFrame();
  
}
}
