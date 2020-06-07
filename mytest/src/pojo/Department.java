/***********************************************************************
 * Module:  Department.java
 * Author:  x1c
 * Purpose: Defines the Class Department
 ***********************************************************************/

package pojo;

import java.util.*;

public class Department {
   private int deptid;
   private java.lang.String deptno;
   private java.lang.String deptname;
   
   private java.util.List<Workshop> workshops;
   
   
   /** @pdGenerated default getter */
   public java.util.List<Workshop> getWorkshops() {
      if (workshops == null)
         workshops = new java.util.ArrayList<Workshop>();
      return workshops;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorWorkshops() {
      if (workshops == null)
         workshops = new java.util.ArrayList<Workshop>();
      return workshops.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newWorkshops */
   public void setWorkshops(java.util.List<Workshop> newWorkshops) {
      removeAllWorkshops();
      for (java.util.Iterator iter = newWorkshops.iterator(); iter.hasNext();)
         addWorkshops((Workshop)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newWorkshop */
   public void addWorkshops(Workshop newWorkshop) {
      if (newWorkshop == null)
         return;
      if (this.workshops == null)
         this.workshops = new java.util.ArrayList<Workshop>();
      if (!this.workshops.contains(newWorkshop))
         this.workshops.add(newWorkshop);
   }
   
   /** @pdGenerated default remove
     * @param oldWorkshop */
   public void removeWorkshops(Workshop oldWorkshop) {
      if (oldWorkshop == null)
         return;
      if (this.workshops != null)
         if (this.workshops.contains(oldWorkshop))
            this.workshops.remove(oldWorkshop);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllWorkshops() {
      if (workshops != null)
         workshops.clear();
   }

}