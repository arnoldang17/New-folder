/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author ic
 */
import javax.swing.*;
import java.util.Scanner;

public class Corporation1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Corporation b = new Corporation();
        qwe aaa = new qwe();
        qwe bbb = new qwe();
        
        
        String hours = JOptionPane.showInputDialog("Amount of Hours: ");
        int hours1 = Integer.parseInt(hours);

        String rate = JOptionPane.showInputDialog("Rate per hour: ");
        int rate1 = Integer.parseInt(rate);


        int grosspay = b.Gross_pay(hours1, rate1);
        
        int total_deduction = (int)(b.SSDeduction(grosspay) + b.Pagibig(grosspay) + b.Tax(grosspay));

        int Net_pay = grosspay - total_deduction;

        JOptionPane.showMessageDialog(null, Net_pay);

        
        JOptionPane.showInputDialog("Amount of Hours: ");
        aaa.name = s.nextLine();
        
        
        s.close();
    }

   

}

