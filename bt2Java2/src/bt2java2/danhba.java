/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2java2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class danhba{
    ArrayList<phone> phoneLi = new ArrayList<phone>();
  
    // thêm số dt vào list
    public phone addPhone(phone user){
           int id = 0;
           if (phoneLi != null && !phoneLi.isEmpty()) {
            id = phoneLi.size() + 1;
        }
             phoneLi.add(user);
             return phoneLi.get(id);
    }
    // lấy id
    public int layid(phone user){
        for(int i = 0; i < phoneLi.size(); i++){
             if(phoneLi.get(i).sdt.equals(user.sdt)){
                 return i;
             }
        }return -1;
    }
    //sửa
    public void edit(phone user){
        for(int i = 0; i < phoneLi.size(); i++){
            if(phoneLi.get(i).sdt.equals(user.sdt)){
           
               phoneLi.get(i).setHoten(user.hoten);
               phoneLi.get(i).setSdt(user.sdt);
                phoneLi.get(i).setEmai(user.emai);
                break;
            }
        }
    }
    //xóa
    
    public boolean del(phone user){
        boolean isFound = false;
       for ( int i = 0; i < phoneLi.size(); i++){
           if(phoneLi.get(i).sdt.equals(user.sdt)){
               user = phoneLi.get(i);
               isFound = true;
               break;
           }
       }
       if(isFound){
           phoneLi.remove(user);
           return true;
       }
       return false;
    }
    
}
