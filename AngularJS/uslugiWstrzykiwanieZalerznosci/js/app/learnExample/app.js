var app = angular.module('app',[]);

app.controller('BookController', function(){
    function Book(title, author, isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    this.books = [
        new Book('Henryk','Krzyzacy','1234567'),
        new Book('Adam','Dziady','098765'),
        new Book('Maria','Dym','5463728')
    ];
    this.addBook = function(book){
        this.books.push(new Book(book.title, book.author, book.isbn));
    }
})