var app = angular.module('app',[]);

app.factory('Book', function(){
    return function Book(title, author, isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
});

app.service('bookService', function(Book) {
    this.books = [
        new Book('Henryk Sienkiewicz', 'Krzyżacy', '123456789'),
        new Book('Adam Mickiewicz', 'Dziady', "1324354657"),
        new Book('Maria Konopnicka', 'Dym', "9786756453")
    ];
    this.saveBook = function(book) {
        this.books.push(book);
    }
});

app.controller('BookController', function (Book, bookService) {
    this.books = bookService.books;
    this.addBook = function(book) {
        bookService.saveBook(new Book(book.title, book.author, book.isbn));
    }
});