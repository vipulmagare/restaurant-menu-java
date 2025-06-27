package com.vipul.restaurant.controller;

import com.vipul.restaurant.domain.Menu;
import com.vipul.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/menu", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuController {

    @Autowired
    private MenuService  menuService;

    @GetMapping("MenuId")
    public String getMenu1()
    {
        return "hhh";
    }

    @GetMapping("/all")
    public List<Menu> getMenu()
    {
       return menuService.getMenu();
    }

    @GetMapping("/filter")
    public Menu getMenuFilter()
    {
        return menuService.getMenu().get(0);
    }


    @GetMapping("/single")
    public Menu getMenuOne()
    {
        return menuService.getMenu().get(0);
    }

    @GetMapping("/welcome")
    public String welcomeUser() {
        return "Welcome to the Menu!";
    }

    @GetMapping("/hardcoded")
    public Menu getHardMenu() {
        return new Menu("Paneer Butter Masala", "veg", 180);
    }



    @PostMapping
    public void saveMenu(@RequestBody Menu menu)
    {
        System.out.println(menu);

    }





//    @GetMapping
//    @ResponseBody
//    public ResponseEntity<Menu> getMenu()
//    {
//        return  ResponseEntity.ok(new Menu("Dessert","ABC",10.0));
//    }
}
