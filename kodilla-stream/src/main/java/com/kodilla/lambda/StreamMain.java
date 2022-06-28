package com.kodilla.lambda;

import com.kodilla.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getDateOfBirth().getYear() < 2002)
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println(theResultMapOfUsers);
    }
    }
