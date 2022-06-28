package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theListOfUsers = new ArrayList<>();
    public Forum(){
        theListOfUsers.add(new ForumUser(5558,"Anna",'F', LocalDate.of(1999, 2, 5), 8));
        theListOfUsers.add(new ForumUser(1514,"Karol",'M', LocalDate.of(1980, 12, 12), 2));
        theListOfUsers.add(new ForumUser(1212,"Marcelina",'F', LocalDate.of(1969, 10, 12), 4));
        theListOfUsers.add(new ForumUser(8544,"Artur",'M',  LocalDate.of(1979, 4, 27), 8));
    }

    public List<ForumUser> getUserList() {
        return theListOfUsers;
    }
}
