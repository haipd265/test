/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import model.Account;
import model.CartMilk;
import model.Item;
import model.Milk;

/**
 *
 * @author Legion
 */
public class OrderDAO extends  DBContext{
    public void addOrder(Account a, CartMilk cart){
        LocalDate curDate=java.time.LocalDate.now();
        String date=curDate.toString();
        try{
            //add to orders
            String sql="insert into orders values(?,?,?)";
            PreparedStatement st=connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, date);
            st.setDouble(3, cart.getTotalMoney());
            st.executeUpdate();
            String sql1="select top 1 o_id from orders order by o_id desc";
            PreparedStatement st2=connection.prepareStatement(sql1);
            ResultSet rs=st2.executeQuery();
            if(rs.next()){
                int o_id=rs.getInt(1);
                for (Item i:cart.getItems()) {
                    String sql2="insert into orderProducts values(?,?,?,?)";
                    PreparedStatement st3=connection.prepareStatement(sql2);
                    st3.setInt(1, o_id);
                    st3.setString(2, i.getProduct().getId());
                    st3.setInt(3, i.getQuantity());
                    updateQuanity(i.getQuantity(), i.getProduct());
                    st3.setDouble(4, i.getPrice());
                    st3.executeUpdate();
                }
            }
            //thu
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void updateQuanity(int buyQuantity, Milk milkUpdate){
        try{
            String sql="update Milk set quantity=? where id=?";
            PreparedStatement st=connection.prepareStatement(sql);
            st.setInt(1, milkUpdate.getQuantity()-buyQuantity);
            st.setString(2, milkUpdate.getId());
            st.executeUpdate();         
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
