angular.module('app')
.controller('BookController', function (Book, bookService, appName, appVersion) {
    this.appName = appName;
    this.version = appVersion;
    this.books = bookService.books;
    this.addBook = function(book) {
        bookService.saveBook(new Book(book.title, book.author, book.isbn));
    }
});