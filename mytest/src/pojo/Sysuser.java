/***********************************************************************
 * Module:  Sysuser.java
 * Author:  x1c
 * Purpose: Defines the Class Sysuser
 ***********************************************************************/

package pojo;

import java.util.*;

public class Sysuser {
   private int sysuserid;
   private java.lang.String username;
   private java.lang.String password;
   private java.lang.String name;
   
   private java.util.List<Role> roles;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Role> getRoles() {
      if (roles == null)
         roles = new java.util.Vector<Role>();
      return roles;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRoles() {
      if (roles == null)
         roles = new java.util.Vector<Role>();
      return roles.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRoles */
   public void setRoles(java.util.List<Role> newRoles) {
      removeAllRoles();
      for (java.util.Iterator iter = newRoles.iterator(); iter.hasNext();)
         addRoles((Role)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRole */
   public void addRoles(Role newRole) {
      if (newRole == null)
         return;
      if (this.roles == null)
         this.roles = new java.util.Vector<Role>();
      if (!this.roles.contains(newRole))
         this.roles.add(newRole);
   }
   
   /** @pdGenerated default remove
     * @param oldRole */
   public void removeRoles(Role oldRole) {
      if (oldRole == null)
         return;
      if (this.roles != null)
         if (this.roles.contains(oldRole))
            this.roles.remove(oldRole);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRoles() {
      if (roles != null)
         roles.clear();
   }

}