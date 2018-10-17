class Pay
{
    private float hours, rate, calcHrs;
    private int hrsStart;
    private double grossPay, tax, grossPayCalc;
    
    public double calc_PayRoll()
    {
        
        if (hrsStart == 0)
        {
            System.out.println(getHours() + " " + getRate());
            System.out.println(hours + " " + rate);
            grossPay = hours*rate;
            System.out.println(grossPay);
        }
        else if (hours > hrsStart)
        {
            grossPayCalc = hours - hrsStart;
            calcHrs = hrsStart;
            grossPay = calcHrs * rate;
            System.out.println(grossPay);
            grossPay += grossPayCalc * (rate*1.33);
            System.out.println(grossPay);
        }
        else if (hours <= hrsStart)
        {
            grossPay = hours * rate;
            System.out.println(grossPay);
        }
        System.out.println(hours + " " + rate + " " + hrsStart);
        return grossPay;
    }
    public double tax(double grossPay)
    {
        System.out.println(grossPay);
        if (grossPay < 400 && grossPay >= 0)
        tax = 0.08;
        else if (grossPay < 900 && grossPay >= 400)
        tax = 0.12;
        else if (grossPay >= 900)
        tax = 0.16;

        return tax;
    }
    public void setHours (float h)
    {
        System.out.println(hours);
        hours = h;
        System.out.println(hours);
    }
    public void setRate(float r)
    {
        System.out.println(rate);
        rate = r;
        System.out.println(rate);
    }
    public void setHrsStr(int hs)
    {
        System.out.println(hrsStart);
        hrsStart = hs;
        System.out.println(hrsStart);
    }
    public float getHours()
    {
        return hours;
    }
    public float getRate()
    {
        return rate;
    }
    public int getHrsStr()
    {
        return hrsStart;
    }
    
    
}