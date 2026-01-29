package features.author.data;

import features.author.domain.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    public ArrayList<Author> authorMenStorage;


    public ArrayList<Author> findAll(){
        Author author1= new Author("1","Extremoduro","01-01-1970","Española");
        authorMenStorage.add(author1);

        Author author2= new Author("2","Oasis","01-01-1980","Inglesa");
        authorMenStorage.add(author2);

        return authorMenStorage;
    }
}
