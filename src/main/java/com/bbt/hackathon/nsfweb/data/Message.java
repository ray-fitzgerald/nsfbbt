package com.bbt.hackathon.nsfweb.data;

public class Message {
    
    private String text;
    private String attribution;
    
    public Message(String text, String attribution) {
        this.text = text;
        this.attribution = attribution;        
    }
    
    public String getText() {        
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getAttribution() {        
        return attribution;
    }
    
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }
}


