package ua.shop.glasses.controllers;


import org.springframework.web.bind.annotation.*;
import ua.shop.glasses.models.Glass;
import ua.shop.glasses.services.GlassService;

import java.util.List;

@RestController
@RequestMapping("/glasses")
public class GlassController {

    private final GlassService glassService;

    public GlassController(GlassService glassService) {
        this.glassService = glassService;
    }


    //########################## GLASS CRUD ################################

    @GetMapping()
    public List<Glass> getGlasses(){
        //Get All Glasses
        return glassService.getAllGlasses();
    }

    @GetMapping("/{id}")
    public Glass getGlass(@PathVariable Long id){
        //Get glass by id
        return glassService.getGlass(id);
    }

    @PostMapping("/addGlass")
    public String addGlass(@RequestBody Glass glass){
        System.out.println(glass);
        glassService.addGlass(glass);
        return "redirect:/";
    }

    @PutMapping("/updateGlass")
    public String updateGlass(@RequestBody Glass glass){
        System.out.println("UPDATING");

        glassService.updateGlass(glass);
        return "redirect:/";
    }
}
