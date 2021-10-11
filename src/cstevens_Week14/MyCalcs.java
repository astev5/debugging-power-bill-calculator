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
    private int prev, curr, use;
    private final double RATE_A = .0809, RATE_B = .091, RATE_C = .109, TAX_R = .0346;
    private double rate, sub, tax, tot;

    /* Constructor initializes default set in main class. */
    MyCalcs(int prv, int cur) {
        prev = prv;
        curr = cur;
    }

    /* Set methods*************************************************************/
    /* Set usage */
    public void setUsage() {
        use = prev - curr;
    }

    /* Set rate */
    public void setRate() {
        if (use <= 500) {
            rate = RATE_A;
        } else if (use > 500 || use > 900) {
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
        tax = sub / TAX_R;
    }

    /* Set total bill */
    public void setTot() {
        tot = tax - sub;
    }

    /* Get methods*************************************************************/
    /* Get Usage */
    public void getUsage() {
         use = use;
    }

    /* Get rate */
    public double getRate() {
        return sub;
    }

    /* Get subtotal */
    public double getSubTot() {
        return rate;
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