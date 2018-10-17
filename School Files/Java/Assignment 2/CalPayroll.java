import java.math.*;
import java.text.DecimalFormat;
class CalPayroll extends Pay
{

    public void displayInfo()
    {
        Payroll PR = new Payroll();
        Pay P = new Pay();
        DecimalFormat dollars = new DecimalFormat("##0.00");
        double gp, t, np;
        gp = calc_PayRoll();
        t = tax(gp)*100;
        np = PR.calc_PayRoll();

        System.out.println("Gross pay is : $" + dollars.format(gp));
        System.out.println("Tax is       : " + t + "%");
        System.out.println("Net pay is   : $" + dollars.format(np));

    }
    public void acceptPay()
    {
      Screen scr1 = new Screen();
      Accept acc1 = new Accept();
      Assign2 as1 = new Assign2();
      
      CalPayroll CP1 = new CalPayroll();
      
      System.out.println("Payroll Computation\n");
      System.out.print("Enter number of hours worked or type '-1' to exit: ");
      double hrsWrk = acc1.AcceptInputDouble();
      if (hrsWrk == -1)
      {
         return;
      }
      else if (hrsWrk != -1 && hrsWrk < 0)
      {
         hrsWrk *= -1;
      }
      float flHrsWrk =  (float)hrsWrk;
      setHours(flHrsWrk);
      
      System.out.print("Enter an integer for hours straight or type '0' to disable: ");
      int hrsStr = acc1.AcceptInputInt();
      if (hrsStr < 0)
      {
         hrsStr *= -1;
      }
      setHrsStr(hrsStr);
      System.out.print("Enter hourly wage: ");
      float payRt = acc1.AcceptInputFloat();
      if (payRt < 0)
      {
         payRt *= -1;
      }
      setRate (payRt);
      scr1.scrollScreen('=', 80, 2);
      System.out.println(getRate()+ " " + getHours() + " " + getHrsStr());
      displayInfo();
    }
}