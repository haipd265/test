/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author Legion
 */
public class DAO extends DBContext {

    public Account login(String user, String pass) {
        String sql = "select * from Account where username=? and password=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Account> getAll() {
        List<Account> list = new ArrayList<>();
        try {
            String sql = "select * from Account";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public boolean checkUser(String x) {
        DAO d = new DAO();
        List<Account> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if (x.equals(list.get(i).getUsername())) {
                return true;
            }
        }
        return false;
    }

    public void register(Account a) {
        try {
            String sql = "insert into Account values(?,?,?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, a.getPass());
            st.setString(3, a.getAddress());
            st.setString(4, a.getEmail());
            st.setString(5, a.getPhone());
            st.setString(6, a.getLogo());
            st.setInt(7, a.getRole());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void changePass(String newPass, String username){
        try{
            String sql="update Account set password=? where username=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newPass);
            st.setString(2, username);
            st.executeUpdate();
        }catch(SQLException e){
            
        }
    }
    public Account getAccount(String tk) {
        try {
            String sql = "select *from Account where username=?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, tk);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
//        DAO d = new DAO();
//        String a = "hai";
//        String pass = "123";
//        Account ac = d.login(a, pass);
//        if (ac != null) {
//            System.out.println("Err");
//        } else {
//            d.register(new Account("thanh", "123", "haha", "hoho", "013589446", "wind", 0));
//            System.out.println("Success");
//        }
//        try {
//                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//                sdf.setLenient(false);
//                Date date = sdf.parse("23-02-2022");
//                Date now=sdf.format(new Date());
//                System.out.println(sdf.format(date)); 
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date now=new Date();
            System.out.println("bay gio -"+now);
            String ss="2022-10-03";
            Date date1=df.parse(ss);
            System.out.println("so sanh -"+date1);
            if(now.compareTo(date1)>0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
