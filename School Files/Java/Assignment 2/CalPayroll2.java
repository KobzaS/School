import java.math.*;

class CalPayroll2
{
    public void acceptPay()
    {
      Screen scr1 = new Screen();
      Accept acc1 = new Accept();
      Assign2 as1 = new Assign2();
      
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
    
      System.out.print("Enter an integer for hours straight or type '0' to disable: ");
      int hrsStr = acc1.AcceptInputInt();
      if (hrsStr < 0)
      {
         hrsStr *= -1;
      }
      
      System.out.print("Enter hourly wage: ");
      double payRt = acc1.AcceptInputDouble();
      if (payRt < 0)
      {
         payRt *= -1;
      }
      
      scr1.scrollScreen('=', 80, 2);
      System.out.println( hrsWrk + " " + hrsStr + " " +  payRt);
   }
}