/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Legion
 */
public class MilkType {
    private int typeid;
    private String nameType;

    public MilkType() {
    }

    public MilkType(int typeid, String nameType) {
        this.typeid = typeid;
        this.nameType = nameType;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
    
}
