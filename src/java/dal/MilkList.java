/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Item;
import model.Milk;
import model.orderProducts;
import model.orders;

/**
 *
 * @author Legion
 */
public class MilkList extends DBContext {

    public List<Milk> getAll() {
        String sql = "select * from Milk";
        List<Milk> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Milk(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4) * 1.2, rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Milk> getAllWithCondition(int x) {
        String sql = "select * from Milk";
        if(x==1){
            sql+=" order by price desc";//giam dan
        }else if(x==2){
            sql+=" order by price asc";//tang dan
        }
        List<Milk> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Milk(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4) * 1.2, rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Milk> getListByID(int id) {
        String sql = "SELECT * FROM dbo.Milk WHERE typeid=?";
        List<Milk> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Milk(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4) * 1.2, rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Milk> getListByPage(List<Milk> list, int start, int end) {
        ArrayList<Milk> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    
    public List<orders> getOrderByPage(List<orders> list, int start, int end) {
        ArrayList<orders> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    
            
    public List<Item> getItemByPage(List<Item> list, int start, int end) {
        ArrayList<Item> arr = new ArrayList<>();
        for (int i = start; i < end; i++) {
            arr.add(list.get(i));
        }
        return arr;
    }
    
    public List<Milk> searchProductByKeyword(String keyword) {
        String sql = "select * from Milk where name like ?";
        List<Milk> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + keyword + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Milk(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4) * 1.2, rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Milk> checkBox(int[] id) {
        String sql = "select * from Milk where 1=1";
        List<Milk> list = new ArrayList<>();
        if (id != null) {
            sql += " and typeid in(";
            for (int i = 0; i < id.length; i++) {
                sql += id[i] + ",";
            }
            if (sql.endsWith(",")) {
                sql = sql.substring(0, sql.length() - 1);
                sql += ")";
            }
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Milk(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4) * 1.2, rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Milk> top5() {
        String sql = "with t as(\n"
                + "select m.id,m.name,m.price,m.describe,m.img,m.typeid,sum(op.quantity) as quantity from Milk m join orderProducts op\n"
                + "on m.id=op.id join orders o on o.o_id=op.o_id \n"
                + "where (o.OrderDate>GETDATE()-30)\n"
                + "GROUP BY m.id,m.name,op.quantity,m.quantity,m.price,m.describe,m.img,m.typeid)\n"
                + "select top(5)id,name,price,describe,img,typeid,quantity from t order by quantity desc";
        List<Milk> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Milk(rs.getString(1), rs.getString(2), rs.getInt(7), rs.getDouble(3) * 1.2, rs.getString(4), "", rs.getInt(6), rs.getString(5)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Milk getProductByID(String id) {
        Milk m = new Milk();
        String sql = "select * from Milk where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Milk(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4) * 1.2, rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public void insert(Milk m) {
        String sql = "insert into Milk values(?,?,?,?,?,?,?,?)";
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
            st.executeUpdate();
            System.out.println("thanh cong");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void delete(String key) {
        String sql = "delete from Milk where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, key);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<orders> getCusOrder(String start, String end) {
        List<orders> list = new ArrayList<>();
        String sql = "select * from orders where 1=1";
        if (start != null && end != null) {
            sql += " and OrderDate in('" + start + "','" + end + "')";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new orders(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<orders> getOrderofCus(String user) {
        List<orders> list = new ArrayList<>();
        String sql = "select * from orders where username=?";

        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new orders(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<Item> getDetailOrders(int id){
        List<Item> list=new ArrayList<>();
        String sql="select * from orderProducts where o_id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Milk x=getProductByID(rs.getString(2));
                list.add(new Item(x, rs.getInt(3), rs.getDouble(4)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public static void main(String[] args) {
        MilkList l = new MilkList();
//        List<orders> list = l.getCusOrder("20220315", "20220315");
//        List<Item> list2=l.getDetailOrders(8);
//        System.out.println(list2.get(0).getProduct());
//        System.out.println(list2.get(1).getQuantity());
        List<Milk> list=l.getAll();
        System.out.println(list.get(0).getName());
    }
}
