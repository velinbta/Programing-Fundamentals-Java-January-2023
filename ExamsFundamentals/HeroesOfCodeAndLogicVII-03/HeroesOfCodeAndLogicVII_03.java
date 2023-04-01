package ExamsFundamentals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heroesLines = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroesHitPointsMap = new LinkedHashMap<>();
        Map<String, Integer> heroesManaPointsMap = new HashMap<>();

        for (int i = 0; i < heroesLines; i++) {
            // Извличам данните и попълвам двата Map-а
            String[] infoArr = scanner.nextLine().split("\\s+");
            String hero = infoArr[0];
            int hitPoints = Integer.parseInt(infoArr[1]);
            int manaPoints = Integer.parseInt(infoArr[2]);

            heroesHitPointsMap.putIfAbsent(hero, hitPoints);
            heroesManaPointsMap.putIfAbsent(hero, manaPoints);

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] infoArr = input.split("\\s*-\\s*");
            String command = infoArr[0];
            String heroName = infoArr[1];

            if (heroesHitPointsMap.containsKey(heroName)) { // <- Ако изобщо ми дават съществуващ герой

                switch (command) {

                    case "CastSpell": {

                        int magicPointsNeeded = Integer.parseInt(infoArr[2]);
                        String spellName = infoArr[3];

                        // Ако след кастването ще му остане >=0 - MP
                        boolean canCastSpell = heroesManaPointsMap.get(heroName) - magicPointsNeeded >= 0;

                        if (canCastSpell) { // <- Ако може да кастне
                            // Намалям му MP
                            heroesManaPointsMap.put(heroName, heroesManaPointsMap.get(heroName) - magicPointsNeeded);

                            System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                                    heroName, spellName, heroesManaPointsMap.get(heroName));

                        } else { // <- Ако не може да кастне

                            System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);

                        }

                        break;

                    } case "TakeDamage": {

                        int damage = Integer.parseInt(infoArr[2]);
                        String attack = infoArr[3];

                        // Ако след атаката ще оцелее
                        boolean isAlive = heroesHitPointsMap.get(heroName) - damage > 0;

                        if (isAlive) { // <- Ако е жив

                            // Намалям му HP
                            heroesHitPointsMap.put(heroName, heroesHitPointsMap.get(heroName) - damage);

                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                                    heroName, damage, attack, heroesHitPointsMap.get(heroName));


                        } else { // <- Ако e убит

                            // Бива премахнат от маповете
                            System.out.printf("%s has been killed by %s!\n", heroName, attack);
                            heroesHitPointsMap.remove(heroName);
                            heroesManaPointsMap.remove(heroName);

                        }

                        break;

                    } case "Recharge": {

                        int amount = Integer.parseInt(infoArr[2]);

                        // Ако надскача лимита от 200MP
                        boolean isAboveLimitOf200 = heroesManaPointsMap.get(heroName) + amount > 200;

                        if (isAboveLimitOf200) { // <- Ако ги надскача

                            // Пресмятам колко може да побере и му задавам максимума от 200
                            int actualAmountOfRecharge = 200 - heroesManaPointsMap.get(heroName);
                            System.out.printf("%s recharged for %d MP!\n", heroName, actualAmountOfRecharge);

                            heroesManaPointsMap.put(heroName, 200);

                        } else { // <- Ако може да ги побере

                            System.out.printf("%s recharged for %d MP!\n", heroName, amount);
                            // Добавям му всичките
                            heroesManaPointsMap.put(heroName, heroesManaPointsMap.get(heroName) + amount);

                        }


                        break;

                    } case "Heal": {

                        int amount = Integer.parseInt(infoArr[2]);

                        // Ако надскача лимита от 100HP
                        boolean isAboveLimitOf100 = heroesHitPointsMap.get(heroName) + amount > 100;

                        if (isAboveLimitOf100) { // <- Ако ги надскача

                            // Пресмятам колко може да побере и му задавам максимума от 100
                            int actualAmountOfHeal = 100 - heroesHitPointsMap.get(heroName);
                            System.out.printf("%s healed for %d HP!\n", heroName, actualAmountOfHeal);

                            heroesHitPointsMap.put(heroName, 100);


                        } else { // <- Ако може да ги побере

                            System.out.printf("%s healed for %d HP!\n", heroName, amount);
                            // Добавям му всичките
                            heroesHitPointsMap.put(heroName, heroesHitPointsMap.get(heroName) + amount);

                        }

                        break;

                    }

                }

            }

            input = scanner.nextLine();

        }

        heroesHitPointsMap.entrySet().forEach(hero ->
                System.out.printf("%s\n  HP: %d\n  MP: %d\n", hero.getKey(), hero.getValue(),
                        heroesManaPointsMap.get(hero.getKey())));

    }

}
