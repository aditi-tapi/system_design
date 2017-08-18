import com.library.dao.iface.LibraryDao;
import com.library.dao.implem.LibraryDaoImplementation;
import com.library.domain.Books;

public class DaoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryDao librarydao = new LibraryDaoImplementation();
		
		for(Books book : librarydao.getAllBooks())
			System.out.println("book name:" + book.getName() + " " + 
		"book author:" + book.getAuthor() + " " + 
					"book isdn:" +  book.getISDN());
		
		Books book = librarydao.getAllBooks().get(0);
		book.setName("book3");
		librarydao.updateBook(book);
		
		librarydao.getBook(2);
		System.out.println("book name:" + book.getName() + " " + 
				"book author:" + book.getAuthor() + " " + 
							"book isdn:" +  book.getISDN());
		

	}

}
