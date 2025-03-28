
package contabanco;

/**
 *
 * @author Manuel Francisco
 */
public class ContaTerminal {

    private int number;
    private String agency;
    private String costumerName;
    private double saldo;

    public ContaTerminal() {
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }

    public String getAgency() {
	return agency;
    }

    public void setAgency(String agency) {
	this.agency = agency;
    }

    public String getCostumerName() {
	return costumerName;
    }

    public void setCostumerName(String costumerName) {
	this.costumerName = costumerName;
    }

    public double getSaldo() {
	return saldo;
    }

    public void setSaldo(double saldo) {
	this.saldo = saldo;
    }

}
