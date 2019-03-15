package group.kwejk.data;

import group.kwejk.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component // tworzy bina, klase ktorej obiekt bedziemy mogli wstrzykiwac w innej klasie
public class GifRepository {

    public final static List<Gif> ALL_GIFT = Arrays.asList(
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mike", false, 2),
            new Gif("book-dominos", "mem", true, 3),
            new Gif("compiler-bot", "bot", false, 4),
            new Gif("cowboy-coder", "coder", true, 4),
            new Gif("infinite-andrew", "andrew", true, 3)
    );
        // zwykły getter
    public static List<Gif> getAllGift(){
        return ALL_GIFT;
    }

    public static List<Gif> getFavouriteGift() {
        List <Gif> favouritesGis = new ArrayList<>();

        for (Gif value: ALL_GIFT) {
            if (value.getFavorite() == true) {
                favouritesGis.add(value);
            }
        }
        return favouritesGis;
    }

    public static List<Gif> getAllId(int id){
        List<Gif> categoryGifs = new ArrayList<>();
        for (Gif value: ALL_GIFT){
            if (value.getCategoryId() == id){
                categoryGifs.add(value);
            }
        }
        return categoryGifs;
    }
}
