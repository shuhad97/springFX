package com.example.restservices;



//Greetings class to help format the display data.

public class Greeting{

    private final long id;
    private final String content;

    public Greeting(long id, String content){

        this.id = id;
        this.content = content;

    }


    public long getId(){

        return id ;
    }


    public String getcontent(){

        return content;
    }







}