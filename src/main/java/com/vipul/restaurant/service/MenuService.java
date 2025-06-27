package com.vipul.restaurant.service;

import com.vipul.restaurant.domain.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    public  List<Menu> getMenu(){
        List<Menu> menuList= new ArrayList<>();

        menuList.add(new Menu("Dessert","ABC",10.0));
        menuList.add(new Menu("Dessert","jamm",10.0));
        return menuList;
    }
}
