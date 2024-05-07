/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deo;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Tables {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            //  st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumbers varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            // st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumbers,email,username,password,address) values('Admin','Admin','24-11-2002','7758906957','admin@email.com','admin','admin','india')");
          //  st.executeUpdate("create table medicine(medicine_pk int Auto_INCREMENT primary key , uniqueId varchar (200),name varchar (200),companyName varchar (200),quantity bigint,price bigint)");
            st.executeUpdate("create table bill(bill_pk int Auto_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
          JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
