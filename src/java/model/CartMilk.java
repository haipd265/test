/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.MilkList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Legion
 */
public class CartMilk {
    private List<Item> items;   
    public CartMilk() {
        items=new ArrayList<>();
    }

    public CartMilk(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    private Item getItemById(String id){
        for(Item i : items){
            if(i.getProduct().getId().equals(id)){
                return i;
            }
        }
        return null;
    }
    public int getQuantityById(String id){
        return getItemById(id).getQuantity();
    }
    //add Item
    public void addItem(Item t){
        //exist
        if(getItemById(t.getProduct().getId())!=null){
            Item i=getItemById(t.getProduct().getId());
            i.setQuantity(i.getQuantity()+t.getQuantity());
        }else{
            items.add(t);
        }
    }
    
    public void removeItem(String id){
        if(getItemById(id)!=null){
            items.remove(getItemById(id));
        }
    }
    public double getTotalMoney(){
        double t=0;
        for (Item i:items) {
            t+=i.getPrice()*i.getQuantity();
        }
        return t;
    }
    
    public static void main(String[] args) {
        MilkList d=new MilkList();
        Milk k=d.getProductByID("C1");
        Item i=new Item(k, 3, k.getPrice()*3);
        CartMilk cart=new CartMilk();
        cart.addItem(i);
        List<Item> list=cart.getItems();
        System.out.println(list.get(0).getProduct().getName());
        System.out.println(list.size());
        
    }
}
