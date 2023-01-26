package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        int valueTotal = 0; // Сумата на всички махнати елементи

        while (!pokemonList.isEmpty()) {
            // Докато листът не се изпразни получавам индекси
            int index = Integer.parseInt(scanner.nextLine());

            int indexOfTheRemovedPokemon = 0;

            if (index >= 0) {

                if (index < pokemonList.size()) {
                    // Ако е валиден индекс го записвам и го махам
                    indexOfTheRemovedPokemon = pokemonList.get(index);
                    pokemonList.remove(index);

                } else {
                    // Ако индексът излиза извън дължината - тук е подвеждащо условието - Greater than the last ...
                    indexOfTheRemovedPokemon = pokemonList.get(pokemonList.size() - 1); // Записвам последния
                    pokemonList.set(pokemonList.size() - 1, pokemonList.get(0));

                }

            } else {
                // Ако е под 0 - невалиден индекс
                indexOfTheRemovedPokemon = pokemonList.get(0); // Записвам първия
                pokemonList.set(0, pokemonList.get(pokemonList.size() - 1));

            }

            valueTotal += indexOfTheRemovedPokemon;
            // Според стойността на премахнатия покомен, методът увеличава
            // или намалява стойностите в списъка
            increaseValueIfGreaterDecreaseIfLessOrEqualByIndexOfTheRemoved(pokemonList, indexOfTheRemovedPokemon);

        }

        System.out.println(valueTotal);

    }

    public static void increaseValueIfGreaterDecreaseIfLessOrEqualByIndexOfTheRemoved(List<Integer> pokemonList, int indexOfTheRemovedPokemon) {

        for (int i = 0; i < pokemonList.size(); i++) {

            if (pokemonList.get(i) <= indexOfTheRemovedPokemon) {

                int toAdd = pokemonList.get(i) + indexOfTheRemovedPokemon;
                pokemonList.set(i, toAdd);

            } else if (pokemonList.get(i) > indexOfTheRemovedPokemon) {

                int toAdd = pokemonList.get(i) - indexOfTheRemovedPokemon;
                pokemonList.set(i, toAdd);

            }

        }

    }

}
