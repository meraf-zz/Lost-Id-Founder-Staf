/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder_for_staf;

/**
 *
 * @author pro
 */
public class Registrar {
    
   public String search(String keyword){
       return "";
   }
   public String getRequest(){
       return "";
   }
   public String getPending(){
       return "";
   }
   
   public void sendNotification(String id, String description){
       DatabaseQuery db=new DatabaseQuery();
       db.insertNotification(id, description);
       
   }
   public void upload(String id, String description){
      DatabaseQuery db=new DatabaseQuery();
      db.upload(id, description);
   }
   
    
}
