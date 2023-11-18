public interface BookRepository {
    Book findById(int id);
    List<Book> findAll();
    void save(Book book);
    void delete(int id);
}
