var app = angular.module('app',[]);

app.controller('ClickController', function(){
    this.header='Header przed zmianami';
    this.changeHeader=function(){
        this.header=this.textInput;
    }
    this.headerClick= function(){
        this.header=this.header.toUpperCase();
    }
});