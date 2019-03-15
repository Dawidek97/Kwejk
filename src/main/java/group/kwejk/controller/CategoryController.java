package group.kwejk.controller;

import group.kwejk.data.CategoryRepository;
import group.kwejk.data.GifRepository;
import group.kwejk.model.Category;
import group.kwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategoriesList();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String gifCategry(@PathVariable Integer id, ModelMap modelMap){
        List<Gif> gifs = gifRepository.getAllId(id);
        modelMap.put("gifs",gifs);
        modelMap.put("category", categoryRepository.getCategoryById(id));
        return "category";
    }

}
