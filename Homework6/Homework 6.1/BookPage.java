
final class BookPage extends Page {

    private int pageNumber;

    public BookPage() {
        super();
    }

    public BookPage(String data, int pageNumber) {
        super(data);
        this.pageNumber = pageNumber;
    }

    @Override
    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public boolean equals(Object o) {
        return o != null && o instanceof Page && this.compareTo((Page) o) == 0;

    }

    @Override
    public int compareTo(Page page) {
        if (this.pageNumber == page.getPageNumber()) {
            return 0;
        } else {
            return this.pageNumber < page.getPageNumber() ? -1 : 1;
        }
    }

    @Override
    public void swapPage(Page page) {
        int pageNumber = this.pageNumber;
        super.swapPage(page);

        this.pageNumber = page.getPageNumber();
        ((BookPage) page).pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        String toString = "Съдържание на станица : " + this.getData() + " Номер на страница : " + this.pageNumber;

        return toString;
    }
}
