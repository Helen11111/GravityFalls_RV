package com.example.gravityfalls_app.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterService {

    public ArrayList<CharacterData> getCharacters() {
        ArrayList<CharacterData> list = new ArrayList<>();

        list.add(new CharacterData("Wendy", "Я рыжая из рода Кордрой!!!",
                "https://clipart-library.com/new_gallery/5-52667_wendy-gravity-falls-png-personajes-de-gravity-falls.png"));
        list.add(new CharacterData("Mabel", "Мы взрослеем и праздников становится все меньше.",
                "https://clipart-library.com/new_gallery/5-52785_mabel-gravity-falls-png-gravity-falls-mabel-cute.png"));
        list.add(new CharacterData("Dipper", "Я не верю людям, у которых начёс больше головы.",
                "https://clipart-library.com/images_k/gravity-falls-transparent/gravity-falls-transparent-7.png"));
        list.add(new CharacterData("Soos", "Подростки опасны. От гормонов они как терминаторы.",
                "https://clipart-library.com/image_gallery/352759.png"));
        list.add(new CharacterData("Bill Cipher", "Слушайте вы, одножизненные, трехразмерные, пятичувственные, обтянутые кожей людишки!",
                "https://clipart-library.com/images_k/gravity-falls-logo-transparent/gravity-falls-logo-transparent-17.png"));
        list.add(new CharacterData("Robby", "Я бы спросил, в чем дело, но вы же ответите. А оно мне нужно?",
                "https://clipart-library.com/images_k/gravity-falls-transparent/gravity-falls-transparent-18.png"));
        list.add(new CharacterData("Waddles", "Хрю... Какой смысл помогать миру, если ты не можешь помочь самому близкому человеку в мире?",
                "https://clipart-library.com/img1/1213566.jpg"));
        list.add(new CharacterData("Stanley Pines", "Пока полиция не видит, всё законно!",
                "https://clipart-library.com/images_k/gravity-falls-transparent/gravity-falls-transparent-22.png"));
        list.add(new CharacterData("Shmebulock", "Шмебьюлок!",
                "https://clipart-library.com/img1/1213557.png"));
        list.add(new CharacterData("Pacifica", "Предупреждаю: если я умру, я вас всех засужу!",
                "https://clipart-library.com/2023/ncE5BdxLi.jpg"));

        return list;
    }

}
