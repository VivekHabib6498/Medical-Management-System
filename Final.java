import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;
import java.math.*;
import javax.swing.table.*;

public class Final extends JFrame implements ActionListener
{
        Container contentPane=getContentPane(); 
        JPanel p1=new JPanel();
        String s1="";
        Font f1=new Font("Monotype Corsiva",Font.ITALIC,30);
        Font f2=new Font("Times New Roman",Font.BOLD,35);
        JLabel j1=new JLabel("Username");
        JLabel j2=new JLabel("Password");
        JLabel j3=new JLabel("                                   HEALTHCARE MEDICAL");
        JLabel j4=new JLabel("                                                                           Created by....     Vivek Habib");
        JTextField t1=new JTextField(10);
        JPasswordField t2=new JPasswordField(10);
        JButton b1=new JButton("Done");
        JButton b2=new JButton("Exit");
        public Final(String title)
        {
                super(title);
                getContentPane().setLayout(new BorderLayout());
                p1.setLayout(null);
                //p1.setBounds(500,300,800,800);
                j1.setBounds(390,225,100,30);
                j1.setForeground(Color.white);
                t1.setBounds(500,225,80,25);
                j2.setBounds(390,275,100,30);
                j2.setForeground(Color.white);
                t2.setBounds(500,275,80,25);
                b1.setBounds(390,350,80,25);
                b1.setBackground(Color.gray);
                b2.setBounds(500,350,80,25);
                b2.setBackground(Color.gray);
                j3.setFont(f2);
                j3.setForeground(Color.blue);
                p1.setBackground(Color.black);
                j4.setFont(f1);
                p1.add(j1);
                p1.add(t1);
                p1.add(j2);
                p1.add(t2);
                p1.add(b1);
                p1.add(b2);
                b1.addActionListener(this);
                b2.addActionListener(this);
                getContentPane().add(j3,"North");
                getContentPane().add("South",j4);
                getContentPane().add("Center",p1);
        }
        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==b1)
                {
                        String s3=t1.getText();
                        String s4=t2.getText();
                        /*if(s3.length()==0 && s4.length()==0)
                        {
                                JOptionPane.showMessageDialog(Final.this,"Please insert  username & password","Wrong Input",JOptionPane.INFORMATION_MESSAGE);
                        } */
                        if(s3.length()==0 && s4.length()!=0)
                        {
                                JOptionPane.showMessageDialog(Final.this,"Please insert username","Wrong Input",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if(s3.length()!=0 && s4.length()==0)
                        {
                                JOptionPane.showMessageDialog(Final.this,"Please insert password","Wrong Input",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if(s3.length()!=0 && s4.length()!=0)
                        {
                                if(t1.getText().equals("admin") && t2.getText().equals("password")) 
                                {	new MenuFrame();
						dispose();
						System.out.println("LOGIN SUCCESSFULLY");
                                       /* try
                                        {
                                                getContentPane().add(new MenuFrame());
                                        }
                                        catch(Exception p)
                                        {
                                                System.out.println("exception"+p);
                                        }*/
                                }
                                else
                                {
                                        t1.setText(s1);
                                        t2.setText(s1);
                                        JOptionPane.showMessageDialog(Final.this,"Please insert correct username & password","Wrong Input",JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(Final.this,"Please insert  username & password","Wrong Input",JOptionPane.INFORMATION_MESSAGE);
                        }
                }
                else if(ae.getSource()==b2)
                {
                        System.exit(0);
                }//if
        }//action
        public static void main(String args[])
        {
                Final f1=new Final("Medical Management System");
                f1.setSize(1024,735);
                f1.setVisible(true);
        }//main
}//class

class MenuFrame extends JFrame implements ActionListener
{
        Container contentPane =getContentPane();
        Font f1=new Font("Monotype Corsiva",Font.ITALIC,35);
        Font f2=new Font("Monotype Corsiva",Font.BOLD,100);
        JLabel j3=new JLabel("                                 HEALTHCARE MEDICAL ");
        JLabel j4=new JLabel("\t Created by...   Vivek Habib");
        JMenuBar mb = new JMenuBar();
        JMenu masterMenu=new JMenu("Master Detail");
        JMenu transactionMenu=new JMenu("Transaction");
        JMenu reportMenu=new JMenu("Report");
        JMenu helpMenu=new JMenu("Help");
        JMenu exitMenu=new JMenu("Exit");
        JMenu supplier=new JMenu("Supplier");
        JMenu item=new JMenu("Item");
        JMenu categary=new JMenu("Categary");
        JMenu supplier_item=new JMenu("Supplier Item");
        JMenu stock=new JMenu("Stock");
        JMenuItem isup=new JMenuItem("Insert");
        JMenuItem usup=new JMenuItem("Update");
        JMenuItem dsup=new JMenuItem("Delete");
        JMenuItem iitem=new JMenuItem("Insert");
        JMenuItem uitem=new JMenuItem("Update");
        JMenuItem ditem=new JMenuItem("Delete");
        JMenuItem icat=new JMenuItem("Insert");
        JMenuItem ucat=new JMenuItem("Update");
        JMenuItem dcat=new JMenuItem("Delete");
        JMenuItem isupitem=new JMenuItem("Insert");
        JMenuItem dsupitem=new JMenuItem("Delete");
        JMenuItem istock=new JMenuItem("Insert");
        JMenuItem ustock=new JMenuItem("Update");
        JMenuItem purchase=new JMenuItem("Purchase Transaction");
        JMenuItem sales=new JMenuItem("Sales Transaction");
        JMenuItem exit0=new JMenuItem("Exit");
        JMenu customer_r=new JMenu("Customer");
        JMenuItem hospital=new JMenuItem("HospitalWise");
        JMenuItem indi=new JMenuItem("IndivitvalWise");
        JMenu supplier_r=new JMenu("Supplier");
        JMenuItem city=new JMenuItem("CityWise");
        JMenu sales_r=new JMenu("Sales");
        JMenuItem date_s=new JMenuItem("dateWise");
        JMenu purchase_r=new JMenu("Purchase");
        JMenuItem supp_s=new JMenuItem("SupplierWise");

        public MenuFrame()
        {
                masterMenu.add(supplier);
                supplier.add(isup);
                supplier.add(usup);
                supplier.add(dsup);
                masterMenu.add(item);
                item.add(iitem);
                item.add(uitem);
                item.add(ditem);
                masterMenu.add(categary);
                categary.add(icat);
                categary.add(ucat);
                categary.add(dcat);
                masterMenu.add(supplier_item);
                supplier_item.add(isupitem);
                supplier_item.add(dsupitem);
                masterMenu.add(stock);
                stock.add(istock);
                stock.add(ustock);
                reportMenu.add(customer_r);
                customer_r.add(hospital);
                customer_r.add(indi);
                reportMenu.add(supplier_r);
                supplier_r.add(city);
                reportMenu.add(sales_r);
                sales_r.add(date_s);
                reportMenu.add(purchase_r);
                purchase_r.add(supp_s);
                transactionMenu.add(purchase);
              transactionMenu.add(sales);
                exitMenu.add(exit0);
                mb.add(masterMenu);
                mb.add(transactionMenu);
                mb.add(reportMenu);
                mb.add(helpMenu);
                mb.add(exitMenu);
                setJMenuBar(mb);
                exit0.addActionListener(this);
                isup.addActionListener(this);
                usup.addActionListener(this);
                dsup.addActionListener(this);
                iitem.addActionListener(this);
                uitem.addActionListener(this);
                ditem.addActionListener(this);
                icat.addActionListener(this);
                ucat.addActionListener(this);
                dcat.addActionListener(this);
                isupitem.addActionListener(this);
                dsupitem.addActionListener(this);
                istock.addActionListener(this);
                ustock.addActionListener(this);
                purchase.addActionListener(this);
                sales.addActionListener(this);
                hospital.addActionListener(this);
                indi.addActionListener(this);
                city.addActionListener(this);
                date_s.addActionListener(this);
                supp_s.addActionListener(this);
                getContentPane().setLayout(new BorderLayout());
                getContentPane().add("North",j3);
                getContentPane().add("South",j4);
                j3.setFont(f1);
                j3.setForeground(Color.blue);
                j4.setFont(f1);
                getContentPane().setBackground(Color.black);
      ImageIcon i1=new ImageIcon("med.jpg");	
        JLabel lblImage=new JLabel(i1);
        lblImage.setBounds(0,0,500,400 );
        add(lblImage);
                
                setTitle("Medical Management System");
                setVisible(true);
                setSize(1024,735);
                setVisible(true);
        }//constructor
        public void actionPerformed(ActionEvent ae)
        {
                if(ae.getSource()==exit0)
               		 System.exit(0);
                else if(ae.getSource()==isup)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new isup_p());
                                System.out.println("supplier");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }
                else if(ae.getSource()==usup)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new usup_p());
                                System.out.println("item");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
        
                else if(ae.getSource()==dsup)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new dsup_p());
                                System.out.println("delete");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
//-----------------------------------------------------------------
                else if(ae.getSource()==iitem)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new iitem_p());
                                System.out.println("item");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==uitem)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new uitem_p());
                                System.out.println("item");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==ditem)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new ditem_p());
                                System.out.println("delete");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==icat)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new icat_p());
                                System.out.println("categary");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==ucat)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new ucat_p());
                                System.out.println("categary");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==dcat)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new dcat_p());
                                System.out.println("delete");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==isupitem)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new isupitem_p());
                                System.out.println("supplier item");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==dsupitem)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new dsupitem_p());
                                System.out.println("supplier item");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==istock)
                {                               
                        setVisible(false);
                        try
                        {
                                contentPane.add(new istock_p());
                                System.out.println("categary");
                        }
                        catch(Exception p)              
                        {                       
                                System.out.println("exception"+p);
                        }
                }//if                           
                else if(ae.getSource()==ustock)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new ustock_p());
                                System.out.println("categary");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==purchase)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new purchase_p());
                                System.out.println("purchase");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==sales)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new sales_p());
                                System.out.println("sales");
                        }
                        catch(Exception p)                      
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==hospital)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new hospital_p());
                                System.out.println("hospitalwiseReport");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==indi)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new indi_p());
                                System.out.println("IndivitualwiseReport");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
        

                else if(ae.getSource()==city)
                {       
                        setVisible(false);
                        try
                        {
                                contentPane.add(new city_p());
                                System.out.println("citywiseReport");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
                else if(ae.getSource()==date_s)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new date_s_p());
                                System.out.println("datewiseReport");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                        }
                }//if
        
                else if(ae.getSource()==supp_s)
                {
                        setVisible(false);
                        try
                        {
                                contentPane.add(new supp_s_p());
                                System.out.println("SupplierwiseReport");
                        }
                        catch(Exception p)
                        {
                                System.out.println("exception"+p);
                }
        }//if
}//action
}//MainMenu

class isup_p extends JFrame implements ActionListener
{
	JLabel sid_l=new JLabel("Supplier_id");
	JLabel sname_l=new JLabel("Sname");
	JTextField sid_t=new JTextField(10);
	JTextField sname_t=new JTextField(10);
	JLabel sadd_l=new JLabel("Address");
	JLabel scity_l=new JLabel("City");
	JTextField sadd_t=new JTextField(30);
	JTextField scity_t=new JTextField(10);
	JLabel sph_l=new JLabel("Phone no.");
	JTextField sph_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton sinsert=new JButton("Insert");
	JButton sexit=new JButton("Exit");
	public isup_p()
	{
		getContentPane().setLayout(null);
		sid_l.setBounds(20,30,100,30);
		sid_t.setBounds(150,30,100,30);
		sname_l.setBounds(20,80,100,30);
		sname_t.setBounds(150,80,100,30);
		sadd_l.setBounds(20,130,100,30);
		sadd_t.setBounds(150,130,270,30);
		scity_l.setBounds(20,160,100,30);
		scity_t.setBounds(150,160,100,30);
		sph_l.setBounds(20,200,100,30);
		sph_t.setBounds(150,200,100,30);
		mainMenu.setBounds(20,500,100,30);
		sinsert.setBounds(150,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(sid_l);
		getContentPane().add(sid_t);
		getContentPane().add(sname_l);
		getContentPane().add(sname_t);
		getContentPane().add(sadd_l);
		getContentPane().add(sadd_t);
		getContentPane().add(scity_l);
		getContentPane().add(scity_t);
		getContentPane().add(sph_l);
		getContentPane().add(sph_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sinsert);
		sinsert.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		setTitle("Insert data in Supplier Table");
		setVisible(true);	
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
		System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if

		if(e.getSource().equals(sinsert))
		{
			String s1,s2,s3,s4;
			long s5;
			s1=sid_t.getText();
			s2=sname_t.getText();
			s3=sadd_t.getText();
			s4=scity_t.getText();
			s5=Long.parseLong(sph_t.getText());
			System.out.println(s1+s2+s3+s4+s5);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("insert into supplier values(?,?,?,?,?)");
				pstmt.setString(1,s1);
				pstmt.setString(2,s2);
				pstmt.setString(3,s3);
				pstmt.setString(4,s4);
				pstmt.setDouble(5,s5);
				pstmt.executeUpdate();
				con.close();
				int dialogtype = JOptionPane.INFORMATION_MESSAGE;
				JOptionPane.showMessageDialog(null, "Supplier Added ", "Informer", dialogtype);
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame

class usup_p extends JFrame implements ActionListener
{
	JLabel sid_l=new JLabel("Supplier_id");
	JLabel sname_l=new JLabel("Sname");
	JTextField sid_t=new JTextField(10);
	JTextField sname_t=new JTextField(10);
	JLabel sadd_l=new JLabel("Address");
	JLabel scity_l=new JLabel("City");
	JTextField sadd_t=new JTextField(30);
	JTextField scity_t=new JTextField(10);
	JLabel sph_l=new JLabel("Phone no.");
	JTextField sph_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton snext=new JButton("Next");
	JButton supdate=new JButton("Update");
	JButton sexit=new JButton("Exit");
	public usup_p()
	{
		getContentPane().setLayout(null);
		sid_l.setBounds(20,30,100,30);
		sid_t.setBounds(150,30,100,30);
		sname_l.setBounds(20,80,100,30);
		sname_t.setBounds(150,80,100,30);
		sadd_l.setBounds(20,130,100,30);
		sadd_t.setBounds(150,130,270,30);
		scity_l.setBounds(20,160,100,30);
		scity_t.setBounds(150,160,100,30);
		sph_l.setBounds(20,200,100,30);
		sph_t.setBounds(150,200,100,30);
		mainMenu.setBounds(20,500,100,30);
		snext.setBounds(150,500,100,30);
		supdate.setBounds(280,500,100,30);
		sexit.setBounds(410,500,100,30);
		getContentPane().add(sid_l);
		getContentPane().add(sid_t);
		getContentPane().add(sname_l);
		getContentPane().add(sname_t);
		getContentPane().add(sadd_l);
		getContentPane().add(sadd_t);
		getContentPane().add(scity_l);
		getContentPane().add(scity_t);
		getContentPane().add(sph_l);
		getContentPane().add(sph_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(snext);
		snext.addActionListener(this);
		getContentPane().add(supdate);
		supdate.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		sname_t.setEnabled(false);
		sadd_t.setEnabled(false);
		scity_t.setEnabled(false);
		sph_t.setEnabled(false);
		supdate.setEnabled(false);	
		setTitle("Updade data in Supplier Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if	
		if(e.getSource().equals(snext))
		{
			String p1,s2,s3,s4,s5;
			p1=sid_t.getText();
			sid_t.setEnabled(false);
			sname_t.setEnabled(true);
			sadd_t.setEnabled(true);
			scity_t.setEnabled(true);
			sph_t.setEnabled(true);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("select * from supplier where s_id=(?) ");
				pstmt.setString(1,p1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					s2=(rs.getString(2));
					s3=rs.getString(3);
					s4=(rs.getString(4));
					s5=rs.getString(5);
					sname_t.setText(s2);
					sadd_t.setText(s3);
					scity_t.setText(s4);
					sph_t.setText(s5);	
				}
				supdate.setEnabled(true);
				snext.setEnabled(false);
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
		if(e.getSource().equals(supdate))
		{
			String s2,s3,s4,p1;
			long s5;
			sid_t.setEnabled(true);
			p1=sid_t.getText();
			sid_t.setEnabled(false);
			s2=sname_t.getText();
			s3=sadd_t.getText();
			s4=scity_t.getText();
			s5=Long.parseLong(sph_t.getText());
			System.out.println(s2+s3+s4+s5+p1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("UPDATE supplier SET sname=?,sadd=?,scity=?,sph=? where s_id=?");
				pstmt.setString(1,s2);
				pstmt.setString(2,s3);
				pstmt.setString(3,s4);
				pstmt.setDouble(4,s5);		
				pstmt.setString(5,p1);
				pstmt.executeUpdate();
				con.close();

			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	
	}//action
}//frame

class dsup_p extends JFrame implements ActionListener
{
	JLabel sid_l=new JLabel("Supplier_id");
	JTextField sid_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton sdelete=new JButton("Delete");
	JButton sexit=new JButton("Exit");
	public dsup_p()
	{
		getContentPane().setLayout(null);
		sid_l.setBounds(20,30,100,30);
		sid_t.setBounds(150,30,100,30);
		mainMenu.setBounds(20,500,100,30);
		sdelete.setBounds(150,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(sid_l);
		getContentPane().add(sid_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sdelete);
		sdelete.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		setTitle("Delete data in Supplier Table");
		setVisible(true);
		setSize(800,800);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(sdelete))
		{
			String s1;
			s1=sid_t.getText();
			System.out.println(s1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("delete *from supplier where s_id=(?)");
				pstmt.setString(1,s1);
				pstmt.executeUpdate();
				con.close();
				
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame

class iitem_p extends JFrame implements ActionListener
{
	JLabel iid_l=new JLabel("Item_id");
	JLabel iname_l=new JLabel("Iname");
	JTextField iid_t=new JTextField(10);
	JTextField iname_t=new JTextField(10);
	JLabel iupp_l=new JLabel("IUnit_Price_Purchase");
	JLabel iups_l=new JLabel("IUnit_Price_sales");
	JTextField iupp_t=new JTextField(30);
	JTextField iups_t=new JTextField(10);
	JLabel icat_l=new JLabel("Cat_id");
	JTextField icat_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton iinsert=new JButton("Insert");
	JButton iexit=new JButton("Exit");
	public iitem_p()
	{
		getContentPane().setLayout(null);
		iid_l.setBounds(20,30,100,30);
		iid_t.setBounds(150,30,100,30);
		iname_l.setBounds(20,80,100,30);
		iname_t.setBounds(150,80,100,30);
		iupp_l.setBounds(20,130,100,30);
		iupp_t.setBounds(150,130,270,30);
		iups_l.setBounds(20,160,100,30);
		iups_t.setBounds(150,160,100,30);
		icat_l.setBounds(20,200,100,30);
		icat_t.setBounds(150,200,100,30);
		mainMenu.setBounds(20,500,100,30);
		iinsert.setBounds(150,500,100,30);
		iexit.setBounds(280,500,100,30);
		getContentPane().add(iid_l);
		getContentPane().add(iid_t);
		getContentPane().add(iname_l);
		getContentPane().add(iname_t);
		getContentPane().add(iupp_l);
		getContentPane().add(iupp_t);
		getContentPane().add(iups_l);
		getContentPane().add(iups_t);
		getContentPane().add(icat_l);
		getContentPane().add(icat_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(iinsert);
		iinsert.addActionListener(this);
		getContentPane().add(iexit);
		iexit.addActionListener(this);
		setTitle("Insert data in Supplier Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(iexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(iinsert))
		{
			String s1,s2,s5;
			double p3,p4;
			s1=iid_t.getText();
			s2=iname_t.getText();
			p3=Double.parseDouble(iupp_t.getText());
			p4=Double.parseDouble(iups_t.getText());
			s5=icat_t.getText();
			System.out.println(s1+s2+p3+p4+s5);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("insert into item values(?,?,?,?,?)");
				pstmt.setString(1,s1);
				pstmt.setString(2,s2);
				pstmt.setDouble(3,p3);
				pstmt.setDouble(4,p4);
				pstmt.setString(5,s5);
				pstmt.executeUpdate();
				con.close();
				
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame
class uitem_p extends JFrame implements ActionListener
{
	JLabel iid_l=new JLabel("Item_id");
	JLabel iname_l=new JLabel("Iname");
	JTextField iid_t=new JTextField(10);
	JTextField iname_t=new JTextField(10);
	JLabel iupp_l=new JLabel("IUnit_Price_Purchase");
	JLabel iups_l=new JLabel("IUnit_Price_Sales");
	JTextField iupp_t=new JTextField(30);
	JTextField iups_t=new JTextField(10);
	JLabel icat_l=new JLabel("Icat_Id");
	JTextField icat_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton inext=new JButton("Next");
	JButton iupdate=new JButton("Update");
	JButton iexit=new JButton("Exit");
	public uitem_p()
	{
		getContentPane().setLayout(null);
		iid_l.setBounds(20,30,100,30);
		iid_t.setBounds(150,30,100,30);
		iname_l.setBounds(20,80,100,30);
		iname_t.setBounds(150,80,100,30);
		iupp_l.setBounds(20,130,100,30);
		iupp_t.setBounds(150,130,270,30);
		iups_l.setBounds(20,160,100,30);
		iups_t.setBounds(150,160,100,30);
		icat_l.setBounds(20,200,100,30);
		icat_t.setBounds(150,200,100,30);
		mainMenu.setBounds(20,500,100,30);
		inext.setBounds(150,500,100,30);
		iupdate.setBounds(280,500,100,30);
		iexit.setBounds(410,500,100,30);
		getContentPane().add(iid_l);
		getContentPane().add(iid_t);
		getContentPane().add(iname_l);
		getContentPane().add(iname_t);
		getContentPane().add(iupp_l);
		getContentPane().add(iupp_t);
		getContentPane().add(iups_l);
		getContentPane().add(iups_t);
		getContentPane().add(icat_l);
		getContentPane().add(icat_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(inext);
		inext.addActionListener(this);
		getContentPane().add(iupdate);
		iupdate.addActionListener(this);
		getContentPane().add(iexit);
		iexit.addActionListener(this);
		iname_t.setEnabled(false);
		iupp_t.setEnabled(false);
		iups_t.setEnabled(false);
		icat_t.setEnabled(false);
		iupdate.setEnabled(false);
		setTitle("Updade data in Item Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(iexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}	
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if	
		if(e.getSource().equals(inext))
		{
			String p1,s2,s3,s4,s5;
			p1=iid_t.getText();
			iid_t.setEnabled(false);
			iname_t.setEnabled(true);
			iupp_t.setEnabled(true);
			iups_t.setEnabled(true);
			icat_t.setEnabled(true);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement s=con.createStatement();	
				PreparedStatement pstmt=con.prepareStatement("select * from item where i_id=(?) ");
				pstmt.setString(1,p1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					s2=(rs.getString(2));
					s3=rs.getString(3);
					s4=(rs.getString(4));
					s5=rs.getString(5);
					iname_t.setText(s2);
					iupp_t.setText(s3);
					iups_t.setText(s4);
					icat_t.setText(s5);	
				}
				iupdate.setEnabled(true);
				inext.setEnabled(false);
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
		if(e.getSource().equals(iupdate))
		{
			String s2,p1,s5;
			double p3,p4;
			iid_t.setEnabled(true);
			p1=iid_t.getText();
			iid_t.setEnabled(false);
			s2=iname_t.getText();
			p3=Double.parseDouble(iupp_t.getText());
			p4=Double.parseDouble(iups_t.getText());
			s5=icat_t.getText();
			System.out.println(s2+p3+p4+s5+p1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("UPDATE item SET iname=?,iunitprice_p=?,iunitprice_s=?,cat_id=? where i_id=?");
				pstmt.setString(1,s2);
				pstmt.setDouble(2,p3);
				pstmt.setDouble(3,p4);
				pstmt.setString(4,s5);
				pstmt.setString(5,p1);
				pstmt.executeUpdate();
				con.close();
				
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	
	}//action
}//frame

//======================
class ditem_p extends JFrame implements ActionListener
{
	JLabel iid_l=new JLabel("Item_id");
	JTextField iid_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton idelete=new JButton("Delete");
	JButton iexit=new JButton("Exit");
	public ditem_p()
	{
		getContentPane().setLayout(null);
		iid_l.setBounds(20,30,100,30);
		iid_t.setBounds(150,30,100,30);
		mainMenu.setBounds(20,500,100,30);
		idelete.setBounds(150,500,100,30);
		iexit.setBounds(280,500,100,30);
		getContentPane().add(iid_l);
		getContentPane().add(iid_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(idelete);
		idelete.addActionListener(this);
		getContentPane().add(iexit);
		iexit.addActionListener(this);
		setTitle("Delete data in Item Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(iexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(idelete))
		{
			String s1;
			s1=iid_t.getText();
			System.out.println(s1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("delete *from item where i_id=(?)");
				pstmt.setString(1,s1);
				pstmt.executeUpdate();
				con.close();
				
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame

class icat_p extends JFrame implements ActionListener
{
	JLabel catid_l=new JLabel("cat_id");
	JLabel catname_l=new JLabel("categary");
	JTextField catid_t=new JTextField(10);
	JTextField catname_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton catinsert=new JButton("Insert");
	JButton catexit=new JButton("Exit");
	public icat_p()
	{
		getContentPane().setLayout(null);
		catid_l.setBounds(20,30,100,30);
		catid_t.setBounds(150,30,100,30);
		catname_l.setBounds(20,80,100,30);
		catname_t.setBounds(150,80,100,30);
		mainMenu.setBounds(20,500,100,30);
		catinsert.setBounds(150,500,100,30);
		catexit.setBounds(280,500,100,30);
		getContentPane().add(catid_l);
		getContentPane().add(catid_t);
		getContentPane().add(catname_l);
		getContentPane().add(catname_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(catinsert);
		catinsert.addActionListener(this);
		getContentPane().add(catexit);
		catexit.addActionListener(this);
		setTitle("Insert data in categary Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(catexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);	
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(catinsert))
		{
			String s1,s2;
			s1=catid_t.getText();
			s2=catname_t.getText();
			System.out.println(s1+s2);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("insert into categary values(?,?)");
				pstmt.setString(1,s1);
				pstmt.setString(2,s2);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame
class ucat_p extends JFrame implements ActionListener
{
	JLabel catid_l=new JLabel("Cat_id");
	JLabel catname_l=new JLabel("Categary");
	JTextField catid_t=new JTextField(10);
	JTextField catname_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton catnext=new JButton("Next");
	JButton catupdate=new JButton("Update");
	JButton catexit=new JButton("Exit");
	public ucat_p()
	{
		getContentPane().setLayout(null);
		catid_l.setBounds(20,30,100,30);
		catid_t.setBounds(150,30,100,30);
		catname_l.setBounds(20,80,100,30);
		catname_t.setBounds(150,80,100,30);
		mainMenu.setBounds(20,500,100,30);
		catnext.setBounds(150,500,100,30);
		catupdate.setBounds(280,500,100,30);
		catexit.setBounds(410,500,100,30);
		getContentPane().add(catid_l);
		getContentPane().add(catid_t);
		getContentPane().add(catname_l);
		getContentPane().add(catname_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(catnext);
		catnext.addActionListener(this);
		getContentPane().add(catupdate);
		catupdate.addActionListener(this);
		getContentPane().add(catexit);
		catexit.addActionListener(this);
		catname_t.setEnabled(false);	
		catupdate.setEnabled(false);
		setTitle("Updade data in categary Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(catexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{	
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if	
		if(e.getSource().equals(catnext))
		{
			String p1,s2;
			p1=catid_t.getText();
			catid_t.setEnabled(false);
			catname_t.setEnabled(true);
			try	
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}	
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("select * from categary where cat_id=(?) ");
				pstmt.setString(1,p1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					s2=(rs.getString(2));
					catname_t.setText(s2);
				}
				catupdate.setEnabled(true);
				catnext.setEnabled(false);	
				con.close();
			}
			catch(SQLException ce)
			{		
				System.out.println(ce);
			}
		}//if
		if(e.getSource().equals(catupdate))
		{
			String s2,p1;
			catid_t.setEnabled(true);
			p1=catid_t.getText();
			catid_t.setEnabled(false);
			s2=catname_t.getText();
			System.out.println(s2+p1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);	
				PreparedStatement pstmt=con.prepareStatement("UPDATE categary SET categary=? where cat_id=?");
				pstmt.setString(1,s2);
				pstmt.setString(2,p1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{	
				System.out.println(ce);
			}
		}//if
	
	}//action
}//frame

class dcat_p extends JFrame implements ActionListener
{
	JLabel catid_l=new JLabel("Cat_id");
	JTextField catid_t=new JTextField(10);
	JButton mainMenu=new JButton("Main Menu");
	JButton catdelete=new JButton("Delete");
	JButton catexit=new JButton("Exit");
	public dcat_p()
	{
		getContentPane().setLayout(null);
		catid_l.setBounds(20,30,100,30);
		catid_t.setBounds(150,30,100,30);
		mainMenu.setBounds(20,500,100,30);
		catdelete.setBounds(150,500,100,30);
		catexit.setBounds(280,500,100,30);
		getContentPane().add(catid_l);
		getContentPane().add(catid_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(catdelete);
		catdelete.addActionListener(this);
		getContentPane().add(catexit);
		catexit.addActionListener(this);
		setTitle("Delete data in categary Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(catexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{	
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{	
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(catdelete))
		{
			String s1;
			s1=catid_t.getText();
			System.out.println(s1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}	
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("delete *from categary where cat_id=(?)");
				pstmt.setString(1,s1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame

class isupitem_p extends JFrame implements ActionListener
{
	JLabel sname_l=new JLabel("Suppliers");
	JLabel iname_l=new JLabel("Items");
	JComboBox sid_c=new JComboBox();
	JComboBox iid_c=new JComboBox();
	JButton mainMenu=new JButton("Main Menu");
	JButton supitemdata=new JButton("data");
	JButton supitemselect=new JButton("Select");
	JButton supiteminsert=new JButton("Insert");
	JButton supitemexit=new JButton("Exit");
	String x1,x2;
	public isupitem_p()
	{
		getContentPane().setLayout(null);
		sname_l.setBounds(20,30,100,30);
		sid_c.setBounds(150,30,100,30);
		iname_l.setBounds(20,80,100,30);
		iid_c.setBounds(150,80,100,30);
		mainMenu.setBounds(20,500,100,30);
		supitemdata.setBounds(150,500,100,30);
		supitemselect.setBounds(280,500,100,30);
		supiteminsert.setBounds(410,500,100,30);
		supitemexit.setBounds(540,500,100,30);
		getContentPane().add(sname_l);
		getContentPane().add(sid_c);
		getContentPane().add(iname_l);
		getContentPane().add(iid_c);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(supitemdata);
		supitemdata.addActionListener(this);
		getContentPane().add(supitemselect);
		supitemselect.addActionListener(this);
		getContentPane().add(supiteminsert);
		supiteminsert.addActionListener(this);
		getContentPane().add(supitemexit);
		supitemexit.addActionListener(this);
		setTitle("Insert data in Supplier_Item Table");
		supitemselect.setEnabled(false);
		supiteminsert.setEnabled(false);
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(supitemexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(supitemdata))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);		
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select sname from supplier";	
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					sid_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select iname from item";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					iid_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			supitemdata.setEnabled(false);
			supitemselect.setEnabled(true);
		}//if
	
		if(e.getSource().equals(supitemselect))
		{
			x1=(String) sid_c.getSelectedItem();
			x2=(String) iid_c.getSelectedItem();
			sid_c.setEnabled(false);
			iid_c.setEnabled(false);
			System.out.println(x1+x2);
			supiteminsert.setEnabled(true);
			supitemselect.setEnabled(false);
		}
		if(e.getSource().equals(supiteminsert))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}		
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select s_id from supplier where sname=? ");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x1=(rs.getString(1));
				}
				con.close();	
			}	
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select i_id from item where iname=? ");
				pstmt.setString(1,x2);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x2=(rs.getString(1));
					System.out.println(x2);
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into supplier_item values(?,?)");
				pstmt.setString(1,x1);
				pstmt.setString(2,x2);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			supiteminsert.setEnabled(false);
		}//if
	}//action
}//frame
class dsupitem_p extends JFrame implements ActionListener
{
	JLabel sid_l=new JLabel("Suppliers_id");
	JLabel iid_l=new JLabel("Items_id");
	JComboBox sid_c=new JComboBox();
	JComboBox iid_c=new JComboBox();
	JButton mainMenu=new JButton("Main Menu");
	JButton supitemdata=new JButton("data");
	JButton supitemselect=new JButton("Select");
	JButton supitemdelete=new JButton("Delete");
	JButton supitemexit=new JButton("Exit");
	String x1,x2;
	public dsupitem_p()
	{
		getContentPane().setLayout(null);
		sid_l.setBounds(20,30,100,30);
		sid_c.setBounds(150,30,100,30);
		iid_l.setBounds(20,80,100,30);
		iid_c.setBounds(150,80,100,30);
		mainMenu.setBounds(20,500,100,30);
		supitemdata.setBounds(150,500,100,30);
		supitemselect.setBounds(280,500,100,30);
		supitemdelete.setBounds(410,500,100,30);
		supitemexit.setBounds(540,500,100,30);
		getContentPane().add(sid_l);
		getContentPane().add(sid_c);
		getContentPane().add(iid_l);
		getContentPane().add(iid_c);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(supitemdata);
		supitemdata.addActionListener(this);
		getContentPane().add(supitemselect);
		supitemselect.addActionListener(this);
		getContentPane().add(supitemdelete);
		supitemdelete.addActionListener(this);
		getContentPane().add(supitemexit);
		supitemexit.addActionListener(this);
		setTitle("Insert data in Supplier_Item Table");
		supitemselect.setEnabled(false);
		supitemdelete.setEnabled(false);
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)	
	{
		if(e.getSource().equals(supitemexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{	
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(supitemdata))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select * from supplier_item";
				ResultSet rs=s.executeQuery(sql);	
				while(rs.next())
				{
					sid_c.addItem(rs.getString(1));
					iid_c.addItem(rs.getString(2));	
				}	
				con.close();
			}
			catch(SQLException ce)
			{	
				System.out.println(ce);
			}
			supitemdata.setEnabled(false);
			supitemselect.setEnabled(true);
		}//if
		if(e.getSource().equals(supitemselect))
		{
			x1=(String) sid_c.getSelectedItem();
			x2=(String) iid_c.getSelectedItem();
			sid_c.setEnabled(false);
			iid_c.setEnabled(false);
			System.out.println(x1+x2);
			supitemdelete.setEnabled(true);
			supitemselect.setEnabled(false);
		}
		if(e.getSource().equals(supitemdelete))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}	
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("delete * from supplier_item where s_id=? and i_id=? ");	
				pstmt.setString(1,x1);	
				pstmt.setString(2,x2);
				pstmt.executeUpdate();
				con.close();
			}	
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			supitemdelete.setEnabled(false);
		}//if	
	}//action
}//frame

class istock_p extends JFrame implements ActionListener
{
	JLabel iname_l=new JLabel("Items");
	JLabel iqty_l=new JLabel("Quantity");
	JComboBox iid_c=new JComboBox();
	JTextField iqty_t=new JTextField();
	JButton mainMenu=new JButton("Main Menu");
	JButton stockdata=new JButton("data");
	JButton stockselect=new JButton("Select");
	JButton stockinsert=new JButton("Insert");
	JButton stockexit=new JButton("Exit");
	String x1,x2;
	public istock_p()
	{
		getContentPane().setLayout(null);
		iname_l.setBounds(20,30,100,30);
		iid_c.setBounds(150,30,100,30);	
		iqty_l.setBounds(20,80,100,30);
		iqty_t.setBounds(150,80,100,30);
		mainMenu.setBounds(20,500,100,30);
		stockdata.setBounds(150,500,100,30);
		stockselect.setBounds(280,500,100,30);
		stockinsert.setBounds(410,500,100,30);
		stockexit.setBounds(540,500,100,30);
		getContentPane().add(iname_l);
		getContentPane().add(iid_c);
		getContentPane().add(iqty_l);
		getContentPane().add(iqty_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(stockdata);
		stockdata.addActionListener(this);
		getContentPane().add(stockselect);
		stockselect.addActionListener(this);
		getContentPane().add(stockinsert);
		stockinsert.addActionListener(this);
		getContentPane().add(stockexit);
		stockexit.addActionListener(this);
		setTitle("Insert data in Stock Table");
		stockselect.setEnabled(false);
		stockinsert.setEnabled(false);
		setVisible(true);
		setSize(800,800);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(stockexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(stockdata))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select iname from item";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					iid_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			stockdata.setEnabled(false);
			stockselect.setEnabled(true);
		}//if
		if(e.getSource().equals(stockselect))
		{
			x1=(String) iid_c.getSelectedItem();
			x2=iqty_t.getText();
			iid_c.setEnabled(false);
			iqty_t.setEnabled(false);
			System.out.println(x1+x2);
			stockinsert.setEnabled(true);
			stockselect.setEnabled(false);
		}
		if(e.getSource().equals(stockinsert))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("select i_id from item where iname=? ");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x1=(rs.getString(1));
					System.out.println(x1);
				}	
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into stock values(?,?)");
				pstmt.setString(1,x1);
				pstmt.setString(2,x2);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			//stockdata.setEnabled(true);
			stockinsert.setEnabled(false);
		}//if
	}//action
}//frame
class ustock_p extends JFrame implements ActionListener
{
	JLabel iname_l=new JLabel("Items");
	JLabel iqtyold_l=new JLabel("Quantity old");
	JLabel iqtynew_l=new JLabel("Quantity new");
	JComboBox iid_c=new JComboBox();
	JTextField iqtyold_t=new JTextField();
	JTextField iqtynew_t=new JTextField();
	JButton mainMenu=new JButton("Main Menu");
	JButton stockdata=new JButton("data");
	JButton stockselect=new JButton("Select");
	JButton stocknext=new JButton("Next");
	JButton stockupdate=new JButton("Update");
	JButton stockexit=new JButton("Exit");
	String x1;
	long x2,qty,x3;
	public ustock_p()
	{
		getContentPane().setLayout(null);
		iname_l.setBounds(20,30,100,30);
		iid_c.setBounds(150,30,100,30);
		iqtyold_l.setBounds(20,80,100,30);
		iqtyold_t.setBounds(150,80,100,30);
		iqtynew_l.setBounds(20,130,100,30);
		iqtynew_t.setBounds(150,130,100,30);
		mainMenu.setBounds(20,500,100,30);
		stockdata.setBounds(150,500,100,30);
		stockselect.setBounds(280,500,100,30);
		stocknext.setBounds(410,500,100,30);
		stockupdate.setBounds(530,500,100,30);
		stockexit.setBounds(640,500,100,30);
		getContentPane().add(iname_l);
		getContentPane().add(iid_c);
		getContentPane().add(iqtyold_l);
		getContentPane().add(iqtyold_t);
		getContentPane().add(iqtynew_l);
		getContentPane().add(iqtynew_t);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(stockdata);
		stockdata.addActionListener(this);
		getContentPane().add(stockselect);
		stockselect.addActionListener(this);
		getContentPane().add(stocknext);
		stocknext.addActionListener(this);
		getContentPane().add(stockupdate);
		stockupdate.addActionListener(this);
		getContentPane().add(stockexit);
		stockexit.addActionListener(this);
		setTitle("update data in Stock Table");
		stockselect.setEnabled(false);
		stockupdate.setEnabled(false);
		iqtynew_t.setText("0");
		iqtyold_t.setEnabled(false);
		iqtynew_t.setEnabled(false);
		stocknext.setEnabled(false);
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(stockexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)	
			{
				System.out.println("exception"+p);
			}
		}//if	
		if(e.getSource().equals(stockdata))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select iname from item";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					iid_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			stockdata.setEnabled(false);
			stockselect.setEnabled(true);
		}//if
		if(e.getSource().equals(stockselect))
		{
			x1=(String) iid_c.getSelectedItem();
			//x2=iqty_t.getText();
			iid_c.setEnabled(false);
			//iqty_t.setEnabled(false);
			//System.out.println(x1+x2);
			stocknext.setEnabled(true);
			stockupdate.setEnabled(false);
			stockselect.setEnabled(false);
		}
		if(e.getSource().equals(stocknext))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{	
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select * from item where iname=? ");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x1=(rs.getString(1));
					System.out.println(x1);
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select * from stock where i_id=? ");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					//iidno.setText(rs.getString(1));
					x1=(rs.getString(1));
					iqtyold_t.setText(rs.getString(2));
					//System.out.println(x1);
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			stocknext.setEnabled(false);
			stockupdate.setEnabled(true);
			iqtynew_t.setEnabled(true);
		}//if next
		if(e.getSource().equals(stockupdate))
		{
			x3=0;
			x2=Long.parseLong(iqtyold_t.getText());
			x3=Long.parseLong(iqtynew_t.getText());
			System.out.println(x2);
			System.out.println(x3);
			qty=x2+x3;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("UPDATE stock SET qty=? where i_id=?");
				pstmt.setDouble(1,qty);
				pstmt.setString(2,x1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
		}//if
	}//action
}//frame

class purchase_p extends JFrame implements ActionListener
{
	String x1,x2,x3;
	String x4;//p_id
	String s1;//s_id
	String st;//status
	int st1;//status value
	double a3=0;//unit price
	double qt,qt_old;//quantity current &old
	double total=0;//total amount
	double bal;//balance
	double pad;//paid
	double curropen;//current opening balance
	JLabel pid_l=new JLabel("Purchase_id");
	JButton curropen_b=new JButton("current_balance");
	JTextField curropen_t=new JTextField(10);
	JLabel sid_l=new JLabel("Supplier_id");
	JLabel item_l=new JLabel("Item");
	JLabel qty_l=new JLabel("Quantity");
	JLabel total_amount_l=new JLabel("Total_Amount");
	JLabel paid_l=new JLabel("Paid_Amount");
	JLabel balance_l=new JLabel("Balance_Amount");
	JLabel status_l=new JLabel("Status");
	JTextField pid_t=new JTextField(10);
	JTextField sid_t=new JTextField(10);
	JComboBox item_c=new JComboBox();
	JTextField qty_t=new JTextField(10);
	JTextField total_amount_t=new JTextField(10);
	JTextField paid_t=new JTextField(10);
	JTextField balance_t=new JTextField(10);
	JTextField status_t=new JTextField(10);
	JButton check=new JButton("Check");
	JButton data=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton cal=new JButton("Calculate");
	JButton padd=new JButton("Add");
	JButton mainMenu=new JButton("Main Menu");
	JButton submit=new JButton("Submit");
	JButton ubalance=new JButton("Update_Balance");
	JButton sexit=new JButton("Exit");
	public purchase_p()
	{
		getContentPane().setLayout(null);
		pid_l.setBounds(20,30,100,30);
		pid_t.setBounds(150,30,100,30);
		curropen_b.setBounds(280,30,150,30);
		curropen_t.setBounds(450,30,100,30);
		sid_l.setBounds(20,80,100,30);
		sid_t.setBounds(150,80,100,30);
		check.setBounds(280,80,100,30);
		item_l.setBounds(20,130,100,30);
		item_c.setBounds(150,130,100,30);
		qty_l.setBounds(280,130,60,30);
		qty_t.setBounds(370,130,60,30);
		data.setBounds(460,130,60,30);
		select.setBounds(550,130,90,30);
		done.setBounds(650,130,90,30);
		total_amount_l.setBounds(20,160,100,30);
		total_amount_t.setBounds(150,160,100,30);
		paid_l.setBounds(20,200,100,30);
		paid_t.setBounds(150,200,100,30);
		balance_l.setBounds(20,240,100,30);
		balance_t.setBounds(150,240,100,30);
		cal.setBounds(280,240,100,30);
		status_l.setBounds(20,280,100,30);
		status_t.setBounds(150,280,100,30);
		padd.setBounds(280,280,100,30);
		mainMenu.setBounds(20,500,100,30);
		submit.setBounds(150,500,100,30);
		ubalance.setBounds(280,500,170,30);
		sexit.setBounds(470,500,100,30);
		getContentPane().add(pid_l);
		getContentPane().add(pid_t);
		getContentPane().add(curropen_t);
		getContentPane().add(sid_l);
		getContentPane().add(sid_t);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(qty_l);
		getContentPane().add(qty_t);
		getContentPane().add(total_amount_l);
		getContentPane().add(total_amount_t);
		getContentPane().add(paid_l);
		getContentPane().add(paid_t);
		getContentPane().add(balance_l);
		getContentPane().add(balance_t);
		getContentPane().add(status_l);
		getContentPane().add(status_t);
		getContentPane().add(curropen_b);
		curropen_b.addActionListener(this);
		getContentPane().add(check);
		check.addActionListener(this);
		getContentPane().add(data);
		data.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(cal);
		cal.addActionListener(this);
		getContentPane().add(padd);
		padd.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(submit);
		submit.addActionListener(this);
		getContentPane().add(ubalance);
		ubalance.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		balance_t.setText("0");
		status_t.setEnabled(false);
		balance_t.setEnabled(false);
		submit.setEnabled(false);
		ubalance.setEnabled(false);
		cal.setEnabled(false);
		padd.setEnabled(false);
		done.setEnabled(false);
		select.setEnabled(false);
		data.setEnabled(false);
		setTitle("Purchase data Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(curropen_b))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from balance ");
				ResultSet rs=pstmt.executeQuery();	
				while(rs.next())
				{
					curropen=Double.parseDouble(String.valueOf(rs.getString(2)));
					curropen_t.setText(String.valueOf(curropen));
				}
				con.close();
			}//try	
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			curropen_b.setEnabled(false);
			curropen_t.setEnabled(false);
		}//if
		if(e.getSource().equals(check))
		{
			String s3,s4,x9,x8;
			int temp=0;
			s1=sid_t.getText();
			x4=pid_t.getText();
			//System.out.println(s1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from purchase ");
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x9=String.valueOf(rs.getString(1));
					System.out.println(x9);
					if(x9.equals(x4))
					{
						temp=1;
					}
				}
				con.close();
				if(temp==1)
				{
					pid_t.setText(" ");
				}
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				temp=0;
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from supplier ");
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x8=String.valueOf(rs.getString(1));
					System.out.println(x8);
					if(x8.equals(s1))
					{
						temp=1;
					}
				}
				con.close();
				if(temp==0)
				{
					sid_t.setText(" ");
				}
			}//try
			catch(SQLException ce)
			{	
				System.out.println(ce);
			}
			try
			{	
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from supplier_check where s_id=(?)");
				pstmt.setString(1,s1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					s3=String.valueOf(rs.getInt(3));
					status_t.setText(s3);
					s4=String.valueOf(rs.getDouble(4));
					balance_t.setText(s4);
					status_t.setEnabled(false);
					balance_t.setEnabled(false);
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("delete * from supplier_check where s_id=? ");
				pstmt.setString(1,s1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			data.setEnabled(true);
		}//if
		if(e.getSource().equals(data))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();	
				//String sql="SELECT iname FROM item INNER JOIN (supplier INNER JOIN supplier_item ON supplier.s_id = supplier_item.s_id) ON item.i_id = supplier_item.i_id";
				//String sql="SELECT iname FROM item INNER JOIN (item INNER JOIN supplier_item ON item.i_id = supplier_item.i_id) ON supplier.s_id = supplier_item.s_id";
				//item.i_id = supplier_item.i_id";         supplier INNER JOIN supplier_item ON supplier.s_id = supplier_item.s_id
				String sql="select iname from item";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			check.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			x2=qty_t.getText();
			x4=pid_t.getText();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from item where iname=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x3=(rs.getString(1));
					a3=(rs.getDouble(3));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			qt=Double.parseDouble(x2);	
			total=total+(a3*qt);	
			total_amount_t.setText(String.valueOf(total));
			//System.out.println(total);
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from stock where i_id=(?)");
				pstmt.setString(1,x3);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					qt_old=(rs.getDouble(2));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			qt_old=qt_old+qt;
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("UPDATE stock SET qty=? where i_id=?");
				pstmt.setDouble(1,qt_old);
				pstmt.setString(2,x3);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into purchase_item values(?,?,?)");
				pstmt.setString(1,x4);
				pstmt.setString(2,x1);
				pstmt.setDouble(3,qt);
				pstmt.executeUpdate();	
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			done.setEnabled(true);
		}//if
		if(e.getSource().equals(done))
		{
			bal=Double.parseDouble(String.valueOf(balance_t.getText()));
			total=total+bal;
			total_amount_t.setText(String.valueOf(total));
			pid_t.setEnabled(false);
			sid_t.setEnabled(false);
			check.setEnabled(false);
			item_c.setEnabled(false);
			qty_t.setEnabled(false);
			data.setEnabled(false);
			select.setEnabled(false);
			done.setEnabled(false);
			total_amount_t.setEnabled(false);
			cal.setEnabled(true);
		}//if
		if(e.getSource().equals(cal))
		{
			pad=Double.parseDouble(String.valueOf(paid_t.getText()));
			bal=total-pad;
			balance_t.setText(String.valueOf(bal));
			if(bal==0)
			{		
				status_t.setText("0");
				st=status_t.getText();
				st1=Integer.parseInt(st);
				cal.setEnabled(false);
				padd.setEnabled(false);
				submit.setEnabled(true);
			}
			else
			{
				status_t.setText("1");
				cal.setEnabled(false);
				padd.setEnabled(true);
			}
		}//if
		if(e.getSource().equals(padd))
		{
			s1=sid_t.getText();
			st=status_t.getText();
			st1=Integer.parseInt(st);
			balance_t.setText(String.valueOf(bal));
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into supplier_check values(?,?,?,?)");
				pstmt.setString(1,x4);
				pstmt.setString(2,s1);
				pstmt.setInt(3,st1);
				pstmt.setDouble(4,bal);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			padd.setEnabled(false);
			submit.setEnabled(true);
		}//if	
		if(e.getSource().equals(submit))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into purchase values(?,?,?,?,?,?)");
				pstmt.setString(1,x4);		
				pstmt.setString(2,s1);
				pstmt.setDouble(3,total);
				pstmt.setDouble(4,pad);
				pstmt.setDouble(5,bal);
				pstmt.setInt(6,st1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			submit.setEnabled(false);
			ubalance.setEnabled(true);
		}//if
		if(e.getSource().equals(ubalance))
		{
			double currclose;
			currclose=curropen-pad;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{	
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into balance values(?,?,?,?)");
				pstmt.setDouble(1,curropen);
				pstmt.setDouble(2,currclose);
				pstmt.setDouble(3,0);
				pstmt.setDouble(4,pad);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			ubalance.setEnabled(false);
		}//if
	}//action
}//frame

class sales_p extends JFrame implements ActionListener
{
	String date;//bill date
	String ad;//cadd
	String cat;//categary
	String ph;
	String x1,x2,x3;
	String x4;//p_id
	String s1;//s_id
	String st;//status
	int st1;//status value
	double a3=0;//unit price
	double qt,qt_old;//quantity current &old
	double total=0;//total amount
	double bal;//balance
	double pad;//paid
	double curropen;//current opening balance
	JLabel date_l=new JLabel("Date");
	JLabel billid_l=new JLabel("Bill_no");
	JButton curropen_b=new JButton("current_balance");
	JTextField curropen_t=new JTextField(10);
	JLabel cname_l=new JLabel("CustomerName");
	JLabel cadd_l=new JLabel("Add");
	JLabel cph_l=new JLabel("Phone no");
	JLabel ccat_l=new JLabel("Categary");
	JLabel item_l=new JLabel("Item");
	JLabel qty_l=new JLabel("Quantity");
	JLabel total_amount_l=new JLabel("Total_Amount");
	JLabel paid_l=new JLabel("Paid_Amount");
	JLabel balance_l=new JLabel("Balance_Amount");
	JLabel status_l=new JLabel("Status");
	JTextField date_t=new JTextField(10);
	JTextField billid_t=new JTextField(10);
	JTextField cname_t=new JTextField(10);
	JTextField cadd_t=new JTextField(10);
	JTextField cph_t=new JTextField(10);
	JTextField ccat_t=new JTextField(2);
	JComboBox item_c=new JComboBox();
	JTextField qty_t=new JTextField(10);
	JTextField total_amount_t=new JTextField(10);
	JTextField paid_t=new JTextField(10);
	JTextField balance_t=new JTextField(10);
	JTextField status_t=new JTextField(10);
	JButton ubalance=new JButton("Update_Balance");
	JButton check=new JButton("Check");
	JButton data=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton cal=new JButton("Calculate");
	JButton padd=new JButton("Add");
	JButton mainMenu=new JButton("Main Menu");
	JButton submit=new JButton("Submit");
	JButton sexit=new JButton("Exit");
	//java.util.Date d1;
	//SimpleDateFormat sdf;
	//sdf=new SimpleDateFormat("dd MMM YYYY");
	//date_t.setText(sdf.format(d1));
	public sales_p()
	{
		getContentPane().setLayout(null);
		date_l.setBounds(20,10,100,20);
		date_t.setBounds(150,10,120,20);
		billid_l.setBounds(20,30,100,30);
		billid_t.setBounds(150,30,100,30);
		curropen_b.setBounds(280,30,150,30);
		curropen_t.setBounds(450,30,100,30);	
		cname_l.setBounds(20,80,100,30);
		cname_t.setBounds(150,80,100,30);
		cadd_l.setBounds(260,80,40,30);
		cadd_t.setBounds(310,80,100,30);
		cph_l.setBounds(415,80,50,30);
		cph_t.setBounds(485,80,80,30);
		ccat_l.setBounds(575,80,70,30);
		ccat_t.setBounds(645,80,30,30);
		check.setBounds(680,80,100,30);
		item_l.setBounds(20,130,100,30);
		item_c.setBounds(150,130,100,30);
		qty_l.setBounds(280,130,60,30);
		qty_t.setBounds(370,130,60,30);
		data.setBounds(460,130,60,30);
		select.setBounds(550,130,90,30);
		done.setBounds(650,130,90,30);
		total_amount_l.setBounds(20,160,100,30);
		total_amount_t.setBounds(150,160,100,30);
		paid_l.setBounds(20,200,100,30);
		paid_t.setBounds(150,200,100,30);
		balance_l.setBounds(20,240,100,30);
		balance_t.setBounds(150,240,100,30);
		cal.setBounds(280,240,100,30);
		status_l.setBounds(20,280,100,30);
		status_t.setBounds(150,280,100,30);
		padd.setBounds(280,280,100,30);
		mainMenu.setBounds(20,500,100,30);
		submit.setBounds(150,500,100,30);
		ubalance.setBounds(280,500,170,30);
		sexit.setBounds(470,500,100,30);
		getContentPane().add(date_l);
		getContentPane().add(date_t);
		getContentPane().add(billid_l);
		getContentPane().add(billid_t);
		getContentPane().add(cname_l);
		getContentPane().add(cname_t);
		getContentPane().add(cadd_l);
		getContentPane().add(cadd_t);
		getContentPane().add(cph_l);
		getContentPane().add(cph_t);
		getContentPane().add(ccat_l);
		getContentPane().add(ccat_t);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(qty_l);
		getContentPane().add(qty_t);
		getContentPane().add(curropen_t);
		getContentPane().add(curropen_b);
		curropen_b.addActionListener(this);
		getContentPane().add(ubalance);
		ubalance.addActionListener(this);
		getContentPane().add(total_amount_l);
		getContentPane().add(total_amount_t);
		getContentPane().add(paid_l);
		getContentPane().add(paid_t);
		getContentPane().add(balance_l);
		getContentPane().add(balance_t);
		getContentPane().add(status_l);
		getContentPane().add(status_t);
		getContentPane().add(check);
		check.addActionListener(this);
		getContentPane().add(data);
		data.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(cal);
		cal.addActionListener(this);
		getContentPane().add(padd);
		padd.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(submit);
		submit.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		balance_t.setText("0.0");
		status_t.setEnabled(false);
		balance_t.setEnabled(false);
		submit.setEnabled(false);
		cal.setEnabled(false);
		padd.setEnabled(false);
		done.setEnabled(false);
		select.setEnabled(false);
		data.setEnabled(false);
		ubalance.setEnabled(false);
		java.util.Date d1;
		String d,date1,date2; 
		d1=new java.util.Date();
		d=d1.toString();                            //Sun Apr 20 16:39:25 GMT+05:30 2008
		date1=d.substring(4,(d.length()-4));
		date2=d.substring(29,(d.length()));
		date1=date1.substring(0,7);
		date2=date2.substring(0,5);
		date=(date1+date2);
		date_t.setText(date);
		date_t.setEnabled(false);
		setTitle("Sales data Table");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{	
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(curropen_b))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from balance ");
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					curropen=Double.parseDouble(String.valueOf(rs.getString(2)));
					curropen_t.setText(String.valueOf(curropen));
				}
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			curropen_b.setEnabled(false);
			curropen_t.setEnabled(false);
		}//if
		if(e.getSource().equals(check))
		{
			String s3,s4,x9;
			int temp=0;
			s1=cname_t.getText();
			x4=billid_t.getText();
			//System.out.println(s1);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill ");
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x9=String.valueOf(rs.getString(2));
					System.out.println(x9);
					if(x9.equals(x4))
					{
						temp=1;
					}
				}
				con.close();
				if(temp==1)
				{
					billid_t.setText(" ");
				}
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);//
				System.out.println(s1);
				PreparedStatement pstmt=con.prepareStatement("select * from customer_check where cname=?");
				pstmt.setString(1,s1);
				System.out.println(s1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					s3=String.valueOf(rs.getDouble(3));
					balance_t.setText(s3);
					s4=String.valueOf(rs.getInt(4));
					status_t.setText(s4);
					status_t.setEnabled(false);
					balance_t.setEnabled(false);
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("delete * from customer_check where cname=? ");
				pstmt.setString(1,s1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			data.setEnabled(true);
		}//if
		if(e.getSource().equals(data))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select iname from item";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			check.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			x2=qty_t.getText();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from item where iname=(?)");
				pstmt.setString(1,x1);
				System.out.println(x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x3=(rs.getString(1));
					a3=(rs.getDouble(4));
				}
				System.out.println(x3+a3);
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			qt=Double.parseDouble(x2);
			total=total+(a3*qt);
			total_amount_t.setText(String.valueOf(total));
			System.out.println(total+qt);
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from stock where i_id=(?)");
				pstmt.setString(1,x3);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					qt_old=(rs.getDouble(2));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			if(qt_old<qt)
				qty_t.setText("0");
			else
			{
				qt_old=qt_old-qt;
				try
				{
					String url="jdbc:odbc:project";
					Connection con = DriverManager.getConnection(url);
					PreparedStatement pstmt=con.prepareStatement("UPDATE stock SET qty=? where i_id=?");
					pstmt.setDouble(1,qt_old);
					pstmt.setString(2,x3);
					pstmt.executeUpdate();
					con.close();
				}
				catch(SQLException ce)
				{
					System.out.println(ce);
				}
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				}
				catch(ClassNotFoundException ce)
				{
					System.out.println(ce);
				}
				try
				{
					String url="jdbc:odbc:project";
					Connection con = DriverManager.getConnection(url);
					//Statement s=con.createStatement();	
					PreparedStatement pstmt=con.prepareStatement("insert into sales_item values(?,?,?,?)");
					pstmt.setString(1,x4);
					pstmt.setString(2,s1);
					pstmt.setString(3,x1);
					pstmt.setDouble(4,qt);
					pstmt.executeUpdate();
					con.close();
				}
				catch(SQLException ce)
				{
					System.out.println(ce);
				}
			}//else
			done.setEnabled(true);
		}//if
		if(e.getSource().equals(done))
		{
			bal=Double.parseDouble(String.valueOf(balance_t.getText()));
			total=total+bal;
			total_amount_t.setText(String.valueOf(total));
			billid_t.setEnabled(false);
			cname_t.setEnabled(false);
			cadd_t.setEnabled(false);
			cph_t.setEnabled(false);
			ccat_t.setEnabled(false);
			check.setEnabled(false);
			item_c.setEnabled(false);
			qty_t.setEnabled(false);
			data.setEnabled(false);
			select.setEnabled(false);
			done.setEnabled(false);
			total_amount_t.setEnabled(false);
			cal.setEnabled(true);
		}//if
		if(e.getSource().equals(cal))
		{
			pad=Double.parseDouble(String.valueOf(paid_t.getText()));
			bal=total-pad;
			balance_t.setText(String.valueOf(bal));
			if(bal==0)
			{
				status_t.setText("0");
				st=status_t.getText();
				st1=Integer.parseInt(st);
				submit.setEnabled(true);
			}
			else
			{
				status_t.setText("1");
				padd.setEnabled(true);
			}
			cal.setEnabled(false);
		}//if
		if(e.getSource().equals(padd))
		{
			s1=cname_t.getText();
			st=status_t.getText();
			st1=Integer.parseInt(st);
			balance_t.setText(String.valueOf(bal));
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into customer_check values(?,?,?,?)");
				pstmt.setString(1,x4);
				pstmt.setString(2,s1);
				pstmt.setDouble(3,bal);
				pstmt.setInt(4,st1);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			padd.setEnabled(false);
			submit.setEnabled(true);
		}//if
		if(e.getSource().equals(submit))
		{
			ad=cadd_t.getText();
			cat=ccat_t.getText();
			ph=cph_t.getText();
			long p;
			p=Long.parseLong(ph);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				System.out.println(date);
				System.out.println(x4);
				System.out.println(s1);
				System.out.println(ad);	
				System.out.println(p);
				System.out.println(cat);
				System.out.println(total);
				System.out.println(pad);
				System.out.println(bal);
				System.out.println(st1);
				PreparedStatement pstmt=con.prepareStatement("insert into customer_bill values(?,?,?,?,?,?,?,?,?,?)");
				pstmt.setString(1,date);
				pstmt.setString(2,x4);
				pstmt.setString(3,s1);
				pstmt.setString(4,ad);
				pstmt.setDouble(5,p);
				pstmt.setString(6,cat);
				pstmt.setDouble(7,total);
				pstmt.setDouble(8,pad);
				pstmt.setDouble(9,bal);
				pstmt.setInt(10,st1);	
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			submit.setEnabled(false);
			ubalance.setEnabled(true);
		}//if
		if(e.getSource().equals(ubalance))
		{
			double currclose;
			currclose=curropen+pad;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				//Statement s=con.createStatement();
				PreparedStatement pstmt=con.prepareStatement("insert into balance values(?,?,?,?)");
				pstmt.setDouble(1,curropen);
				pstmt.setDouble(2,currclose);
				pstmt.setDouble(3,pad);
				pstmt.setDouble(4,0);
				pstmt.executeUpdate();
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			ubalance.setEnabled(false);
		}//if
	}//action
}//frame

class hospital_p extends JFrame implements ActionListener
{
	String x1;
	int cont=0;
	String s1,s2;
	long s3;
	JLabel item_l=new JLabel("Hospital_Name");
	JComboBox item_c=new JComboBox();
	JButton data1=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton mainMenu=new JButton("Main Menu");
	JButton sexit=new JButton("Exit");
	JPanel p1;

	public hospital_p()
	{
		getContentPane().setLayout(null);
		p1=new JPanel();
		item_l.setBounds(20,30,100,30);
		item_c.setBounds(150,30,100,30);
		data1.setBounds(460,30,60,30);	
		select.setBounds(550,30,90,30);
		done.setBounds(650,30,90,30);
		p1.setBounds(10,90,400,100);
		mainMenu.setBounds(20,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(data1);
		data1.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		select.setEnabled(false);
		done.setEnabled(false);
		setTitle("Hospitalwise Customer Report");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
		System.exit(0);	
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(data1))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select cname from customer_bill where cat='h' or cat='H' ";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}	
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			data1.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill where cname=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					cont++;
				}//while
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			done.setEnabled(true);
			select.setEnabled(false);
		}//if
		if(e.getSource().equals(done))
		{
			x1=(String) item_c.getSelectedItem();
			String x2;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill where cname=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				int cc=3;//rsmd.getColumnCount();
				int rc=cont;//rsmd.getRowCount();
				GridLayout gl=new GridLayout();
				gl.setColumns(cc);
				gl.setRows(rc+1);
				p1.setLayout(gl);
				for(int i=1;i<=cc;i++)
				{
					x2=rsmd.getColumnName(i+2);
					p1.add(new JLabel(x2));
				}
				while(rs.next())
				{
					s1=rs.getString(3);
					s2=rs.getString(4);
					s3=rs.getLong(5);
					p1.add(new JLabel(s1));
					p1.add(new JLabel(s2));	
					p1.add(new JLabel(String.valueOf(s3)));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			getContentPane().add(p1);
			done.setEnabled(false);	
			item_c.setEnabled(false);
			setVisible(true);
			setSize(800,800);
		}//if
	}//action
}//frame

class indi_p extends JFrame implements ActionListener
{
	String x1;
	int cont=0;
	String s1,s2;
	long s3;
	JLabel item_l=new JLabel("Customer_Name");
	JComboBox item_c=new JComboBox();
	JButton data1=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton mainMenu=new JButton("Main Menu");
	JButton sexit=new JButton("Exit");
	JPanel p1;
	public indi_p()
	{
		getContentPane().setLayout(null);
		p1=new JPanel();
		item_l.setBounds(20,30,100,30);
		item_c.setBounds(150,30,100,30);
		data1.setBounds(460,30,60,30);
		select.setBounds(550,30,90,30);
		done.setBounds(650,30,90,30);
		p1.setBounds(10,90,400,100);
		mainMenu.setBounds(20,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(data1);
		data1.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		select.setEnabled(false);
		done.setEnabled(false);
		setTitle("Indiviualwise Customer Report");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(data1))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select cname from customer_bill where cat='c' or cat='C' ";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			data1.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}	
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill where cname=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{	
					cont++;
				}//while
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			done.setEnabled(true);
			select.setEnabled(false);
		}//if
		if(e.getSource().equals(done))
		{
			x1=(String) item_c.getSelectedItem();
			String x2;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill where cname=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				int cc=3;//rsmd.getColumnCount();
				int rc=cont;//rsmd.getRowCount();
				GridLayout gl=new GridLayout();
				gl.setColumns(cc);
				gl.setRows(rc+1);
				p1.setLayout(gl);
				for(int i=1;i<=cc;i++)
				{
					x2=rsmd.getColumnName(i+2);
					p1.add(new JLabel(x2));
				}
				while(rs.next())
				{
					s1=rs.getString(3);
					s2=rs.getString(4);
					s3=rs.getLong(5);
					p1.add(new JLabel(s1));
					p1.add(new JLabel(s2));
					p1.add(new JLabel(String.valueOf(s3)));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			getContentPane().add(p1);
			done.setEnabled(false);
			item_c.setEnabled(false);
			setVisible(true);
			setSize(800,800);
		}//if	
	}//action
}//frame

class city_p extends JFrame implements ActionListener
{
	String x1,x3;
	int cont=0;
	String s1,s2,s3,s4;
	long s5;
	JLabel item_l=new JLabel("Item");
	JComboBox item_c=new JComboBox();
	JButton data1=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton mainMenu=new JButton("Main Menu");
	JButton submit=new JButton("Submit");
	JButton sexit=new JButton("Exit");
	JPanel p1;
	public city_p()
	{
		getContentPane().setLayout(null);
		p1=new JPanel();
		item_l.setBounds(20,30,100,30);
		item_c.setBounds(150,30,100,30);
		data1.setBounds(460,30,60,30);
		select.setBounds(550,30,90,30);
		done.setBounds(650,30,90,30);
		p1.setBounds(10,90,450,230);
		mainMenu.setBounds(20,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(data1);
		data1.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		select.setEnabled(false);
		done.setEnabled(false);
		setTitle("Citywise supplier Report");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(data1))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select scity from supplier ";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			data1.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from supplier where scity=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					cont++;
				}//while
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			done.setEnabled(true);
			select.setEnabled(false);
		}//if
		if(e.getSource().equals(done))
		{
			x1=(String) item_c.getSelectedItem();
			String x2;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from supplier where scity=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				int cc=rsmd.getColumnCount();
				int rc=cont;//rsmd.getRowCount();
				GridLayout gl=new GridLayout();
				gl.setColumns(cc);
				gl.setRows(rc+1);
				p1.setLayout(gl);
				for(int i=1;i<=cc;i++)
				{
					x2=rsmd.getColumnName(i);
					p1.add(new JLabel(x2));
				}	
				while(rs.next())
				{
					s1=rs.getString(1);
					s2=rs.getString(2);
					s3=rs.getString(3);
					s4=rs.getString(4);
					s5=rs.getLong(5);
					p1.add(new JLabel(s1));
					p1.add(new JLabel(s2));
					p1.add(new JLabel(s3));
					p1.add(new JLabel(s4));
					p1.add(new JLabel(String.valueOf(s5)));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			getContentPane().add(p1);
			done.setEnabled(false);
			setVisible(true);
			setSize(800,800);
		}//if
	}//action
}//frame

class date_s_p extends JFrame implements ActionListener
{
	String x1;
	int cont=0;
	String s1,s2;
	double s3,s4,s5;
	JLabel item_l=new JLabel("Date");
	JComboBox item_c=new JComboBox();
	JButton data1=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton mainMenu=new JButton("Main Menu");
	JButton submit=new JButton("Submit");
	JButton sexit=new JButton("Exit");
	JPanel p1;
	
	public date_s_p()
	{
		getContentPane().setLayout(null);
		p1=new JPanel();
		item_l.setBounds(20,30,100,30);
		item_c.setBounds(150,30,150,30);
		data1.setBounds(460,30,60,30);
		select.setBounds(550,30,90,30);
		done.setBounds(650,30,90,30);
		p1.setBounds(10,90,450,230);
		mainMenu.setBounds(20,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(data1);
		data1.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		select.setEnabled(false);
		done.setEnabled(false);
		setTitle("Datewise Sales Report");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(data1))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select date from customer_bill ";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			data1.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill where date=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					cont++;
				}//while
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			done.setEnabled(true);
			select.setEnabled(false);
		}//if
		if(e.getSource().equals(done))
		{
			x1=(String) item_c.getSelectedItem();
			String x2;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from customer_bill where date=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				int cc=5;//rsmd.getColumnCount();
				int rc=cont;//rsmd.getRowCount();
				GridLayout gl=new GridLayout();
				gl.setColumns(cc);	
				gl.setRows(rc+1);
				p1.setLayout(gl);
				for(int i=2;i<=3;i++)
				{
					x2=rsmd.getColumnName(i);
					p1.add(new JLabel(x2));
				}
				for(int i=7;i<=9;i++)
				{
					x2=rsmd.getColumnName(i);
					p1.add(new JLabel(x2));
				}
				while(rs.next())
				{
					s1=rs.getString(2);
					s2=rs.getString(3);
					s3=rs.getDouble(7);
					s4=rs.getDouble(8);
					s5=rs.getDouble(9);
					p1.add(new JLabel(s1));
					p1.add(new JLabel(s2));
					p1.add(new JLabel(String.valueOf(s3)));
					p1.add(new JLabel(String.valueOf(s4)));
					p1.add(new JLabel(String.valueOf(s5)));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			getContentPane().add(p1);
			done.setEnabled(false);
			setVisible(true);
			setSize(800,800);
		}//if
	}//action
}//frame

class supp_s_p extends JFrame implements ActionListener
{
	String x1,x3;
	int cont=0;
	String s1,s2;
	double s3,s4,s5;
	JLabel item_l=new JLabel("Supplier_Name");
	JComboBox item_c=new JComboBox();
	JButton data1=new JButton("data");
	JButton select=new JButton("select");
	JButton done=new JButton("Done");
	JButton mainMenu=new JButton("Main Menu");
	JButton submit=new JButton("Submit");
	JButton sexit=new JButton("Exit");
	JPanel p1;
	public supp_s_p()
	{
		getContentPane().setLayout(null);
		p1=new JPanel();
		item_l.setBounds(20,30,100,30);
		item_c.setBounds(150,30,150,30);
		data1.setBounds(460,30,60,30);
		select.setBounds(550,30,90,30);
		done.setBounds(650,30,90,30);
		p1.setBounds(10,90,450,100);
		mainMenu.setBounds(20,500,100,30);
		sexit.setBounds(280,500,100,30);
		getContentPane().add(item_l);
		getContentPane().add(item_c);
		getContentPane().add(data1);
		data1.addActionListener(this);
		getContentPane().add(select);
		select.addActionListener(this);
		getContentPane().add(done);
		done.addActionListener(this);
		getContentPane().add(mainMenu);
		mainMenu.addActionListener(this);
		getContentPane().add(sexit);
		sexit.addActionListener(this);
		select.setEnabled(false);
		done.setEnabled(false);
		setTitle("Supplierwise Purchase Report");
		setVisible(true);
		setSize(800,800);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(sexit))
			System.exit(0);
		if(e.getSource().equals(mainMenu))
		{
			setVisible(false);
			try
			{
				getContentPane().add(new MenuFrame());
			}
			catch(Exception p)
			{
				System.out.println("exception"+p);
			}
		}//if
		if(e.getSource().equals(data1))
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				Statement  s=con.createStatement();
				String sql="select sname from supplier";
				ResultSet rs=s.executeQuery(sql);
				while(rs.next())
				{
					item_c.addItem(rs.getString(1));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}	
			data1.setEnabled(false);
			select.setEnabled(true);
		}//if
		if(e.getSource().equals(select))
		{
			x1=(String) item_c.getSelectedItem();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select s_id from supplier where sname=(?)");
				pstmt.setString(1,x1);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					x3=rs.getString(1);
				}//while
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select * from purchase where s_id=(?)");
				pstmt.setString(1,x3);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					cont++;
				}//while
				con.close();
			}//try
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			done.setEnabled(true);
			select.setEnabled(false);
		}//if
		if(e.getSource().equals(done))
		{
			x1=(String) item_c.getSelectedItem();
			String x2;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			}	
			catch(ClassNotFoundException ce)
			{
				System.out.println(ce);
			}
			try
			{
				String url="jdbc:odbc:project";
				Connection con = DriverManager.getConnection(url);
				PreparedStatement pstmt=con.prepareStatement("select *from purchase where s_id=(?)");
				pstmt.setString(1,x3);
				ResultSet rs=pstmt.executeQuery();
				ResultSetMetaData rsmd=rs.getMetaData();
				int cc=5;//rsmd.getColumnCount();
				int rc=cont;//rsmd.getRowCount();
				GridLayout gl=new GridLayout();
				gl.setColumns(cc);
				gl.setRows(rc+1);
				p1.setLayout(gl);
				for(int i=1;i<=5;i++)
				{
					x2=rsmd.getColumnName(i);
					p1.add(new JLabel(x2));
				}
				while(rs.next())
				{
					s1=rs.getString(1);
					s2=rs.getString(2);
					s3=rs.getDouble(3);
					s4=rs.getDouble(4);
					s5=rs.getDouble(5);
					p1.add(new JLabel(s1));
					p1.add(new JLabel(s2));
					p1.add(new JLabel(String.valueOf(s3)));
					p1.add(new JLabel(String.valueOf(s4)));
					p1.add(new JLabel(String.valueOf(s5)));
				}
				con.close();
			}
			catch(SQLException ce)
			{
				System.out.println(ce);
			}
			getContentPane().add(p1);
			done.setEnabled(false);
			setVisible(true);
			setSize(800,800);
		}//if
	}//action
}//frame
