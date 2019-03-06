package com.fanqiang.sophon.engine.camel;

public class OrderService {

    public String order(){
        return "order service";
    }

    public String validate(String orderContent){
        return String.format("%s order validate result %s",orderContent,true);
    }

}
