import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    private BookRepository mockRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testFindBookById() {
        int bookId = 1;
        Book expectedBook = new Book(bookId, "Test Book");
        when(mockRepository.findById(bookId)).thenReturn(expectedBook);
        Book actualBook = bookService.findBookById(bookId);
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void testFindAllBooks() {
        List<Book> expectedBooks = Arrays.asList(
                new Book(1, "Book 1"),
                new Book(2, "Book 2"),
                new Book(3, "Book 3")
        );
        when(mockRepository.findAll()).thenReturn(expectedBooks);
        List<Book> actualBooks = bookService.findAllBooks();
        assertEquals(expectedBooks, actualBooks);
    }

    @Test
    public void testAddBook() {
        Book newBook = new Book(1, "New Book");
        bookService.addBook(newBook);
        verify(mockRepository).save(newBook);
    }

    @Test
    public void testRemoveBook() {
        int bookId = 1;
        bookService.removeBook(bookId);
        verify(mockRepository).delete(bookId);
    }

    @Test
    public void testCompareAverage_ListsWithDifferentNumberOfElements() {
        List<Integer> list1 = List.of(10, 20, 30);
        List<Integer> list2 = List.of(5, 15, 25, 35);

        double result = CompareAverage.calculateAverage(list1);
        assertEquals(20.0, result, 0.001);

        result = CompareAverage.calculateAverage(list2);
        assertEquals(20.0, result, 0.001);

        String message = CompareAverage.compareAverages(list1, list2);
        assertEquals("Средние значения равны", message);
    }
}
