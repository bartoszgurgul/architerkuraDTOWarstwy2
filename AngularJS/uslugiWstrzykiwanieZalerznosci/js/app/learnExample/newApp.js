var app = angular.module('app',[]);

app.factory('Book',function(){
    function Book(title, author, isbn){
        this.title = title;
        this.author =author;
        this.isbn = isbn;
    }
    return Book;
});

app.controller('BookController', function(Book){
    this.books = [
        new Book('Henryk Sienkiewicz', 'Krzyżacy', '123456789'),
        new Book('Adam Mickiewicz', 'Dziady', "1324354657"),
        new Book('Maria Konopnicka', 'Dym', "9786756453")
    ];
    this.addBook = function(book) {
        this.books.push(new Book(book.title, book.author, book.isbn));
    }
})