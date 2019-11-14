/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_hotel_uni;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reservation_Class {
    
    my_SQL_Connect_Class mysqlconn_reservation_obj1 = new my_SQL_Connect_Class();
    
    public boolean AddingReservation(int guestID, int roomNum, String dateCame, String dateWent)
    {         
        ResultSet RstSt_1 = null;
        String qry = "INSERT INTO `reservations`(`guestID`, `rNumber`, `date_came`, `date_went`) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement PpdSt_1 = mysqlconn_reservation_obj1.devConnect().prepareStatement(qry);
            
            PpdSt_1.setInt(1, guestID);
            PpdSt_1.setInt(2, roomNum);
            PpdSt_1.setString(3, dateCame);
            PpdSt_1.setString(4, dateWent);
            
            
            return (PpdSt_1.executeUpdate()>0);            
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }                
    }
    
    public boolean editingSelectedReservation(int reserID, int guestID, int roomNum, Date dateCame, Date dateWent) 
    {

        ResultSet RstSt_1 = null;
        String qry_editingSelectedGuest = "UPDATE `reservations` SET `guestID`=?,`rNumber`=?,`date_came`=?,`date_went`=? WHERE `id`=?";
        
        try {
            PreparedStatement PpdSt_1 = mysqlconn_reservation_obj1.devConnect().prepareStatement(qry_editingSelectedGuest);
            
            PpdSt_1.setInt(1, reserID);
            PpdSt_1.setInt(2, guestID);
            PpdSt_1.setInt(3, roomNum);
            PpdSt_1.setDate(4, dateCame);
            PpdSt_1.setDate(5, dateWent);
            
            
            return (PpdSt_1.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
    public boolean delReservation(int reserID) 
    {

        ResultSet RstSt_1 = null;
        String qryDELETE = "DELETE FROM `reservations` WHERE `id`=?";
        
        try {
            PreparedStatement PpdSt_1 = mysqlconn_reservation_obj1.devConnect().prepareStatement(qryDELETE);
                        
            PpdSt_1.setInt(1, reserID);
            
            return (PpdSt_1.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
}
