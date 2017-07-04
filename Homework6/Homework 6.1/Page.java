abstract class Page implements Comparable<Page> {

    private String data;

    public Page() {

    }

    public Page(String data) {
        this.setData(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void swapPage(Page page) {
        String temp = this.data;
        this.data = page.data;
        page.data = temp;
    }

    public abstract int getPageNumber();

}
