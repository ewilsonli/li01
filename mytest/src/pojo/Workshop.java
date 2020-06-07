/***********************************************************************
 * Module:  Workshop.java
 * Author:  x1c
 * Purpose: Defines the Class Workshop
 ***********************************************************************/

package pojo;

import java.util.*;

public class Workshop {
   private int workshopid;
   private java.lang.String workshopname;
   
   private java.util.Collection<Worker> works;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Worker> getWorks() {
      if (works == null)
         works = new java.util.HashSet<Worker>();
      return works;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorWorks() {
      if (works == null)
         works = new java.util.HashSet<Worker>();
      return works.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newWorks */
   public void setWorks(java.util.Collection<Worker> newWorks) {
      removeAllWorks();
      for (java.util.Iterator iter = newWorks.iterator(); iter.hasNext();)
         addWorks((Worker)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newWorker */
   public void addWorks(Worker newWorker) {
      if (newWorker == null)
         return;
      if (this.works == null)
         this.works = new java.util.HashSet<Worker>();
      if (!this.works.contains(newWorker))
         this.works.add(newWorker);
   }
   
   /** @pdGenerated default remove
     * @param oldWorker */
   public void removeWorks(Worker oldWorker) {
      if (oldWorker == null)
         return;
      if (this.works != null)
         if (this.works.contains(oldWorker))
            this.works.remove(oldWorker);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllWorks() {
      if (works != null)
         works.clear();
   }

}