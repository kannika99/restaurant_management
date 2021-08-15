/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOResturant;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yadhumsd
 */
public class SuperClass {
    
    public double ChickenM;
    public double BBQBurger;
    public double SausageOml;
    public double Waffles;
   
    public double Coffee;
    public double MeltMocha;
    public double IceTea;
    public double ChocolateShake;
        
    public double Meals;
    public double Drinks;
    public double totalofMD;
    public double AllTotalofMD;
    
    public double GetAmount(){
        Meals=ChickenM+ BBQBurger+SausageOml+Waffles;
        Drinks=Coffee+MeltMocha+IceTea+ChocolateShake;
        totalofMD=Meals+Drinks;
        AllTotalofMD=totalofMD;        
        System.out.println(AllTotalofMD);

        return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        
    frame=new JFrame("Exit");
    if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Restuarnt Management System-Melt in Cafe",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }
}
    //=========================Price========================
    public double pChickenM=60;
    public double pBBQBurger=100;
    public double pSausageOml=150;
    public double pWaffles=80;
   
    public double pCoffee=120;
    public double pMeltMocha=70;
    public double pIceTea=40;
    public double pChocolateShake=40;
    //======================================================
    //Add GST: GST Amount = (Original Cost x GST%)/100. Net Price = Original Cost + GST Amount.
    public double gst=0;
    public Double cFindTax(double gst){
        double FindTax=0;
        System.out.println(AllTotalofMD);

        return FindTax;
        
        
    }
    
}

