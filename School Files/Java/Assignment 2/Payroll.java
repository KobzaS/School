class Payroll extends Pay
{
    double netPay, grossPay, tax;
    public double calc_PayRoll()
    {
        grossPay = super.calc_PayRoll();
        System.out.println(grossPay+ " afsdagf");
        grossPay = 400;

        tax = tax(grossPay);

        System.out.println(tax);

        tax = 1 - tax;

        netPay = grossPay * tax;

        return netPay;
    }
}