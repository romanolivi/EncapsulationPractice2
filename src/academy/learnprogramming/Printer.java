package academy.learnprogramming;

public class Printer {
    private int toner;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int toner, boolean duplex) {
        if(toner > -1 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1;
        }
        this.toner = toner;
        this.duplex = duplex;
    }

    public int addToner(int amount) {
        if(toner > 0 && amount <= 100) {
            if(this.toner + amount > 100) {
                return -1;
            } else {
                this.toner += amount;
                return this.toner;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}







