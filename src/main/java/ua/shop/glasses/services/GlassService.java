package ua.shop.glasses.services;

import org.springframework.stereotype.Service;
import ua.shop.glasses.models.Glass;
import ua.shop.glasses.repos.GlassRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GlassService {
    //Provides main operations with DataBase, table 'glass', using JPA.
    //CRUD methods

    private final GlassRepository glassRepository;

    public GlassService(GlassRepository glassRepository) {
        this.glassRepository = glassRepository;
    }

    public Glass addGlass(Glass glass){
        return glassRepository.save(glass);
    }
    public Glass addGlass(String name,
                          String description,
                          int price,
                          String material,
                          Map<String, String> size,
                          ArrayList<String> complect,
                          String image) {
        Glass glass = new Glass(name, description, price, material, size, complect, image);
        System.out.println(glass);
        return glassRepository.save(glass);
    }

    public List<Glass> getAllGlasses(){
        return glassRepository.findAll();
    }

    public Glass getGlass(Long id){
        return glassRepository.findGlassById(id);
    }

    public Glass updateGlass(Glass glassForUpdate){
        //Updating old Glass
        return glassRepository.save(glassForUpdate);
    }

    public Glass updateGlass(Long oldId,
                             String name,
                             String description,
                             int price,
                             String material,
                             Map<String, String> size,
                             ArrayList<String> complect,
                             String image){
        //Updating old Glass
        Glass glass = glassRepository.findGlassById(oldId);
        glass.setName(name);
        glass.setDescription(description);
        glass.setPrice(price);
        glass.setMaterial(material);
        glass.setSize(size);
        glass.setImage(image);
        glass.setComplect(complect);
        return glassRepository.save(glass);
    }


    public void deleteGlass(Long id){
        //Delete Glass from DB
        glassRepository.deleteById(id);
    }
}
