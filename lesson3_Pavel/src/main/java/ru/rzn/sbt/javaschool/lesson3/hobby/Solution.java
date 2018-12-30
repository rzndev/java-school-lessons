package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     *
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {
        DetectionResult detectionResult = new DetectionResult();
        if (null == students) return detectionResult;
        for(Object student: students) {
            if (null == student) continue;
            if (!(student instanceof  Student)) continue;
            if (student instanceof  Rockstar)
                detectionResult.setRockstarsCount(detectionResult.getRockstarsCount() + 1);
            else if (student instanceof  Biker)
                detectionResult.setBikersCount(detectionResult.getBikersCount() + 1);
            else if (student instanceof  Student)
                detectionResult.setPureStudentsCount(detectionResult.getPureStudentsCount() + 1);
        }
        return detectionResult;
    }
}
