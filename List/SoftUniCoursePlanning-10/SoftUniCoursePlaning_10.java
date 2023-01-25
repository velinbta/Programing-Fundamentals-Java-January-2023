package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlaning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseList = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            // Разделям input и получавам командата на индекс 0 и първия урок на 1
            String[] inputArr = input.split(":");
            String command = inputArr[0];
            String firstLesson = inputArr[1];

            // Правя си String формат за упражнението на първия урок
            String firstLessonExercise = String.format("%s-Exercise", firstLesson);

            switch (command) {
                case "Add":
                    // Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
                    if (!courseList.contains(firstLesson)) {
                        courseList.add(firstLesson);
                    }
                    break;

                case "Insert":
                    // Insert:{lessonTitle}:{index} -insert the lesson to the given index, if it does not exist
                    int index = Integer.parseInt(inputArr[2]);
                    if (!courseList.contains(firstLesson)) {
                        courseList.add(index, firstLesson);
                    }

                    break;

                case "Remove":
                    // Remove:{lessonTitle} - remove the lesson, if it exists
                    courseList.remove(firstLesson);
                    // Използвам формата създаден отначало, за да махна упражнението, ако има такова
                    courseList.remove(firstLessonExercise);

                    break;

                case "Swap":
                    // Swap:{lessonTitle}:{lessonTitle} - change the place of the two lessons, if they exist
                    String secondLesson = inputArr[2];

                    // Правя си String формат за упражнението на втория урок
                    String secondLessonExercise = String.format("%s-Exercise", secondLesson);

                    // Инициализирам индексите и почвам да проверявам
                    int firstLessonIndex;
                    int secondLessonIndex;
                    // Ако в списъка го има първия и втория урок
                    if (courseList.contains(firstLesson) && courseList.contains(secondLesson)) {

                        // Индексите на уроците:
                        firstLessonIndex = courseList.indexOf(firstLesson);
                        secondLessonIndex = courseList.indexOf(secondLesson);

                        // Индексите на упражненията:
                        int indexOfFirstExercise = courseList.indexOf(firstLessonExercise);
                        int indexOfSecondExercise = courseList.indexOf(secondLessonExercise);

                        // Разменям уроците
                        courseList.set(firstLessonIndex, secondLesson);
                        courseList.set(secondLessonIndex, firstLesson);

                        // Ако упражненията от създадените формати съществуват:
                        if (indexOfFirstExercise != -1) {
                            // Взимам индекса на първия урок
                            firstLessonIndex = courseList.indexOf(firstLesson);
                            // Махам упражнението и го слагам след вече преместения урок
                            courseList.remove(indexOfFirstExercise);
                            courseList.add(firstLessonIndex + 1, firstLessonExercise);

                        }

                        if (indexOfSecondExercise != -1) {
                            // Взимам индекса на втория урок
                            secondLessonIndex = courseList.indexOf(secondLesson);
                            // Махам упражнението и го слагам след вече преместения урок
                            courseList.remove(indexOfSecondExercise);
                            courseList.add(secondLessonIndex + 1, secondLessonExercise);

                        }

                    }

                    break;

                case "Exercise":

                    int indexOfExercise = courseList.indexOf(firstLesson);

                    // Ако го има урока и няма упражнение
                    if (courseList.contains(firstLesson) && !courseList.contains(firstLessonExercise)) {

                        courseList.add(indexOfExercise + 1, firstLessonExercise);

                    } else if (!courseList.contains(firstLesson)) {

                        // Ако няма урок - добавям урок и упражнение накрая на списъка
                        courseList.add(firstLesson);
                        courseList.add(firstLessonExercise);

                    }

                    break;

            }


            input = scanner.nextLine();

        }


        for (int i = 0; i < courseList.size(); i++) {

            System.out.printf("%d.%s%n", i + 1, courseList.get(i));

        }


    }

}
