/* SDEV 250 ~ Java Programming I
 * Author Name: steven.hickey
 * Assignment Name: week14debug
 * Date: Oct 1, 2014
 * Description: Subclass for debugging exercise
                Based on Week 6 Assignment

 */
package cstevens_Week14;

/* Begin Class MyCalcs */
public class MyCalcs {

    /* Variable declarations */
    private double prv;
    private double cur;
    private double use;
    private final double RATE_A = .0809;
    private final double RATE_B = .091;
    private final double RATE_C = .109;
    private final double TAX_R = .0346;
    private double rate;
    private double sub;
    private double tax;
    private double tot;

    /* Constructor initializes default set in main class. */
    MyCalcs(double prev, double curr) {
        prv = prev;
        cur = curr;
    }

    /* Set methods*************************************************************/
    /* Set usage */
    public void setUsage() {
        use = cur - prv;
    }

    /* Set rate */
    public void setRate() {
        if (use <= 500) {
            rate = RATE_A;
        } else if (use > 500 && use < 900) {
            rate = RATE_B;
        } else {
            rate = RATE_C;
        }
    }

    /* Set subtotal */
    public void setSubTot() {
        sub = use * rate;
    }

    /* Set taxes */
    public void setTax() {
        tax = sub * TAX_R;
    }

    /* Set total bill */
    public void setTot() {
        tot = tax + sub;
    }

    /* Get methods*************************************************************/
    /* Get Usage */
    public double getUsage() {
         return use;
    }

    /* Get rate */
    public double getRate() {
        return rate;
    }

    /* Get subtotal */
    public double getSubTot() {
        return sub;
    }

    /* et taxes */
    public double getTax() {
        return tax;
    }

    /* Get total */
    public double getTot() {
        return tot;
    }

} /* End Class MyCalcs */