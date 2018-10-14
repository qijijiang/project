package DI;

public class BookServiceImpl implements Bookservice {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;}
        @Override
        public void addBook(){
            this.bookDao.addBook();

    }
}
