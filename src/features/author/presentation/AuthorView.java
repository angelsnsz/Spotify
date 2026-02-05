package features.author.presentation;

import features.author.data.AuthorApiLocalDataSource;
import features.author.data.AuthorDataRepository;
import features.author.data.AuthorMemLocalDataSource;
import features.author.domain.Author;
import features.author.domain.GetAuthorsUseCase;

import java.util.ArrayList;

public class AuthorView {

    public void printAuthors() {
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(
                new AuthorDataRepository(
                        new AuthorMemLocalDataSource(),
                        new AuthorApiLocalDataSource()));

        ArrayList<Author> authors =getAuthorsUseCase.execute();
        System.out.println(authors);
    }
}
