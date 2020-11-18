package com.tugasPBO;

public class Android extends Handphone {
    private String KeyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore(){
        return KeyStore;
    }

    public void setKeyStore(String keyStore){
        this.KeyStore = keyStore;
    }
}
