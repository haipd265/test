/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Account;
import model.Milk;

/**
 *
 * @author Legion
 */
public class Edit extends DBContext {

    public void update(Milk m) {
        String sql = "UPDATE Milk SET id=?, name=?, quantity=?, price=?, describe=?, published=?, typeid=?, img=?\n"
                + " WHERE id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, m.getId());
            st.setString(2, m.getName());
            st.setInt(3, m.getQuantity());
            st.setDouble(4, m.getPrice());
            st.setString(5, m.getDescribe());
            st.setString(6, m.getPublished());
            st.setInt(7, m.getTypeID());
            st.setString(8, m.getImg());
            st.setString(9, m.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void editAccount(Account a) {
        String sql = "UPDATE Account set address=?,email=?,phone=?,logo=? where username=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getAddress());
            st.setString(2, a.getEmail());
            st.setString(3, a.getPhone());
            st.setString(4, a.getLogo());
            st.setString(5, a.getUsername());
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
//        DAO d=new DAO();
//        Account x=d.getAccount("sa");
//        x.setLogo("ahaha");
//        Edit ed=new Edit();
//        ed.editAccount(x);
        String a="123";
        String b="123";
        if(a.compareTo(b)==0){
            System.out.println("Success");
        }else{
            System.out.println("False");
        }
    }
}
