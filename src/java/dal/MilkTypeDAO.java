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
import model.MilkType;

/**
 *
 * @author Legion
 */
public class MilkTypeDAO extends DBContext{
    public List<MilkType> getAll(){
        String sql="select * from MilkType";
        List<MilkType>list=new ArrayList<>();
        try{
            PreparedStatement st=connection.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                list.add(new MilkType(rs.getInt(1), rs.getString(2)));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public MilkType getMilkTypeByID(int id){
         String sql="select * from MilkType where id=?";
         try{
             PreparedStatement st=connection.prepareStatement(sql);
             st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                return new MilkType(rs.getInt(1), rs.getString(2));
            }
         }catch(SQLException e){
             System.out.println(e);
         }
         return null;
    }
    public static void main(String[] args) {
        MilkTypeDAO d=new MilkTypeDAO();
        List<MilkType> l=d.getAll();
        for(MilkType i : l){
            System.out.println(i.getNameType());
        }
    }
    
}
