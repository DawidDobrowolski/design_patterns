package adapter.training.api;

import adapter.training.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private final LibraryAPIv2 libraryAPIv2;
    private final User user;

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return libraryAPIv2.numberOfAvailableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());
    }
}
