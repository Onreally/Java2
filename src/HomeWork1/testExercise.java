package HomeWork1;

public class testExercise {
    public static void main(String[] args) {
        JumpRun[] jumpRuns = {
                new Cat(),
                new Robot(),
                new Human(),
        };
        Exercise[] exercises = {
                new Wall(),
                new Road(),
        };
        // Проверка на прыжки
        for (int i = 0; i < jumpRuns.length; i++) {
            for (int j = 0; j < exercises.length; j++) {
                jumpRuns[i].jump(exercises[j].getInfo());
            }

        }
        System.out.println(); // пропуск строки для "красоты"
        // далее проверка на способность пробежать
        for (int i = 0; i < jumpRuns.length; i++) {
            for (int j = 0; j < exercises.length; j++) {
                jumpRuns[i].run(exercises[j].getInfo());
            }

        }
    }
}


