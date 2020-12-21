package booksManagement;

import java.util.ArrayList;
import java.util.List;

public class BookService {
	int j = -1;
	
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		List<Book> bookList = new ArrayList<>();
		Author bookAuthor = new Author();
		for (int i = 0; i < books.length; i++) {
			for (int k = 0; k < books[i].getAuthors().length; k++) {
				bookAuthor = books[i].getAuthors()[k];
				if (author.getId() == bookAuthor.getId()) {
					j++;
					bookList.add(books[i]);
				}
			}
		}
		
		// System.out.println(Arrays.toString(books[i].getAuthors()));
		j = -1;
		return toArray(bookList);
	}


	private Book[] toArray(List<Book> listBook) {
		Book[] bookArr = new Book[listBook.size()];
		return listBook.toArray(bookArr);
	}


		public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
			List<Book> bookList = new ArrayList<>();
			Publisher bookPublisher = new Publisher();
			for (int i = 0; i < books.length; i++) {
				bookPublisher = books[i].getPublisher();
					if (bookPublisher.getId() == publisher.getId()) {
						j++;
						bookList.add(books[i]);
				}
			}		
			return toArray(bookList);
		}

		public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
			List<Book> bookList = new ArrayList<>();
			for (int i = 0; i < books.length; i++) {
					if (books[i].getPublishingYear() == yearFromInclusively) {
						j++;
						bookList.add(books[i]);
				}
			}
			return toArray(bookList);

		}
		
}