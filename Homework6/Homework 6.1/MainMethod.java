
public class MainMethod {

    public static void main(String[] args) {

        Book book = new Book(10);

        BookPage pageForUpdate = new BookPage("������� �� ����������", 9);
        book.addPage(pageForUpdate);

        book.removePage(5);

        BookPage pageForAdd = new BookPage("���� ��������", 4);
        book.addPage(pageForAdd);

        BookPage page7 = book.getPages().get(7);
        BookPage page8 = book.getPages().get(8);

        book.swapTwoPages(page7, page8);
        book.printBook();
    }
}