package group.kwejk.controller;

import group.kwejk.data.GifRepository;
import group.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifts(ModelMap modelMap){
        List<Gif> gifs = gifRepository.getAllGift();
        modelMap.put("gifs", gifs);
        return "home";
    }

    @RequestMapping("/favorites")
    public  String getFavouriteGifts(ModelMap modelMap){
        List<Gif> gifs = gifRepository.getFavouriteGift();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
