package features.author.data;

import features.author.domain.Author;
import features.author.domain.AuthorRepository;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource authorMemLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource) {
        this.authorMemLocalDataSource = authorMemLocalDataSource;
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return null;
    }


}
